package Spring_Day6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Forest {

	@Autowired
	@Qualifier("lion")
	Animal animal;

	public void noise() {
		System.out.println("animal makes sound");
		animal.sound();
	}
}
