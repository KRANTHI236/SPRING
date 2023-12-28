package DTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private String carColour;
	private double carPrice;

	@OneToOne(cascade = CascadeType.ALL)
	private Engine engine;

	public Car( String carName, String carColour, double carPrice, Engine engine) {
		super();
//		this.carId = carId;
		this.carName = carName;
		this.carColour = carColour;
		this.carPrice = carPrice;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carColour=" + carColour + ", carPrice=" + carPrice
				+ ", engine=" + engine + "]";
	}

}
