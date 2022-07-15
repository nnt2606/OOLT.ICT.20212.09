package Sound;

import Interface.Playable;
import Interface.Volume;

public class Sound implements Playable, Volume {
	protected static float currentVolume;
	protected String keyId;
	protected String soundType;
	
	public Sound() {
		super();
	}
	
	public Sound(String keyId) {
		super();
		this.keyId = keyId;
	}
	@Override
	public float getCurrentValue() {
		return Sound.currentVolume;
	}
	@Override
	public void setCurrenVolume(float volume) {
		currentVolume = volume;
	}

	public void play() {
		//
	}

}
