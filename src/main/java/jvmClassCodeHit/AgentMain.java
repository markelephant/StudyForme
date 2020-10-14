package jvmClassCodeHit;

import javassist.*;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class AgentMain {

    //javagent 方法入口
    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("hello javaagent");

        final ClassPool pool = new ClassPool();
        pool.appendSystemPath();

        instrumentation.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                if (!"jvmClassCodeHit/UserService".equals(className)) {
                    return null;
                }
                try {
                    CtClass ctClass = pool.get("jvmClassCodeHit.UserService");
                    CtMethod sayHello = ctClass.getDeclaredMethod("sayHello");
                    CtMethod copy = CtNewMethod.copy(sayHello, ctClass, null);
                    copy.setName("sayHello$agent");
                    ctClass.addMethod(copy);
                    //改变原有方法
                    sayHello.setBody("{  long begin = System.currentTimeMillis();\n" +
                            "        sayHello$agent($1);\n" +
                            "        System.out.println(\"方法耗时：\"+ (System.currentTimeMillis()-begin));\n "+
                            "        System.out.println(testStr); }");
                    return ctClass.toBytecode();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return new byte[0];
            }
        });


    }

}
