package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssParserFactory.getParserInstance;
import static itrillian.feedreader.xml.XmlAttributes.SCHEMA;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class RssUtil {

	public static String getSchema(File file) throws ParserConfigurationException, SAXException, IOException {
		return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement().getAttribute(SCHEMA);
	}
	
	public static RssFeed parseFeedFromFile(File file) throws ParserConfigurationException, SAXException, IOException {
		return getParserInstance(getSchema(file)).parseFeed(file);
	}
}
