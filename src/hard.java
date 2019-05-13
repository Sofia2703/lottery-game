import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hard extends JFrame{
	private JLabel lbhi = new JLabel("Hello    " + start.enter.getText());
	private JLabel box1 = new JLabel("0");
	private JLabel box2 = new JLabel("0");
	private JLabel box3 = new JLabel("0");
	private JLabel lbinput = new JLabel("Enter your number");
	private JTextField txtinput = new JTextField(1);
	private JTextField txtinput2 = new JTextField(1);
	private JTextField txtinput3 = new JTextField(1);
	private JButton random = new JButton("Random");
	private JButton back = new JButton("Back");
	private JLabel point = new JLabel("Your Point");
	private JLabel lbpoint = new JLabel("0");
	private JPanel p = new JPanel();
	private JPanel p2 = new JPanel();
	private Font F = new Font("Old English Text MT", Font.CENTER_BASELINE ,150);
	private Font F1 = new Font("Agency FB", Font.CENTER_BASELINE ,18);
	private Font A = new Font("MV Boli", Font.CENTER_BASELINE ,20);
	private JLabel pic = new JLabel(new ImageIcon("f.jpg"));
	private int total;
	private int win = 100;
	private int lose = 5;
	
	public hard(){
		setTitle("Random Game - Middle");
		setSize(500,410);
		setResizable(false);
		setLocationRelativeTo(p);
		buildPanel();
		this.add(p);
		setVisible(true);
	}

	private void buildPanel() {
		p.setLayout(null);
		lbhi.setBounds(45, 30, 300,25);
		lbinput.setBounds(70, 290, 150,25);
		txtinput.setBounds(200, 290, 20,25);
		txtinput2.setBounds(220, 290, 20,25);
		txtinput3.setBounds(240, 290, 20,25);
		random.setBounds(320, 290, 100,25);
		back.setBounds(320, 325, 100,25);
		point.setBounds(70, 320, 100,25);
		lbpoint.setBounds(200, 320, 100,25);
		pic.setBounds(0, 0, 500, 410);
		//setfont
		box1.setFont(F);
		box2.setFont(F);
		box3.setFont(F);
		lbinput.setFont(F1);
		//lbinput.setForeground(Color.white);
		txtinput.setFont(F1);
		txtinput2.setFont(F1);
		txtinput3.setFont(F1);
		point.setFont(F1);
		//point.setForeground(Color.white);
		lbpoint.setFont(F1);
		//lbpoint.setForeground(Color.white);
		lbhi.setFont(A);
		//lbhi.setForeground(Color.white);
		//setpic
		back.setIcon(new ImageIcon("home.gif"));
		
		p.add(lbhi);
		p.add(lbinput);
		p.add(txtinput);
		p.add(txtinput2);
		p.add(txtinput3);
		p.add(random);
		p.add(point);
		p.add(lbpoint);
		p.add(back);
		p2.setBounds(45, 70, 400,200);
		p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2.setBorder(BorderFactory.createTitledBorder("Number Random"));
		p2.setBackground(Color.WHITE);
		p.add(p2);
		p2.add(box1);
		p2.add(box2);
		p2.add(box3);
		p.add(pic);
		
		random.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try{
					String input = txtinput.getText();
					String input2 = txtinput2.getText();
					String input3 = txtinput3.getText();
					int i = Integer.parseInt(input);
					int i2 = Integer.parseInt(input2);
					int i3 = Integer.parseInt(input3);
					if(input.length() != 1 || input2.length() != 1 || input3.length() != 1){
						JOptionPane.showMessageDialog(null, "Please enter number only one and be Integer");
						txtinput.setText(null);
						txtinput2.setText(null);
						txtinput3.setText(null);
					}else{
						int R1 =(int) (Math.random() * 9);
						//int R1 = 2;
						String ran1 = String.valueOf(R1); // แปลงค่าจาก int เป็น String
						box1.setText(ran1);
						
						int R2 =(int) (Math.random() * 9);
						//int R2 = 2;
						String ran2 = String.valueOf(R2); // แปลงค่าจาก int เป็น String
						box2.setText(ran2);
						
						int R3 =(int) (Math.random() * 9);
						//int R3 = 2;
						String ran3 = String.valueOf(R3); // แปลงค่าจาก int เป็น String
						box3.setText(ran3);
						
							if(i == R1 && i2 == R2 && i3 == R3){
								JOptionPane.showMessageDialog(null, "Yahoo! you get 100 point");
								total = total + win;
								txtinput.setText(null);
								txtinput2.setText(null);
								txtinput3.setText(null);
							}else {
								JOptionPane.showMessageDialog(null, "T^T you lost 5 point");
								total = total - lose;
								txtinput.setText(null);
								txtinput2.setText(null);
								txtinput3.setText(null);
							}
							String sum = String.valueOf(total);
							lbpoint.setText(sum + " Point");	
					}
				}catch(Exception ee){
					JOptionPane.showMessageDialog(null, "Please enter integer number");
					txtinput.setText(null);
					txtinput2.setText(null);
					txtinput3.setText(null);
				}
			}
		});
		back.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				start s = new start();
				close();
			}
		});
	}
	private void close() {
		this.dispose();
	}
	/*public static void main(String[] args) {
		hard h = new hard();
	}*/
}
