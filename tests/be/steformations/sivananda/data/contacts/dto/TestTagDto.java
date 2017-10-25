package be.steformations.sivananda.data.contacts.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTagDto {

	private ContactsDtoFactory factory;

	@Before
	public void setUp() throws Exception {
		this.factory = new ContactsDtoFactory();
	}

	@Test
	public void testTagToXml() {
		TagDto source = new TagDto();
		source.setId(1);
		source.setValue("vamp");

		String xml = this.factory.tagToXml(source);
		System.out.println("tagToXml() => " + xml);

		TagDto copy = this.factory.xmlToTag(xml);
		System.out.println("xmlToTag() => " + copy);

		assertNotNull(copy);
		assertEquals(new Integer(1), copy.getId());
		assertEquals("vamp", copy.getValue());
	}

}
