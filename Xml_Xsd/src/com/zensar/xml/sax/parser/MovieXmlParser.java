package com.zensar.xml.sax.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MovieXmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			
			SAXParser parser = saxParserFactory.newSAXParser();
			parser.parse(new File("./src/movie_Info.xml"), new MovieXmlHandler());
		
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
