package Sound;

public class Piano extends SoundType {
	public void play(String audioKey) {
		super.setSoundType("piano");
		super.play(audioKey);
	}
}
