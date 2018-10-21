package cn.jk.cn.jk.codeTest;

/**
 * Created by jkx on 2018/10/20.
 */
public class TestOuter01 {  //成员内部类练习
    private static int i  = 1;
    private int j = 10;
    private int k = 20;

    public static void outer_f1(){
        System.out.println("hi, it is outer_f1");
    }

    public static void outer_f2(){
        System.out.println("hi, it is outer_f2");
    }

    //成员内部类中，不能定义静态成员；成员内部类中，可以访问外部类的所有成员；
    class TestInner {   //内部类
        //static int inner_i = 100; //内部类中不允许定义静态变量
        int j = 100; // 内部类和外部类的实例变量可以共存
        int inner_i = 1;
        void inner_f1(){
            System.out.println(i); // 内部类可以访问内部类自己的变量，直接用变量名
            System.out.println(j); //
            System.out.println(this.j); // 与上面的效果一样
            System.out.println(TestOuter01.this.j); // 在内部类中访问外部类中与自己同名的实例变量用 `外部类名.this.变量名`
            System.out.println(k);
            outer_f1();   // 如果内部类中没有与外部类同名的变量，则可以直接用变量名访问外部类的变量
            outer_f2();
        }
    }

    // 外部类的非静态方法访问成员内部类
    public void outer_f3(){
        TestInner inner = new TestInner();
        inner.inner_f1();
    }

    // 外部类的静态方法访问成员内部类，与在 外部类外部访问成员内部类一样
    public static void outer_f4() {
        TestOuter01 out01 = new TestOuter01(); // 第一步建立外部类对象
        TestInner inner = out01.new TestInner(); // 第二步根据外部类建立内部类的对象,这里的 out01 就是通过外部类引到内部类
        inner.inner_f1(); // 第三步 访问内部类的方法
    }
    public static void main(String[] args){
        outer_f4(); // 如果要直接创建内部类的对象，必须要创建一个外部类的对象来；你不能只用外部类就能创建出内部类对象出来
        // 内部类的对象会悄悄的链接到创建它的外部类对象上。如果你是静态内部类（不允许有静态内部类变量），那就不需要对其外部类对象的引用
        TestOuter01 out02 = new TestOuter01();
        TestOuter01.TestInner out_in = out02.new TestInner();
        out_in.inner_f1();
        //out_in.inner_f2();
    }
}
