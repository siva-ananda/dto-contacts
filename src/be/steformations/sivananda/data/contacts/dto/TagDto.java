package be.steformations.sivananda.data.contacts.dto;

@javax.xml.bind.annotation.XmlRootElement(name="tag") 
/* précise que pour la classe dao on a un élément racine xml
	<tag//Dto>
		<id>1</id>
 	<value>vamp</value>
</tag//Dto> */
public class TagDto {
	
	private Integer id;
	private String value;
	
	public TagDto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		TagDto other = (TagDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TagDto [id=" + id + ", value=" + value + "]";
	}

}
