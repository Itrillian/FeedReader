package itrillian.feedreader.rss.atom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="author")
public class Author {
	
	private String name;

	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
