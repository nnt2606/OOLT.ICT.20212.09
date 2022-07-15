package Screen;

import javax.swing.JFrame; 
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Sound.*;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import PianoComponent.Keyboard;

import javax.swing.ButtonGroup;

public class PianoScreen extends JFrame implements ActionListener{
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Button[] blackBtns;
	private Button[] whiteBtns;
	private String[] blackNotes = {"C1#","D1#","F1#","G1#","A1#","C2#","D2#","F2#","G2#","A2#"};
	private String[] whiteNotes = {"C1","D1","E1","F1","G1","A1","B1","C2","D2","E2","F2","G2","A2","B2"};
	private Keyboard keyboard;
	private Sound sound;
	private JRadioButton rdbtnPiano;
	private JRadioButton rdbtnGuitar;
	private JRadioButton rdbtnDrum;
	private JSlider slider;
	private Boolean recording = false;
	private Record record;
	
	public PianoScreen() {
		keyboard = new Keyboard();
		Container frame = getContentPane();
		setJMenuBar(menuBar());
		frame.setLayout(null);
		frame.add(recordPane());
		frame.add(titlePane());
		frame.add(volumePane());
		frame.add(pianoPane());
		
		setTitle("Virtual Piano");
		setBounds(100, 100, 1065, 544);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				String objBtn[] = {"Yes","No"};
				int result = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,objBtn,objBtn[0]);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		setVisible(true);
	}
	
	JPanel pianoPane() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 105, 1025, 320);
		panel.setLayout(null);
		sound = new Sound();
		//sound.setCurrenVolume(slider.getValue());
		
		blackBtns = new Button[blackNotes.length];
		int space = 51;
		for(int i=0 ; i<blackBtns.length; i++) {
			blackBtns[i] = new Button("");
			blackBtns[i].setBackground(Color.BLACK);
			blackBtns[i].setBounds(space, 10, 56, 203);
			keyboard.addKeyNote(blackNotes[i]);
			blackBtns[i].setActionCommand(keyboard.getKeyId(blackNotes[i]));
			blackBtns[i].addActionListener(this);
			panel.add(blackBtns[i]);
			if(i==1|| i==4|| i==6 ) space+= 140;
			else space += 74;
			System.out.println("black :" + blackNotes[i]+" : "+ keyboard.getKeyId(blackNotes[i]));
		}
		space = 10;
		whiteBtns = new Button[whiteNotes.length];
		for(int i=0 ; i<whiteBtns.length; i++) {
			whiteBtns[i] = new Button("");
			whiteBtns[i].setBackground(Color.WHITE);
			whiteBtns[i].setBounds(space, 10, 66, 300);
			keyboard.addKeyNote(whiteNotes[i]);
			whiteBtns[i].setActionCommand(keyboard.getKeyId(whiteNotes[i]));
			whiteBtns[i].addActionListener(this);
			panel.add(whiteBtns[i]);
			space += 72;
		}
		
		return panel;
	}


	JPanel titlePane() {
		JPanel titlePane = new JPanel();
		titlePane.setBounds(10, 10, 306, 91);
		titlePane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Virtual Piano");
		lblTitle.setFont(new Font("Showcard Gothic", Font.BOLD, 35));
		lblTitle.setBounds(0, 0, 306, 91);
		titlePane.add(lblTitle);
		return titlePane;
	}
	
	JMenuBar menuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenuItem mnNewMenu = new JMenuItem("Help");
		mnNewMenu.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog jd = new JDialog(new Help());
			}
		});
		return menuBar;
	}
	
	JPanel volumePane() {	
		JPanel volumePane = new JPanel();
		volumePane.setBounds(326, 10, 342, 91);
		volumePane.setLayout(null);
		
		slider = new JSlider(-80,6);
		slider.setPaintTicks(true);
		slider.setBounds(0, 26, 342, 22);
		volumePane.add(slider);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sound.setCurrenVolume(slider.getValue());
				System.out.println("Volume: "+sound.getCurrentValue());
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Volume");
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(0, 0, 305, 22);
		volumePane.add(lblNewLabel_1);
		
		rdbtnPiano = new JRadioButton("Piano");
		buttonGroup.add(rdbtnPiano);
		rdbtnPiano.setSelected(true);
		rdbtnPiano.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		rdbtnPiano.setBounds(6, 64, 75, 21);
		volumePane.add(rdbtnPiano);
		
		rdbtnGuitar = new JRadioButton("Guitar");
		buttonGroup.add(rdbtnGuitar);
		rdbtnGuitar.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		rdbtnGuitar.setBounds(127, 64, 96, 21);
		volumePane.add(rdbtnGuitar);
		
		rdbtnDrum = new JRadioButton("Drum");
		buttonGroup.add(rdbtnDrum);
		rdbtnDrum.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		rdbtnDrum.setBounds(261, 64, 75, 21);
		volumePane.add(rdbtnDrum);
		
		return volumePane;
	}
	
	JPanel recordPane() {	
		JPanel recordPane = new JPanel();
		recordPane.setBounds(678, 10, 357, 91);
		recordPane.setLayout(null);
		
		JButton btnRecord = new JButton("New Record");
		btnRecord.setFont(new Font("Source Code Pro", Font.PLAIN, 16));
		btnRecord.setBounds(10, 10, 337, 34);
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(recording == false) {
					System.out.println("Start recording!");
					record = new Record();
					recording = true;
					btnRecord.setText("Recording...");
					
				}else if(recording ==true) {
					System.out.println("Recording...");
				}
			}
		});
		recordPane.add(btnRecord);
		
		JButton btnPause = new JButton("Stop");
		btnPause.setFont(new Font("Source Code Pro", Font.PLAIN, 16));
		btnPause.setBounds(10, 54, 157, 34);
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(recording == true) {
					System.out.println("End of record!");
					recording = false;
					btnRecord.setText("Record");
				}else if( recording == false) {
					System.out.println("Not recording!");
				}
			}
		});
		recordPane.add(btnPause);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Source Code Pro", Font.PLAIN, 16));
		btnPlay.setBounds(190, 54, 157, 34);
		recordPane.add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(recording == false) {
					System.out.println("Play the record!");
					//System.out.println(record.toString());
					record.playRecord();
				}else {
					System.out.println("Recording.., can not play!");
				}
			}
		});
		return recordPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		sound.setCurrenVolume(slider.getValue());
			if(rdbtnPiano.isSelected()) {
				sound = new PianoSound(command);
				if(recording == true) record.addRecord(keyboard.getKeyNote(command), sound);
			}
			if(rdbtnGuitar.isSelected()) {
				sound = new GuitarSound(command);
				if(recording == true) record.addRecord(keyboard.getKeyNote(command), sound);
			}
			if(rdbtnDrum.isSelected()) {
				sound = new DrumSound(command);
				if(recording == true) record.addRecord(keyboard.getKeyNote(command), sound);
			}
			sound.play();
			System.out.println(keyboard.getKeyNote(command).toString()+" - "+sound.toString()+" ( "+ slider.getValue()+")");
		
	}
}
