package modelStudy.singletonModel;

public class Msg04 {

        private static Msg04 INSTANCE;
        private Msg04(){

        }
        public static synchronized Msg04 getInstance(){
            if(INSTANCE == null){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Msg04();
            }
            return INSTANCE;
        }
        public void m(){
            System.out.println("m");
        }
        public static void main(String[] args) {
            for(int i=0;i<100;i++){
                new Thread(()-> {
                    System.out.println(Msg04.getInstance().hashCode());
                }).start();
            }
        }
}
