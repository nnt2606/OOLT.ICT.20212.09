package Screen;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Help extends JFrame{

	public Help() {
		Container frame = getContentPane();
		frame.add(pane());
		setSize(800,600);
		setVisible(true);
	}
	
	JTabbedPane pane() {
		JTabbedPane pane = new JTabbedPane();
		pane.setFocusable(true);
		pane.add("Basic Usage",basicUsage());
		pane.add("About",about());
		return pane;
	}
	
	JPanel basicUsage() {
		JPanel basicUsage = new JPanel();
		basicUsage.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Basic Usage");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
			lblNewLabel.setBounds(167, 10, 414, 56);
			basicUsage.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("This is some introductions of Virtual Piano");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 67, 761, 32);
		basicUsage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(". . .");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 494, 761, 32);
		basicUsage.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lbText = new JLabel("<html>Virtual Piano have 3 type of sound : Piano, Guitar, Drum. You can select one to play. "
				+"Using volume slider to control the Volume. "
				+"We have record button that you can record your music and listen again!"
				+"Record button: Start Record! "
				+"Pause button: Pause record! "
				+"Play button: Play the record that was recording! "
				+"<htlm>");
		lbText.setVerticalAlignment(SwingConstants.TOP);
		lbText.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lbText.setBounds(20, 92, 751, 415);
		basicUsage.add(lbText);

		return basicUsage;
	}
	
	JPanel about() {
		JPanel about = new JPanel();
		about.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("About");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(217, 10, 338, 63);
		about.add(lblNewLabel_2);
		
		JLabel lbText = new JLabel("<html>Virtual piano is the perfect fit when you don’t have a real piano "
				+ "keyboard at home or if your piano or keyboard aren't located next to a computer. "
				+ "The online piano keyboard simulates a real piano keyboard with 24 keyboard keys and 3 type "
				+ "of sounds bring to you the good experiment<html>");
		lbText.setVerticalAlignment(SwingConstants.TOP);
		lbText.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lbText.setBounds(31, 64, 722, 420);
		about.add(lbText);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(". . .");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 494, 761, 32);
		about.add(lblNewLabel_1_1_1_1_1);
		
		return about;
	}
}
