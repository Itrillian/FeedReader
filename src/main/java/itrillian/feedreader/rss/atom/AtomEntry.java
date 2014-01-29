package itrillian.feedreader.rss.atom;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class AtomEntry extends AtomBase {
	
	@XmlElement(name="published")
	private Date published;
	
	@XmlElement(name="summary")
	private String summary;
}
