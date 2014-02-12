package itrillian.feedreader.rss;

import static itrillian.feedreader.rss.RssParserFactory.getParserInstance;
import static itrillian.feedreader.xml.XmlAttributes.SCHEMA;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class RssUtil {

	public static String getSchema(File file) throws ParserConfigurationException, SAXException, IOException {
		return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement().getAttribute(SCHEMA);
	}
	
	public static RssFeed parseFeedFromFile(File file) throws ParserConfigurationException, SAXException, IOException {
		return getParserInstance(getSchema(file)).parseFeed(file);
	}

	public static String getSchema(URL url) throws ParseException {
		try {
			return getSchema(getDocumentBuilder().parse(url.openStream()));
		} catch (SAXException | IOException e) {
			throw new ParseException(e);
		}
	}

	private static String getSchema(Document document) {
		return document.getDocumentElement().getAttribute(SCHEMA);
	}

	private static DocumentBuilder getDocumentBuilder() throws ParseException {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			throw new ParseException(e);
		}
	}

}
