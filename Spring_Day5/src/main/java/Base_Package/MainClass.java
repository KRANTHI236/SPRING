package Base_Package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Company.xml");
		Company company = (Company) applicationContext.getBean("company");

		System.out.println(company.getCompanyId());
		System.out.println(company.getCompanyName());
		System.out.println(company.getCompanyAddress());

		System.out.println(company.getComanyGst());
		System.out.println(company.getManager().getManageId());
		System.out.println(company.getManager().getManagerName());
		System.out.println(company.getManager().getManagerAddress());
		System.out.println(company.getManager().getManagerSal());

	}

}
