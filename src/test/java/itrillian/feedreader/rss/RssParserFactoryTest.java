package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssParserFactory.getParserInstance;
import static itrillian.feedreader.rss.RssSchemaTypes.ATOM;
import static org.junit.Assert.assertEquals;
import itrillian.feedreader.rss.RssAtomParser;
import itrillian.feedreader.rss.RssParser;

import org.junit.Test;

public class RssParserFactoryTest {

	@Test
	public void atom() {
		RssParser parser = getParserInstance(ATOM);
		assertEquals(RssAtomParser.class, parser.getClass());
	}
	
}
