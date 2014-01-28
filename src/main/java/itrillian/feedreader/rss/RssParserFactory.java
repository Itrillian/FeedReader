package itrillian.feedreader.rss;

import itrillian.feedreader.rss.atom.RssAtomParser;

public class RssParserFactory {

	public static RssParser getParserInstance(String schema) {
		if(schema.equals(RssSchemaTypes.ATOM)) {
			return new RssAtomParser();
		}
		throw new RuntimeException("Couldn't select a parser for this feed");
	}
}
