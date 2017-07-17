/**
 * Created by gunny on 2017. 7. 17..
 *
 * 클래스 인스턴스가 사용되는 시점에 인스턴스를 만드는 방법.
 *
 * getInstance() 메소드 안에서 초기화 되었다. if문을 이용해 instance가 null인 경우에만 new를 사용해
 * 객체 생성하였다.
 *
 * 최초 사용시점에만 인스턴스화 시키기 떄문에 프로그램이 메모리에 적재되는 시점에 부담이 많이 줄게 된다.
 * 하지만 multi thread 방시기라면 위와 같은 singleton pattern은 안전하지 않다.
 * 동일 시점에 getInstance() method를 호출하면 인스턴스가 두번 생길 위험이 있다.
 */
public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;
    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getInstance() {
        if(instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

    public void print() {
        System.out.println("It.s print() method in SingletonLazyInitialization instance.");
        System.out.println("instance hashCode > " + instance.hashCode());
    }

}
