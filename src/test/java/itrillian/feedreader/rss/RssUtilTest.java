package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssSchemaTypes.ATOM;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class RssUtilTest {

	@Test
	public void getAtomSchemaFromFile() throws ParseException {
		validate(RssUtil.getSchema(new File("src/test/resources/itrillian/feedreader/rss/atom/RssAtomTest.xml")));
	}

	@Test
	public void getAtomSchemaFromUrl() throws ParseException, MalformedURLException {
		validate(RssUtil.getSchema(new URL("https://github.com/ChristopheMees.atom")));
	}

	private void validate(String schema) {
		assertEquals(ATOM, schema);
	}
}
