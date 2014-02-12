package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssSchemaTypes.ATOM;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import java.net.URL;

import org.junit.Test;
import org.xml.sax.SAXException;

public class RssUtilTest {

	@Test
	public void getAtomSchema() throws ParserConfigurationException, SAXException, IOException {
		validate(RssUtil.getSchema(new File("src/test/resources/itrillian/feedreader/rss/atom/RssAtomTest.xml")));
	}

	@Test
	public void getAtomSchemaFromUrl() throws ParserConfigurationException, SAXException, IOException, MalformedURLException {
		validate(RssUtil.getSchema(new URL("https://github.com/ChristopheMees.atom")));
	}

	private void validate(String schema) {
		assertEquals(ATOM, schema);
	}
}
