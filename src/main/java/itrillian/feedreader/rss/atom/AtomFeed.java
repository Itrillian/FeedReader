package itrillian.feedreader.rss.atom;

import itrillian.feedreader.rss.RssFeed;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "feed")
public class AtomFeed extends AtomBase implements RssFeed {
	
	private Author author;
	private List<AtomEntry> entries;

    @XmlElement(name="author")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@XmlElement(name = "entry")
	public List<AtomEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<AtomEntry> entries) {
		this.entries = entries;
	}
}
