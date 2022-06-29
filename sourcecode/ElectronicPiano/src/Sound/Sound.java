package Sound;

import java.io.File; 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import Interface.Playable;

public class Sound implements Playable {
	protected String path;
	protected static  float currentVolume;
	protected String keyId;
	protected String soundType;
	private FloatControl fc;
	private Clip clip;
	
	public Sound() {
		super();
	}
	
	public Sound(String keyId) {
		super();
		this.keyId = keyId;
	}
	
	public float getCurrentValue() {
		return this.currentVolume;
	}
	
	public void setCurrenVolume(float volume) {
		this.currentVolume = volume;
	}

	@Override
	public void play() {
		try {
			File file = new File(this.path);
			AudioInputStream audio = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audio);
			this.fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			this.fc.setValue(currentVolume);
			clip.setFramePosition(0);
			clip.start();
		}catch(Exception e) {
			System.out.println("Sound not found!");
		}
	}
	
	@Override
	public String toString() {
		return this.soundType;
	}

}
