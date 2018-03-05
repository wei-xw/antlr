package bonc.antlr;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class XmlTest {
	public static void main(String[] args) {
		List<VertexAddr> VertexAddrs=new ArrayList<VertexAddr>();
		VertexAddrs.add(new VertexAddr("068418ad-e3cc-46c0-9582-804e5a8e24ac",1,1,1,1,false));
		VertexAddrs.add(new VertexAddr("2",1,1,1,1,false));

		XStream xstream = new XStream();
		xstream.alias("VertexAddrs", List.class);
		xstream.alias("VertexAddr", VertexAddr.class);
		 xstream.autodetectAnnotations(true);
		 StringBuilder sb = new StringBuilder(
					"<?xml version=\"1.0\"?><VertexsAddr xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
			sb.append(xstream.toXML(VertexAddrs));
	     System.out.println(sb.toString().replace("\n",""));
	}

}
