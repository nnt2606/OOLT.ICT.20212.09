package Sound;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class PianoSound extends Sound {
	private String path;
	private String soundType = "piano";
	private FloatControl fc;
	private Clip clip;
	
	public PianoSound(String keyId) {
		super(keyId);
		this.path = "sound//Piano//"+keyId+"piano.wav";
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
			System.out.println("Piano sound not found!");
		}
	}
	
	@Override
	public String toString() {
		return this.soundType;
	}
}
