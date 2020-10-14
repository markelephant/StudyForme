package modelStudy.singletonModel;

/**
 * 枚举单例，最牛的
 * effective java 中的单例模式
 */
public enum Msg08 {
    INSTANCE;

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Msg08.INSTANCE.hashCode())).start();
        }
    }
}
