package itrillian.feedreader.rss.atom;

import itrillian.feedreader.rss.RssParser;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RssAtomParser implements RssParser {

	private static final Logger LOGGER = LogManager.getLogger(RssAtomParser.class);

	@Override
	public AtomFeed parseFeed(File file) {
		AtomFeed atomFeed = null;
		try {
			JAXBContext context = JAXBContext.newInstance(AtomFeed.class);
	        atomFeed = (AtomFeed) context.createUnmarshaller().unmarshal(file);

	        if(LOGGER.isDebugEnabled()) {
	        	ByteArrayOutputStream output = new ByteArrayOutputStream();
	        	Marshaller marshaller = context.createMarshaller();
		        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        	marshaller.marshal(atomFeed, output);
	        	LOGGER.debug("\n" + output);
	        }
		} catch(JAXBException e) {
			e.printStackTrace();
		}
		return atomFeed;
	}
}
