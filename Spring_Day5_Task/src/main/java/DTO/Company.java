package DTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "company")
@Component
public class Company {
	@Id
	@Value("1")
	private int companyId;
	@Value("tcs")
	private String companyName;
	@Value("23JYGPK9050F23")
	private String comanyGst;
	@Value("hyd")
	private String companyAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@Autowired
	private Manager manager;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getComanyGst() {
		return comanyGst;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

}
