package itrillian.feedreader.rss.atom;

import itrillian.feedreader.xml.LinkAdapter;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class AtomBase {

	private String id;
	private String title;
	private Date updated;
	private String link;

	@XmlElement(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name="updated")
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@XmlElement(name="link")
	@XmlJavaTypeAdapter(LinkAdapter.class)
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
