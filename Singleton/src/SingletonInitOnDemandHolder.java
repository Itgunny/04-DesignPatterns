/**
 * Created by gunny on 2017. 7. 17..
 *
 * 미국 메릴랜드 대학의 컴퓨터 과학 연구원인 Bill pugh가 기존의 java singleton pattern이 가지고 있는 문제들을
 * 해결하기 위해 새로운 singleton pattern을 제시하였다.
 *
 * class loader의 메커니즘과 class의 load시점을 이용하여 내부 class를 생성 시킴으로 thread간의 동기화 문제 해결한다.
 */
public class SingletonInitOnDemandHolder {
    // initialization on demand holder idiom 역시 lazy initialization이 가능하며 모든 java 버전과
    // jvm에서 사용이 가능하다.
    private SingletonInitOnDemandHolder() { }

    private static class Singleton {
        private static final SingletonInitOnDemandHolder instance
                = new SingletonInitOnDemandHolder();
    }

    public static SingletonInitOnDemandHolder getInstance() {
        System.out.println("create instance");
        return Singleton.instance;
    }
}
