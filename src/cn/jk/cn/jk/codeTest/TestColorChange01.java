package cn.jk.cn.jk.codeTest;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class TestColorChange01 extends JFrame {
    JPanel p;
    JButton btnRed, btnGreen, btnYellow;
    public TestColorChange01(){
        super("动作事件测试");
        p = new JPanel();
        btnRed = new JButton("面板会变红");
        btnGreen = new JButton("面板会变绿");
        btnYellow = new JButton("面板会变黄");
        p.add(btnRed);
        p.add(btnGreen);
        p.add(btnYellow);
        // 创建一个监听对象
        ButtonListener b1 = new ButtonListener();
        // 给按钮注册监听对象
        btnRed.addActionListener(b1);
        btnGreen.addActionListener(b1);
        btnYellow.addActionListener(b1);
        this.add(p);
        this.setSize(300,200);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public class ButtonListener implements ActionListener{
        // 重写 ActionLIstener 接口中的事件处理方法 actionPerformed()
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();  // 获取事件源
            // 判断事件源，进行相应的处理
            if(source == btnRed){
                // 设置面板的背景颜色是红色
                p.setBackground(Color.red);
            } else if(source == btnGreen){
                // 设置面板的背景颜色是绿色
                p.setBackground(Color.green);
            } else{
                // 设置面板的背景颜色是黄色
                p.setBackground(Color.yellow);
            }
        }
    }
    public static void main(String[] args){
        TestColorChange01 cf = new TestColorChange01();
        cf.setVisible(true);
    }
}
