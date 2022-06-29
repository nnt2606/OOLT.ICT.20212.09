package Screen;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Panel;
import Sound.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class MainScreen implements ActionListener {
	private SoundType soundtype;
	private JFrame frmElectronicPianoApplication;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPiano;
	private JRadioButton rdbtnGuitar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmElectronicPianoApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElectronicPianoApplication = new JFrame();
		frmElectronicPianoApplication.setTitle("Electronic Piano");
		frmElectronicPianoApplication.setBounds(100, 100, 994, 481);
		frmElectronicPianoApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElectronicPianoApplication.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Virtual Piano");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		lblNewLabel.setBounds(2, 0, 264, 68);
		frmElectronicPianoApplication.getContentPane().add(lblNewLabel);
		
		Button note23 = new Button("");
		note23.setActionCommand("key23");
		note23.setForeground(Color.WHITE);
		note23.setBackground(Color.BLACK);
		note23.setBounds(708, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note23);
		
		Button note21 = new Button("");
		note21.setActionCommand("key21");
		note21.setForeground(Color.WHITE);
		note21.setBackground(Color.BLACK);
		note21.setBounds(653, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note21);
		
		Button note19 = new Button("");
		note19.setActionCommand("key19");
		note19.setForeground(Color.WHITE);
		note19.setBackground(Color.BLACK);
		note19.setBounds(598, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note19);
		
		Button note16 = new Button("");
		note16.setActionCommand("key16");
		note16.setForeground(Color.WHITE);
		note16.setBackground(Color.BLACK);
		note16.setBounds(488, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note16);
		
		Button note14 = new Button("");
		note14.setActionCommand("key14");
		note14.setForeground(Color.WHITE);
		note14.setBackground(Color.BLACK);
		note14.setBounds(433, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note14);
		
		Button note11 = new Button("");
		note11.setActionCommand("key11");
		note11.setForeground(Color.WHITE);
		note11.setBackground(Color.BLACK);
		note11.setBounds(327, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note11);
		
		Button note09 = new Button("");
		note09.setActionCommand("key09");
		note09.setForeground(Color.WHITE);
		note09.setBackground(Color.BLACK);
		note09.setBounds(272, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note09);
		
		Button note07 = new Button("");
		note07.setActionCommand("key07");
		note07.setForeground(Color.WHITE);
		note07.setBackground(Color.BLACK);
		note07.setBounds(217, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note07);
		
		Button note04 = new Button("");
		note04.setActionCommand("key04");
		note04.setForeground(Color.WHITE);
		note04.setBackground(Color.BLACK);
		note04.setBounds(103, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note04);
		
		Button note02 = new Button("");
		note02.setActionCommand("key02");
		note02.setForeground(Color.WHITE);
		note02.setBackground(Color.BLACK);
		note02.setBounds(47, 95, 49, 175);
		frmElectronicPianoApplication.getContentPane().add(note02);
		
		Button note01 = new Button("");
		note01.setFont(new Font("Tahoma", Font.BOLD, 15));
		note01.setActionCommand("key01");
		note01.setForeground(Color.BLACK);
		note01.setBackground(Color.WHITE);
		note01.setBounds(21, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note01);
		
		Button note03 = new Button("");
		note03.setActionCommand("key03");
		note03.setForeground(Color.BLACK);
		note03.setBackground(Color.WHITE);
		note03.setBounds(76, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note03);
		
		Button note05 = new Button("");
		note05.setActionCommand("key05");
		note05.setForeground(Color.BLACK);
		note05.setBackground(Color.WHITE);
		note05.setBounds(131, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note05);
		
		Button note06 = new Button("");
		note06.setActionCommand("key06");
		note06.setForeground(Color.BLACK);
		note06.setBackground(Color.WHITE);
		note06.setBounds(186, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note06);
		
		Button note08 = new Button("");
		note08.setActionCommand("key08");
		note08.setForeground(Color.BLACK);
		note08.setBackground(Color.WHITE);
		note08.setBounds(241, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note08);
		
		Button note10 = new Button("");
		note10.setActionCommand("key10");
		note10.setForeground(Color.BLACK);
		note10.setBackground(Color.WHITE);
		note10.setBounds(296, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note10);
		
		Button note12 = new Button("");
		note12.setActionCommand("key12");
		note12.setForeground(Color.BLACK);
		note12.setBackground(Color.WHITE);
		note12.setBounds(351, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note12);
		
		Button note13 = new Button("");
		note13.setActionCommand("key13");
		note13.setForeground(Color.BLACK);
		note13.setBackground(Color.WHITE);
		note13.setBounds(406, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note13);
		
		Button note15 = new Button("");
		note15.setActionCommand("key15");
		note15.setForeground(Color.BLACK);
		note15.setBackground(Color.WHITE);
		note15.setBounds(460, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note15);
		
		Button note17 = new Button("");
		note17.setActionCommand("key17");
		note17.setForeground(Color.BLACK);
		note17.setBackground(Color.WHITE);
		note17.setBounds(515, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note17);
		
		Button note18 = new Button("");
		note18.setActionCommand("key18");
		note18.setForeground(Color.BLACK);
		note18.setBackground(Color.WHITE);
		note18.setBounds(570, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note18);
		
		Button note20 = new Button("");
		note20.setActionCommand("key20");
		note20.setForeground(Color.BLACK);
		note20.setBackground(Color.WHITE);
		note20.setBounds(625, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note20);
		
		Button note22 = new Button("");
		note22.setActionCommand("key22");
		note22.setForeground(Color.BLACK);
		note22.setBackground(Color.WHITE);
		note22.setBounds(680, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note22);
		
		Button note24 = new Button("");
		note24.setActionCommand("key24");
		note24.setForeground(Color.BLACK);
		note24.setBackground(Color.WHITE);
		note24.setBounds(735, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note24);
		
		Button note25 = new Button("");
		note25.setActionCommand("key25");
		note25.setForeground(Color.BLACK);
		note25.setBackground(Color.WHITE);
		note25.setBounds(790, 95, 49, 308);
		frmElectronicPianoApplication.getContentPane().add(note25);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 84, 842, 328);
		frmElectronicPianoApplication.getContentPane().add(panel);
		
		rdbtnPiano = new JRadioButton("Piano");
		buttonGroup.add(rdbtnPiano);
		rdbtnPiano.setSelected(true);
		rdbtnPiano.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnPiano.setBounds(261, 6, 71, 35);
		frmElectronicPianoApplication.getContentPane().add(rdbtnPiano);
		
		rdbtnGuitar = new JRadioButton("Guitar");
		buttonGroup.add(rdbtnGuitar);
		rdbtnGuitar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnGuitar.setBounds(261, 35, 71, 35);
		frmElectronicPianoApplication.getContentPane().add(rdbtnGuitar);
		
		JMenuBar menuBar = new JMenuBar();
		frmElectronicPianoApplication.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Basic usage");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aims");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		note01.addActionListener(this);
		note02.addActionListener(this);
		note03.addActionListener(this);
		note04.addActionListener(this);
		note05.addActionListener(this);
		note06.addActionListener(this);
		note07.addActionListener(this);
		note08.addActionListener(this);
		note09.addActionListener(this);
		note10.addActionListener(this);
		note11.addActionListener(this);
		note12.addActionListener(this);
		note13.addActionListener(this);
		note14.addActionListener(this);
		note15.addActionListener(this);
		note16.addActionListener(this);
		note17.addActionListener(this);
		note18.addActionListener(this);
		note19.addActionListener(this);
		note20.addActionListener(this);
		note21.addActionListener(this);
		note22.addActionListener(this);
		note23.addActionListener(this);
		note24.addActionListener(this);
		note25.addActionListener(this);
	}
	
	public void playNote(String keyNote) {
		if(rdbtnPiano.isSelected()) {
			soundtype = new Piano();
		}else if(rdbtnGuitar.isSelected()) {
			soundtype = new Guitar();
		}
		soundtype.play(keyNote);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key = e.getActionCommand();
		playNote(key);
	}
}
