package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssSchemaTypes.ATOM;
import static org.junit.Assert.assertEquals;
import itrillian.feedreader.rss.RssUtil;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class RssUtilTest {
	
	@Test
	public void getAtomSchema() throws ParserConfigurationException, SAXException, IOException {
		File file = new File("src/test/resources/itrillian/feedreader/rss/testRssFeed.xml");
		String schema = RssUtil.getSchema(file);
		assertEquals(ATOM, schema);
	}
}
