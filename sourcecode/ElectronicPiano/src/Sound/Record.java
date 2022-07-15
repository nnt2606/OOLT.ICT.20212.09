package Sound;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import PianoComponent.KeyNote;


public class Record {
	private String recordName;
	private ArrayList<KeyNote> record = new ArrayList<KeyNote>();
	private ArrayList<Sound> sound = new ArrayList<Sound>();
	
	public Record() {
		super();
		this.recordName = "record";
	}
	
	public Record(String name) {
		super();
		this.recordName = name;
	}
	
	public void setRecordName(String name) {
		this.recordName = name;
	}
	
	public String getRecordName() {
		return this.recordName;
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
			str += "\n";
		}
		return str;
	}
	
	public void playRecord() {
		System.out.println(this.toString());
		for(int i=0; i<record.size();i++) {
			sound.get(i).play();
			try {
				TimeUnit.SECONDS.sleep(1);
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
