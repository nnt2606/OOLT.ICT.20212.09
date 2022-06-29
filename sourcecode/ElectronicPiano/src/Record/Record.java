package Record;
import java.util.ArrayList;
import Note.KeyNote;
import Sound.Sound;


public class Record {
	private ArrayList<KeyNote> record = new ArrayList<KeyNote>();
	private ArrayList<Sound> sound = new ArrayList<Sound>();
	public Record() {
		super();
	}
	
	public void addRecord(KeyNote note,Sound type) {
		record.add(note);
		sound.add(type);
	}
	
	public void deleteRecord() {
		record.remove(record.size()-1);
		sound.remove(sound.size() -1);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i=0;i<record.size();i++) {
			str += record.get(i).toString()+" ( "+sound.get(i).toString()+")     ";
		}
		return str;
	}
	
	public void playRecord() {
		System.out.println(this.toString());
		for(int i=0; i<record.size();i++) {
			try {
				sound.get(i).play();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<KeyNote> getRecord(){
		return this.record;
	}
}
