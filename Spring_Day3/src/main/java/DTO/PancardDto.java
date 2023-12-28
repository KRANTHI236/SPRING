package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pancard")
public class PancardDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pancardId;
	private String pancardNumber;
	private String pancardAuthority;

	public int getPancardId() {
		return pancardId;
	}

	public void setPancardId(int pancardId) {
		this.pancardId = pancardId;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardAuthority() {
		return pancardAuthority;
	}

	public void setPancardAuthority(String pancardAuthority) {
		this.pancardAuthority = pancardAuthority;
	}

}
