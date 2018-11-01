package cn.jk.cn.jk.codeTest;
import javax.swing.*;

public class TestPanelDemo01 extends JFrame{
    private JPanel jp; //声明面板对象
    private JButton b1;  // 声明按钮对象
    private JButton b2;

    public TestPanelDemo01(){
        super("测试面板-x");  // 创建一个标题为 测试面板 的窗口
        jp = new JPanel();  // 实例化面板对象
        b1 = new JButton("x 1");  // 实例化一个按钮对象，该按钮上的文本为 "x 1"
        b2 = new JButton("x 2");
        // 将按钮添加到面板中
        jp.add(b1);
        jp.add(b2);
        // 将面板添加到窗体框架中
        this.add(jp);
        this.setSize(300, 100);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        TestPanelDemo01 sp = new TestPanelDemo01();
        sp.setVisible(true);  // 若是false，只有窗口，里面按钮不显示
    }
}
