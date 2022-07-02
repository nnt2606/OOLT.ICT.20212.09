package Sound;

public class Sound {
	protected static  float currentVolume;
	protected String keyId;
	protected String soundType;
	
	public Sound() {
		super();
	}
	
	public Sound(String keyId) {
		super();
		this.keyId = keyId;
	}
	
	public float getCurrentValue() {
		return Sound.currentVolume;
	}
	
	public void setCurrenVolume(float volume) {
		Sound.currentVolume = volume;
	}

	public void play() {
		//
	}

}
