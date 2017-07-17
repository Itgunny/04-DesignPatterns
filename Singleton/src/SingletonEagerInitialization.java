/**
 * Created by gunny on 2017. 7. 17..
 *
 * 가장 기본적인 Singleton Pattern
 *
 * 전역 변수로 instance를 만드는데 private static을 이용한ㄴ다. static이 붙은 클래스 변수는
 * 인스턴스화에 상관없이 사용이 가능하게 된다.
 *
 * 하지만 private 접근 제어자로 인해 SingletonEagerInitialization.instance로의 접근은 불가능하게 된다.
 *
 *
 * 이런상태에서 생성자 private으로 명시하면 new 키워드 사용안되므로
 * SingletonEagerInitialization instance = new EagerInitialization();
 *
 * 따라서 getInstance() 메소드를 사용해야 한다.
 *
 * 단점 : 프로그램의 크기가 커져서 수 많은 클래스에서 위와 같은 Singleton pattern을 사용한다고 가정해보자.
 *       3번째 라인의 new EagerInitialization()으로 인해 클래스가 인스턴스화 되는 시점에 어떠한 예외 처리도
 *       할 수 없다.
 */
public class SingletonEagerInitialization {
    private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {
        System.out.println("call SingletonEagerInitialization constructor.");
    }

    public static SingletonEagerInitialization getInstance () {
        return instance;
    }

    public void print() {
        System.out.println("It's print() method in SingletonEagerInitialization instance.");
        System.out.println("Instance hashcode > " + instance.hashCode());
    }
}
