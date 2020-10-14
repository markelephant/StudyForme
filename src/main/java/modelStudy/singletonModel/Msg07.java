package modelStudy.singletonModel;

public class Msg07 {
    private Msg07(){

    }
    public static class Msg07Holder{
        private final static Msg07 INSTANCE = new Msg07();
    }
    public static Msg07 getInstance(){
        return Msg07Holder.INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()-> System.out.println(Msg07.getInstance().hashCode())
                    ).start();
        }
    }
}
