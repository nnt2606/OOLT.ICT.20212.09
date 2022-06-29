package Sound;

public class PianoSound extends Sound {
	public PianoSound(String keyId) {
		super(keyId);
		this.soundType = "piano";
		this.path = "sound//Piano//"+keyId+"piano.wav";
	}
}
