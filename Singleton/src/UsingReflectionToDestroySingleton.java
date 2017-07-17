import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Constructor;

/**
 * Created by gunny on 2017. 7. 17..
 *
 * reflection을 이용하여 singleton을 꺠뜨려 보는 법도 배워보자. 누군가 작성한 코드를 원본 수정 없이 작업해야
 * 할 때 이용될 수 있을 것이다.
 */
public class UsingReflectionToDestroySingleton {
    public static void main(String[] args) {
        SingletonEagerInitialization instance = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization instance2 = null;

        try {
            Constructor[] constructors = SingletonEagerInitialization.class.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instance2 = (SingletonEagerInitialization)constructor.newInstance();
            }
        } catch(Exception e) {

        }
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
