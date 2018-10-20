package cn.jk.cn.jk.codeTest;

/**
 * Created by jkx on 2018/10/20.
 */
public class TestInterfaceCase implements TestInterface{
    public float getArea(float r){
        float area = PI*r*r; //计算圆的面积
        return area;   //返回圆的面积
    }

    public float getCircumference(float r){
        float circumference = 2*PI*r; //计算圆周长
        return circumference;
    }

    public static void main(String[] args){   // 继承接口的类必须要定义接口里面预留的所有方法，否则这个类还是抽象类，无法创建实例
        TestInterfaceCase c = new TestInterfaceCase();
        float f = c.getArea(2.0f);
        System.out.println(Float.toString(f));

    }
}
