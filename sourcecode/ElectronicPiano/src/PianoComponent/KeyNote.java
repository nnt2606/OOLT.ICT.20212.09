package PianoComponent;

public class KeyNote{
	private String keyId;
	private static int count=1;
	private int id;
	private String noteName;
	
	public KeyNote(String noteName) {
		super();
		this.id = count;
		count++;
		if(id<10) this.keyId = "key0"+id;
		else this.keyId = "key"+id;
		this.noteName = noteName;
	}
	
	public String getKeyId() {
		return this.keyId;
	}
	
	public String getNoteName() {
		return this.noteName;
	}

	@Override
	public String toString() {
		return this.noteName;
	}
}
