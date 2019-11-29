package server;

public class Post {

	private final long id;
	private final String text;

	public Post(long id, String text) {
		this.id = id;
		this.text = text;
	}

	public long getId() {
		return id;
	}

	public String getText() {
		return text;
	}
}
