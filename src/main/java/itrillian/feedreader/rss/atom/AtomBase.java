package itrillian.feedreader.rss.atom;

import itrillian.feedreader.xml.LinkAdapter;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class AtomBase {

	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="title")
	private String title;
	
	@XmlElement(name="updated")
	private Date updated;
	
	@XmlElement(name="link")
	@XmlJavaTypeAdapter(LinkAdapter.class)
	private String link;
}
