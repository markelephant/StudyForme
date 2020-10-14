package modelStudy.singletonModel;

public class Msg01 {
    private static final Msg01 INSTANCE = new Msg01();

    private Msg01(){ }
    public static Msg01 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Msg01 m01 = Msg01.getInstance();
        Msg01 m02 = Msg01.getInstance();
        System.out.println(m01==m02);
    }
}
