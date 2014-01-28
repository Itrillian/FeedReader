package itrillian.feedreader.rss.atom;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class AtomBase {

	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="title")
	private String title;
	
	@XmlElement(name="updated")
	private Date updated;
}
