import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class h extends JFrame{
	private JLabel lbenter = new JLabel("Enter Name");
	private JTextField enter = new JTextField(10);
	private JButton b = new JButton("°¥");
	private JPanel pNorth = new JPanel();
	
	public h (){
		setSize(300,400);
		buildPanel();
		this.setLayout(new BorderLayout());
		this.add(pNorth,BorderLayout.NORTH);
		setVisible(true);
	}

	private void buildPanel() {
		pNorth.add(lbenter);
		pNorth.add(enter);
		pNorth.add(b);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (enter.getText().equals("")){
					JOptionPane.showMessageDialog(null, "°√Õ°„À¡Ë‰Õ — ");
				}else {
					JOptionPane.showMessageDialog(null, "‡¬È");
				}
				    	
			}
		});
	}
	public static void main(String[] args) {
		h h1 = new h();
	}
}