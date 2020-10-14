package modelStudy.singletonModel;

/*
和第一个没有区别
 */
public class Msg02 {
    private static final Msg02 INSTANCE ;
    static {
        INSTANCE = new Msg02();
    }

    private Msg02(){ }
    public static Msg02 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Msg02 m01 = Msg02.getInstance();
        Msg02 m02 = Msg02.getInstance();
        System.out.println(m01==m02);
    }
}
