package coursera.designpatterns.week1.composite;
import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	// Your code goes here!

	public void play() {
		System.out.println("playing Playlist");
		for (IComponent t : playlist) {
			t.play();
		}

	};

	public void setPlaybackSpeed(float speed) {
		System.out.println("adjusting speed for entier playlist");
		for (IComponent t : playlist) {
			t.setPlaybackSpeed(speed);
		}
	};

	String getName() {
		return playlistName;

	}

	void add(IComponent component) {
		playlist.add(component);
	}

	void remove(IComponent component) {
		playlist.remove(component);

	}

}