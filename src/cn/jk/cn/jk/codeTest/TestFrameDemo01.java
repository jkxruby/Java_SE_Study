package cn.jk.cn.jk.codeTest;
import javax.swing.JFrame;

/**
 * Created by jkx on 2018/11/1.
 */
public class TestFrameDemo01 extends JFrame {   // 继承自JFrame
    public TestFrameDemo01(){
        super("我的窗口");  //调用父类构造方法制定的窗口标题
        this.setSize(300,200);  //设定窗口大小
        this.setLocation(100,100); //设定窗口左上角

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        TestFrameDemo01 frame = new TestFrameDemo01();
        frame.setVisible(true);  // 使窗口可见
    }

}
