package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssUtil.parseFeedFromFile;
import static org.junit.Assert.assertEquals;
import itrillian.feedreader.rss.atom.AtomEntry;
import itrillian.feedreader.rss.atom.AtomFeed;

import java.io.File;
import java.util.Date;

import org.junit.Test;

public class RssParserTest {

	@Test
	public void parseFeedTest() throws ParseException {
		AtomFeed atomFeed = (AtomFeed) parseFeedFromFile(new File("src/test/resources/itrillian/feedreader/rss/atom/RssAtomTest.xml"));
		AtomEntry entry = atomFeed.getEntries().get(0);

		/*
		 * Validate feed
		 */
		assertEquals("Example Feed", atomFeed.getTitle());
		assertEquals("http://example.org/", atomFeed.getLink());
		assertEquals(new Date(1071340202000l), atomFeed.getUpdated());
		assertEquals("urn:uuid:60a76c80-d399-11d9-b93C-0003939e0af6", atomFeed.getId());
		assertEquals("John Doe", atomFeed.getAuthor().getName());

		/*
		 * Validate entry
		 */
		assertEquals("Atom-Powered Robots Run Amok", entry.getTitle());
		assertEquals("http://example.org/2003/12/13/atom03", entry.getLink());
		assertEquals(new Date(1071340202000l), entry.getUpdated());
		assertEquals("urn:uuid:1225c695-cfb8-4ebb-aaaa-80da344efa6a", entry.getId());
		assertEquals("Some text.", entry.getSummary());
	}
}
