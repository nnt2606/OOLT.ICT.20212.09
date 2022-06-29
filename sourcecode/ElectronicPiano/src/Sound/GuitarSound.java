package Sound;

public class GuitarSound extends Sound {
	public GuitarSound(String keyId) {
		super(keyId);
		this.soundType = "guitar";
		this.path = "sound//Guitar//"+keyId+"guitar.wav";
	}
}
