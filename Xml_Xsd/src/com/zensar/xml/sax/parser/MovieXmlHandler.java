package com.zensar.xml.sax.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MovieXmlHandler extends DefaultHandler {

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		for(int i=start;i<start+length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("End of XML Document");
	}

	@Override
	public void endElement(String arg0, String arg1, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("End Element: "+ qName);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Starting .....");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Starting Element: " + qName);
	}
	
}
