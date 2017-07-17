/**
 * Created by gunny on 2017. 7. 17..
 *
 * Singleton 이란 ?
 *
 * Singleton pattern은 인스턴스가 사용될 떄에 똑같은 인스턴스를 만들어 내는 것이 아니라.
 * 동일 인스턴스를 재사용하게끔 하는 것이 기본 전략이다. 프로그램 상에서 동일한 커넥션 객체를 만든다던지,
 * 하나만 사용되어야 하는 객체를 만들 때 유용하다.
 */
public class Singleton {
    public static void main(String[] args) {
        SingletonEagerInitialization sE1 = SingletonEagerInitialization.getInstance();
        sE1.print();
        SingletonEagerInitialization sE2 = SingletonEagerInitialization.getInstance();
        sE2.print();

        SingletonStaticBlockInitialization sB1 = SingletonStaticBlockInitialization.getInstance();
        sB1.print();

        SingletonLazyInitialization sL1 = SingletonLazyInitialization.getInstance();
        sL1.print();

        SingletonThreadSafeInitialization sT1 = SingletonThreadSafeInitialization.getInstance();
        sT1.print();

        SingletonInitOnDemandHolder sH1 = SingletonInitOnDemandHolder.getInstance();

        SingletonEnumInitialization sE3 = SingletonEnumInitialization.getInstance();
        System.out.println(sE3.test);

    }
}
