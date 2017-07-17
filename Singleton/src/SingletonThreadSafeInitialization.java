/**
 * Created by gunny on 2017. 7. 17..
 *
 * StaticBlock 문제를 해결하기 위해 synchronize(동기화)를 사용하여 singleton pattern을 구현한다.
 *
 * 여러 thread들이 동시에 접근해서 인스턴스를 생성시키는 위험은 없어졌다.
 *
 * 하지만 수 많은 thread 들이 getInstance() method를 호출하게 되면 높은 cost 비용으로 성능저하가 일어남.
 */
public class SingletonThreadSafeInitialization {
    private static SingletonThreadSafeInitialization instance;
    private SingletonThreadSafeInitialization() { }

    public static synchronized SingletonThreadSafeInitialization getInstance() {
        if(instance == null) {
            instance = new SingletonThreadSafeInitialization();
        }
        return instance;
    }

    public void print() {
        System.out.println("It's print() method in ThreadSafeInitialization instance.");
        System.out.println("instance hashCode > " + instance.hashCode());
    }
}
