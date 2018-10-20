package cn.jk.string.cn.jk.array;

/**
 * Created by jkx on 2018/10/20.
 */
public class ArrayTest01 {   // 创建类

    //public ArrayTest01(){
    //    System.out.println("just test class object method");
    //}
    String aaa;
    static int t; //实例变量，默认是0值

    public static void test02(){   // 创建类方法,void 无返回值
        System.out.println( t + "t" + 11);   // 有int String 会转换成String
    }

    public static void test03(){
        int j =0;   // 注意，这里要写 int j 会报错，必须初始化j,即给它个初始值
        for(int i=0;i<=10;i++){
            j += i;
        }
        System.out.println(j);
        }


    public static void main(String[] args){

        System.out.println(t);  // 后面写(ArrayTest01.t)一样的；类的变量类的各种方法比如main 都可以引用

        int t = 1; //局部变量，在main方法内
        System.out.println(t); //此时打印的是 局部变量t
        ArrayTest01 aa = new ArrayTest01();   // 创建实例
        System.out.println(aa.t);  // 通过实例访问实例变量

        // System.out.println(aa.test02());  这么写报错～！想想原因
        aa.test02();
        aa.test03();
        ArrayTest01.test02();
    }
}

