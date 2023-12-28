package Spring_Day7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Jeans implements ShoppingCart {

	@Override
	public void product() {
		System.out.println("this is jeans");

	}

}
