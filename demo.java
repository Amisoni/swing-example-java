import javax.swing.*;

public class demo
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		JButton jb=new JButton("Click");
		JTextField jt=new JTextField("For Example");
		JLabel jl=new JLabel("Ami Soni");
		jt.setBounds(130,50,100,40);
		jb.setBounds(130,100,100,40);
		jl.setBounds(13,120,100,40);
		jf.add(jb);
		jf.add(jt);
		jf.add(jl);
		jf.setSize(400,500);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}
}