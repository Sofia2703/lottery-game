import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class easy extends JFrame{
	private JLabel lbhi = new JLabel("Hello  " + start.enter.getText());
	private JLabel box1 = new JLabel("0");
	private JLabel lbinput = new JLabel("Enter your number");
	private JTextField txtinput = new JTextField(10);
	private JButton random = new JButton("Random");
	private JButton back = new JButton("Back");
	private JLabel point = new JLabel("Your Point");
	private JLabel lbpoint = new JLabel("0");
	private JPanel p = new JPanel();
	private JPanel p2 = new JPanel();
	private Font F = new Font("Old English Text MT", Font.CENTER_BASELINE ,150);
	private Font F1 = new Font("Agency FB", Font.CENTER_BASELINE ,18);
	private Font A = new Font("MV Boli", Font.CENTER_BASELINE ,20);
	private int total;
	private int win = 20;
	private int lose = 1;
	private JLabel pic = new JLabel(new ImageIcon("e.jpg"));
	
	public easy(){
		setTitle("Random Game - Easy");
		setSize(400,410);
		setResizable(false);
		setLocationRelativeTo(p);
		buildPanel();
		this.add(p);
		setVisible(true);
	}
	private void buildPanel() {
		p.setLayout(null);
		//setsize
		lbhi.setBounds(45, 25, 300,15);
		lbinput.setBounds(45, 283, 150,25);
		txtinput.setBounds(160, 283, 50,25);
		random.setBounds(240, 283, 100,25);
		back.setBounds(240, 320, 100,25);
		point.setBounds(45, 320, 100,25);
		lbpoint.setBounds(160, 320, 100,25);
		pic.setBounds(0, 0, 400, 420);
		//setfont
		box1.setFont(F);
		lbinput.setFont(F1);
		lbinput.setForeground(Color.white);
		txtinput.setFont(F1);
		point.setFont(F1);
		point.setForeground(Color.white);
		lbpoint.setFont(F1);
		lbpoint.setForeground(Color.white);
		lbhi.setFont(A);
		lbhi.setForeground(Color.white);
		//setpic
		back.setIcon(new ImageIcon("home.gif"));
		//put
		p.add(lbhi);
		p.add(lbinput);
		p.add(txtinput);
		p.add(random);
		p.add(point);
		p.add(lbpoint);
		p.add(back);
		p2.setBounds(45, 65, 300,200);
		p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2.setBorder(BorderFactory.createTitledBorder("Number Random"));
		p2.setBackground(Color.WHITE);
		p2.add(box1);
		p.add(p2);
		p.add(pic);
		
		random.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try{
					String input = txtinput.getText();
					int i = Integer.parseInt(input);
					if(input.length() != 1){
						JOptionPane.showMessageDialog(null, "Please enter number only one and be Integer");
						txtinput.setText(null);
					}else{
						int R1 =(int) (Math.random() * 5);
						//int R1 = 2;
						String ran = String.valueOf(R1); // แปลงค่าจาก int เป็น String
						box1.setText(ran);
							if(i == R1){
								JOptionPane.showMessageDialog(null, "Yahoo! you get 20 point");
								total = total + win;
								txtinput.setText(null);
							}else {
								JOptionPane.showMessageDialog(null, "T^T you lost 1 point");
								total = total - lose;
								txtinput.setText(null);
							}
							String sum = String.valueOf(total);
							lbpoint.setText(sum + " Point");
					}
				}catch(Exception ee){
					JOptionPane.showMessageDialog(null, "Please enter integer number");
					txtinput.setText(null);
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
		easy e = new easy();
	}*/
}
