/**
 * Created by gunny on 2017. 7. 17..
 *
 * 1. INSTANCE가 생성될 때, multi thread로 부터 안전하다.(추가된 method 들은 safe하지 않을 수도 있다.)
 *
 * 2. 사용이 간편하다.
 *
 * 3. enum value는 자바 프로그램 전역에서 접근이 가능하다.
 */
enum SingletonEnumInitialization {
    INSTANCE;

    static String test = "";

    public static SingletonEnumInitialization getInstance() {
        test = "test";
        return INSTANCE;
    }
}
