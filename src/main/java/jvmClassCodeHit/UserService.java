package jvmClassCodeHit;


public class UserService {
//    public static void main(String[] args) throws InterruptedException {
//        long begin = System.currentTimeMillis();
//        System.out.println("=== here is source code===");
//        Thread.sleep(500);
//        System.out.println("方法调用时间："+(System.currentTimeMillis()-begin));
//    }
    public void sayHello(String name) throws InterruptedException {
        String testStr = "good-test-string";
        System.out.println("hello my agent test");
        Thread.sleep(500);
    }
}
