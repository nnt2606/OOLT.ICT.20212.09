package Sound;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class DrumSound extends Sound {
	private String path;
	private String soundType = "drum";
	private FloatControl fc;
	private Clip clip;
	
	public DrumSound(String keyId) {
		super(keyId);
		this.path = "sound//Drum//"+keyId+"drum.wav";
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
			System.out.println("Drum sound not found!");
		}
	}
	
	@Override
	public String toString() {
		return this.soundType;
	}
}
