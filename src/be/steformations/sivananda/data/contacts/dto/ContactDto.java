package be.steformations.sivananda.data.contacts.dto;

import java.util.ArrayList;
import java.util.List;

@javax.xml.bind.annotation.XmlRootElement(name="contact")
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD) 
public class ContactDto {
	
	private Integer id;
	private String firstname;
	private String name;
	private String email;
	private CountryDto country;
	@javax.xml.bind.annotation.XmlElementWrapper(name="tags")
	@javax.xml.bind.annotation.XmlElement(name="tag")
	private List<TagDto> tags;
	
	
	public ContactDto() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public CountryDto getCountry() {
		return country;
	}


	public void setCountry(CountryDto country) {
		this.country = country;
	}


	public List<TagDto> getTags() {
		if (this.tags == null){
			this.tags = new ArrayList<>();
		}
		return tags;
	}


	public void setTags(List<TagDto> tags) {
		this.tags = tags;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDto other = (ContactDto) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ContactDto [id=" + id + ", firstname=" + firstname + ", name=" + name + ", email=" + email
				+ ", country=" + country + ", tags=" + tags + "]";
	}

}
