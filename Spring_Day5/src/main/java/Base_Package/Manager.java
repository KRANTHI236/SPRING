package Base_Package;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	@Value("1")
	private int manageId;
	@Value("kiran")
	private String managerName;
	@Value("200000")
	private double managerSal;
	@Value("hyd")
	private String managerAddress;

	public int getManageId() {
		return manageId;
	}

	public String getManagerName() {
		return managerName;
	}

	public double getManagerSal() {
		return managerSal;
	}

	public String getManagerAddress() {
		return managerAddress;
	}

}
