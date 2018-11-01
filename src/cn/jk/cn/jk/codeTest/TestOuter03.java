package cn.jk.cn.jk.codeTest;

/**
 * Created by jkx on 2018/10/21.
 */
public class TestOuter03 {  // 静态内部类练习
    private static int i = 1;
    private int j = 10;

    public static void func1(){}   // 定义2个方法
    public void func2(){}

    static class InnerClass {  // 静态内部类可以用public、protected、private修饰 ;静态内部类中可以定义静态或非静态的成员
        static int inner_i = 100;
        int inner_j = 200;

        static void innerFunc1(){
            // 静态内部类只能访问外部类的静态成员（包括静态变量和静态方法）
            System.out.println("Outer.i=" + i);  // 这里，j 就不可以调用
            func1();   // 这里 func2() 就不可调用
        }
       void innerFunc2(){
           System.out.println("Outer.i=" + i);
           //func2();
       }
    }

    // 外部类访问 内部类的非静态成员--实例化内部类即可
    public static void func3(){
        InnerClass inner = new InnerClass();
        inner.innerFunc2();
        System.out.println(InnerClass.inner_i); // 外部类访问内部类的静态成员，即内部类.静态成员
        InnerClass.innerFunc1();
        //InnerClass.innerFunc2(); // 该行报错
    }

    public static void main(String[] args){
        new TestOuter03().func3(); // 静态内部类的对象可以直接生成！！！
        TestOuter03 aaa = new TestOuter03();  // 外部类可以直接越过静态内部类直接访问其方法
        aaa.func3();
    }

}
