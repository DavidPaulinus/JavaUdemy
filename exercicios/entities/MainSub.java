package exercicios.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainSub {
	List<Sub1> comments = new ArrayList<>();

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date date;
	private String title;
	private String content;
	private Integer likes;

	public MainSub(Date date, String title, String content, Integer likes) {
		super();
		this.date = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Sub1 coments) {
		comments.add(coments);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(date) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Sub1 c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}

}
