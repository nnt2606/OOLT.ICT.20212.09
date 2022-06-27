package Sound;

public class Guitar extends SoundType{
	public void play(String audioKey) {
		super.setSoundType("guitar");
		super.play(audioKey);
	}
}
