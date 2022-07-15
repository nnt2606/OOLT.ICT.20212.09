package PianoComponent;
import java.util.ArrayList;

public class Keyboard {
	private ArrayList<KeyNote> keyboard = new ArrayList<KeyNote>();
	
	public Keyboard() {
		super();
	}
	
	public void addKeyNote(String noteName) {
		KeyNote note = new KeyNote(noteName);
		keyboard.add(note);
	}
	
	public KeyNote getKeyNote(String keyId) {
		for(KeyNote note : keyboard) {
			if(note.getKeyId() == keyId) return note;
		}
		return null;
	}
	
	public String getKeyId(String noteName) {
		for(KeyNote note : keyboard) {
			if(note.getNoteName() == noteName) return note.getKeyId();
		}
		return null;
	}
}
