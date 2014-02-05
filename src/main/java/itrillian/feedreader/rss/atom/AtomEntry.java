package itrillian.feedreader.rss.atom;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class AtomEntry extends AtomBase {
	
	private Date published;
	private String summary;

	@XmlElement(name="published")
	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	@XmlElement(name="summary")
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
