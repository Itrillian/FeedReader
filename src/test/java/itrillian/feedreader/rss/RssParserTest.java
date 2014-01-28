package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssParserFactory.getParserInstance;
import static itrillian.feedreader.rss.RssUtil.getSchema;
import itrillian.feedreader.rss.RssParser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class RssParserTest {

	@Test
	public void parseFeedTest() throws ParserConfigurationException, SAXException, IOException {
		File file = new File("src/test/resources/itrillian/feedreader/rss/testRssFeed.xml");
		String schema = getSchema(file);
		RssParser parser = getParserInstance(schema);
		parser.parseFeed(file);
	}
}
