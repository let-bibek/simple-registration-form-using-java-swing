import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Demo extends JFrame
{
	JLabel lbl_name;
	JTextField txt_name;
	JButton btn_ok;;
	public Demo()
	{
		lbl_name=new JLabel("Name");
		txt_name=new JTextField(50);
		btn_ok=new JButton("Ok");
		setSize(600,500);
		setLayout(new FlowLayout());
		add(lbl_name);
		add(txt_name);
		add(btn_ok);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Demo();
	}
}