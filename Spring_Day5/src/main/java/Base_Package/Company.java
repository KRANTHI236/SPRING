package Base_Package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("1")
	private int companyId;
	@Value("tcs")
	private String companyName;
	@Value("23JYGPK9050F23")
	private String comanyGst;
	@Value("hyd")
	private String companyAddress;
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
