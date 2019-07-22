package com.zensar.xml.sax.parcels;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class movieXmlHandler extends DefaultHandler {

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		for(int i = start; i <start+length; i++ ){
			System.out.print(ch[i]);
	}
	System.out.println();
}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end of xml document");
	}

	@Override
	public void endElement(String arg0, String arg1, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end element" + qName);
		
	}

	@Override
	public void startDocument() throws SAXException {
		
		// TODO Auto-generated method stub
		System.out.println("starting document...");
	}

	@Override
	public void startElement(String arg0, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("starting element:" + qName);
	}

}
