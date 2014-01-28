package itrillian.feedreader.rss.atom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="author")
public class Author {
	
	@XmlElement(name="name")
	private String name;
	
}
