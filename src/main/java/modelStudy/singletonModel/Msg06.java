package modelStudy.singletonModel;

public class Msg06 {
    private static volatile Msg06 INSTANCE;
    private Msg06(){

    }
    public static  Msg06 getInstance(){
        if(INSTANCE == null){
            synchronized(Msg06.class){
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Msg06();
                }
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()-> {
                System.out.println(Msg06.getInstance().hashCode());
            }).start();
        }
    }
}
