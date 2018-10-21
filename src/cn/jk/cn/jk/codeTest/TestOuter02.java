package cn.jk.cn.jk.codeTest;

/**
 * Created by jkx on 2018/10/21.
 */
public class TestOuter02 {  //局部内部类练习
    private int s = 10;
    private int k = 0;
    public void funcl(){
        final int s = 20;
        final int j = 1;

        class InnerClass{ //局部了内部类
            int s = 30; //可以定义与外部类同名的变量
            //static int m = 20; //不可以定义静态变量
            void innerFunc(){  // 如果内部类没有外部类的 同名变量，在内部类中可以直接访问外部类的实例变量
                System.out.println("外围类成员："+k);
                System.out.println("常量："+s+"和"+j); // 可以访问外部类的局部变量(即方法内的变量)，但变量必须是final的；如果变量同名，访问内部类的变量
                System.out.println("常量"+ this.s);  // 用this.变量名 访问的也是内部类变量
                System.out.println("外部类成员变量：" + TestOuter02.this.s);
            }
        }

        new InnerClass().innerFunc();
    }
    public static void main(String[] args){
        //访问局部内部类必须先定义外部类对象
        TestOuter02 out02 = new TestOuter02();
        out02.funcl();
    }
}
