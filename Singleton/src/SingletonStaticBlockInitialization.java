/**
 * Created by gunny on 2017. 7. 17..
 * static 초기화 블럭을 이용하면 클래스가 로딩 될 때 최초 한번 실행하게 된다.
 *
 * 특히나 초기화 블럭을 이용하면 logic을 담을 수 있기 떄문에 복잡한 초기변수 셋팅이나 위와 같이 에러처리를 위한 구문을
 * 담을 수 있다. 첫 번째 패턴보다 좋아보이지만 인스턴스가 사용되는 시점에 생성되는 것은 아니다.
 */
public class SingletonStaticBlockInitialization {
    private static SingletonStaticBlockInitialization instance;
    private SingletonStaticBlockInitialization() {}

    // 복잡한 초기변수 셋팅이나 에러처리를 위한 구문을 담을 수 있다.
    static {
        try {
            System.out.println("instance create..");
            instance = new SingletonStaticBlockInitialization();
        } catch(Exception e) {
            throw new RuntimeException("Exception creating SingletonStaticBlockInitialization instance.");
        }
    }

    public static SingletonStaticBlockInitialization getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("It's print() method in SingletonStaticBlockInitialization instance.");
        System.out.println("instance hashCode > " + instance.hashCode());
    }
}
