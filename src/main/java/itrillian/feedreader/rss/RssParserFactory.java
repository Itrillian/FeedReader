package itrillian.feedreader.rss;

public class RssParserFactory {

	public static RssParser getParserInstance(String schema) {
		if(schema.equals(RssSchemaTypes.ATOM)) {
			return new RssAtomParser();
		}
		throw new RuntimeException("Couldn't select a parser for this feed");
	}
}
