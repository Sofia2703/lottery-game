import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class start extends JFrame{
	private JLabel lbenter = new JLabel("Enter Name");
	public static JTextField enter = new JTextField(10);
	private JLabel choose = new JLabel("Choose Level");
	private JLabel lbdate = new JLabel();
	private JButton easy = new JButton("Easy");
	private JButton middle = new JButton("Middle");
	private JButton hard = new JButton("Hard");
	private JPanel p = new JPanel();
	private Font A = new Font("Agency FB", Font.CENTER_BASELINE ,25);
	private Font A1 = new Font("Agency FB", Font.CENTER_BASELINE ,20);
	private Font B = new Font("Layiji RuDuuRon YaowMak", Font.CENTER_BASELINE ,20);
	private JLabel pic = new JLabel(new ImageIcon("m.jpg"));
	
	public start(){
		setTitle("Random Game");
		setSize(400,420);
		setResizable(false);
		setLocationRelativeTo(null); //ให้อยู่กลาง
		buildPanel();
		this.add(p);
		setVisible(true);
	}

	private void buildPanel() {
		p.setLayout(null);
		lbenter.setBounds(45, 30, 100,25);
		enter.setBounds(150, 28, 190,30);
		choose.setBounds(155, 80, 100,25);
		easy.setBounds(70, 130, 250,50);
		middle.setBounds(70, 210, 250,50);
		hard.setBounds(70, 290, 250,50);
		pic.setBounds(0, 0, 400, 420);
		lbenter.setFont(A);
		choose.setFont(A1);
		easy.setFont(A1);
		middle.setFont(A1);
		hard.setFont(A1);
		enter.setFont(B);
		p.add(lbenter);
		p.add(enter);
		p.add(choose);
		p.add(easy);
		p.add(middle);
		p.add(hard);
		p.add(pic);
		
		easy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (enter.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter name");
				}else {
					JOptionPane.showMessageDialog(null, "Yo! " + enter.getText());
					easy ee = new easy();
					close();
				}
			}
		});
		middle.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (enter.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter name");
				}else {
					JOptionPane.showMessageDialog(null, "Yo! " + enter.getText());
					middle d = new middle();
					close();
				}
			}
		});
		hard.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
				if (enter.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter name");
				}else {
					JOptionPane.showMessageDialog(null, "Yo! " + enter.getText());
					hard h = new hard();
					close();
				}
			}
		});
	}
	private void close() {
		this.dispose();
	}
	public static void main(String[] args) {
		start s = new start();
	}
}
