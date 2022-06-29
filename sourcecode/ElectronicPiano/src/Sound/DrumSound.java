package Sound;

public class DrumSound extends Sound {
	public DrumSound(String keyId) {
		super(keyId);
		this.soundType = "drum";
		this.path = "sound//Drum//"+keyId+"drum.wav";
	}
}
