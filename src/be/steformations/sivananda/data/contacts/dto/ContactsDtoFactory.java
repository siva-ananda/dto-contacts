package be.steformations.sivananda.data.contacts.dto;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ContactsDtoFactory {

	private JAXBContext jaxbContext;

	public ContactsDtoFactory() throws RuntimeException {
		super();
		try {
			this.jaxbContext = JAXBContext.newInstance(TagDto.class, CountryDto.class, ContactDto.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/* for the tags */
	public String tagToXml(TagDto tag) {
		return this.objectToXml(tag);
	}

	public TagDto xmlToTag(String xml) {
		return (TagDto) this.xmlToObject(xml);
	}

	/* for the countries */
	public String countryToXml(CountryDto country) {
		return this.objectToXml(country);
	}

	public CountryDto xmlToCountry(String xml) {
		return (CountryDto) this.xmlToObject(xml);
	}
	
	/* for the contacts */
	public String contactToXml(ContactDto contact) {
		return this.objectToXml(contact);
	}

	public ContactDto xmlToContact(String xml) {
		return (ContactDto) this.xmlToObject(xml);
	}

	private String objectToXml(Object object) {
		String xml = null;
		try (ByteArrayOutputStream output = new ByteArrayOutputStream();) {
			Marshaller marshaller = this.jaxbContext.createMarshaller();
			marshaller.marshal(object, output);
			xml = output.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xml;
	}

	private Object xmlToObject(String xml) {
		Object object = null;
		try (StringReader input = new StringReader(xml);) {
			Unmarshaller unmarshaller = this.jaxbContext.createUnmarshaller();
			object = unmarshaller.unmarshal(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}
