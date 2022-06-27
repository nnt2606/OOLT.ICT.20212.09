package Sound;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundType implements Playable{
	private String soundType;
	private AudioInputStream audio;
	private Clip player;
	
	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	
	public void play(String audioKey) {
		try {
			audio = AudioSystem.getAudioInputStream(new File("sound\\"+audioKey+soundType+".wav"));
			player = AudioSystem.getClip();
			player.open(audio);
			play();
			//player.close();
		}catch(Exception e) {
			System.out.println("ERROR!");
		}
	}
		
	@Override
	public void play() {
		player.start();
	}
	

}
