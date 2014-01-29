package itrillian.feedreader.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LinkAdapter extends XmlAdapter<LinkAdapter.Link, String>{

    public static class Link {

        @XmlAttribute
        public String href;
    }

    @Override
    public String unmarshal(Link v) throws Exception {
        return v.href;
    }

    @Override
    public Link marshal(String v) throws Exception {
        Link link = new Link();
        link.href = v;
        return link;
    }

}
