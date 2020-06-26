package coursera.designpatterns.week1.composite;

public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist) {
		this.songName = songName;
		this.artist = artist;
	}

	// Your code goes here!

	public void play() {
		// play
		System.out.println(songName+"is Playing at "+speed+"bpm speed");
	};

	public void setPlaybackSpeed(float speed) {
		System.out.println("setting playBackSpeed to "+speed);
		this.speed = speed;
	};

	String getName() {
		return songName;
	}

	String getArtist() {
		return this.artist;
	}
//
}
