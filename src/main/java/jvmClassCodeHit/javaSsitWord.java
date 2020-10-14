package jvmClassCodeHit;

import javassist.*;

public class javaSsitWord {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {
        ClassPool pool = new ClassPool(true);
        pool.insertClassPath(new LoaderClassPath(javaSsitWord.class.getClassLoader()));
        //构建一个新的CtClass对象
        CtClass targetClass = pool.makeClass("com.java.hello");
        targetClass.addInterface(pool.get(IHello.class.getName()));
        CtClass returnType = pool.get(void.class.getName());
        String mname = "sayHello";
        CtClass []  parameters = new CtClass[]{pool.get(String.class.getName())};
        CtMethod ctMethod = new CtMethod(returnType,mname,parameters,targetClass);
        String src = "{" +
                "System.out.println($args);"+
                "System.out.println($$);"+
                "System.out.println($class);"+
                "System.out.println($type);"+
                "System.out.println(\"hello \"+$1);" +
                "}";

        ctMethod.setBody(src);
        targetClass.addMethod(ctMethod);
        Class clazz = targetClass.toClass();
        IHello hello = (IHello) clazz.newInstance();
        hello.sayHello("小园");


    }

    public interface IHello{
        public void sayHello(String name);
    }
}
