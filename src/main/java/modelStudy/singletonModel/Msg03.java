package modelStudy.singletonModel;

public class Msg03 {
    private static Msg03 INSTANCE;
    private Msg03(){

    }
    public static Msg03 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Msg03();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()-> {
                System.out.println(Msg03.getInstance().hashCode());
            }).start();
        }
    }






}
