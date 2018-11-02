package cn.jk.cn.jk.codeTest;
import javax.swing.*;
import java.awt.BorderLayout;

public class TestBorderLayoutDemo01 extends JFrame{
    private JPanel p;
    private JButton b1,b2,b3,b4,b5;

    public TestBorderLayoutDemo01(){
        super("测试一下按钮布局");
        p = new JPanel();
        // 创建一个边界布局管理器对象，并将该布局设置到面板中
        p.setLayout(new BorderLayout());
        b1 = new JButton("Button 东");
        b2 = new JButton("Button 西");
        b3 = new JButton("Button 南");
        b4 = new JButton("Button 北");
        b5 = new JButton("Button 中");
        // 将按钮放置到面板中制定位置
        p.add(b1,BorderLayout.EAST);
        p.add(b2,BorderLayout.WEST);
        p.add(b3,BorderLayout.SOUTH);
        p.add(b4,BorderLayout.NORTH);
        p.add(b5,BorderLayout.CENTER);
        this.add(p);
        this.setSize(300,200);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        TestBorderLayoutDemo01 f = new TestBorderLayoutDemo01();
        f.setVisible(true);
    }
}
