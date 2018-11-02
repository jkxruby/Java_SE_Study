package cn.jk.cn.jk.codeTest;
import javax.swing.*;
import java.awt.GridLayout;

public class TestGridLayoutDemo01 extends JFrame {
    private JPanel p;
    private JButton b1,b2,b3,b4;
    public TestGridLayoutDemo01(){
        super("网格布局");
        // 创建一个2行2列的网格布局管理器对象，并将该布局设置到面板中去
        p = new JPanel(new GridLayout(2,2));  // 快捷写法
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        // 将按钮放置到面板中去
        p.add(b1);
        p.add(b2);
        p.add(b4);   // 特意掉个顺序测试一下
        p.add(b3);
        this.add(p);
        this.setSize(300,200);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        TestGridLayoutDemo01 f = new TestGridLayoutDemo01();
        f.setVisible(true);
    }
}
