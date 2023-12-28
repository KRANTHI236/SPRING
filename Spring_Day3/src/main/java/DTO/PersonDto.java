package DTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class PersonDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int personId;
	private String personName;
	private int personAge;
	private String personAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private PancardDto pancard;

	public PancardDto getPancard() {
		return pancard;
	}

	public void setPancard(PancardDto pancard) {
		this.pancard = pancard;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

}
