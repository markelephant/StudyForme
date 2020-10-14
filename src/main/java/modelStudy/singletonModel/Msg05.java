package modelStudy.singletonModel;

public class Msg05 {
    private static Msg05 INSTANCE;
    private Msg05(){

    }
    public static  Msg05 getInstance(){
        if(INSTANCE == null){
            synchronized(Msg05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Msg05();
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
                System.out.println(Msg05.getInstance().hashCode());
            }).start();
        }
    }
}
