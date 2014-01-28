package itrillian.feedreader.rss.atom;

import itrillian.feedreader.rss.RssFeed;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "feed")
public class AtomFeed extends AtomBase implements RssFeed {
	
	@XmlElement(name="author")
	private Author author;
	
    @XmlElement(name = "entry")
	private List<AtomEntry> entries;
}
