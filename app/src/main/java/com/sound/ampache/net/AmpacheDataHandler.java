package com.sound.ampache.net;

import com.sound.ampache.objects.ampacheObject;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.CharArrayWriter;
import java.util.ArrayList;

/**
 * Created by dejvino on 2.11.14.
 */
/*package-private*/ class AmpacheDataHandler extends DefaultHandler
{
	public ArrayList<ampacheObject> data = new ArrayList();
	public String error = null;
	public int errorCode = 0;
	public int errErrorCode = 0;
	protected CharArrayWriter contents = new CharArrayWriter();

	private boolean found = false;
	public void startDocument() throws SAXException
	{

	}

	public void endDocument() throws SAXException
	{

	}

	public void characters(char[] ch, int start, int length) throws SAXException
	{
		contents.write(ch, start, length);
	}

	public void startElement(String namespaceURI,
	                         String localName,
	                         String qName,
	                         Attributes attr) throws SAXException
	{

		if (!found && "error".equalsIgnoreCase(localName)) {
			String code = attr.getValue("code");
			if (code != null) {
				errorCode = Integer.parseInt(code);
				found = true;
			}
			String errCode = attr.getValue("errorCode");
			if (errCode != null) {
				errErrorCode = Integer.parseInt(errCode);
				found = true;
			}
		}
		contents.reset();
	}

	public void endElement(String namespaceURI,
	                       String localName,
	                       String qName) throws SAXException
	{
		if (localName.equals("error")) {
			error = contents.toString();
		}
	}

}
