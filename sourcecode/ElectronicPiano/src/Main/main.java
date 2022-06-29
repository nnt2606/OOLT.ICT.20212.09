package Main;

import java.awt.EventQueue;
import Screen.PianoScreen;

public class main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PianoScreen();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
