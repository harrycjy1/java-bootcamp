package sec_verify.exam05;

import javafx.beans.property.SimpleStringProperty;

public class Car {

	private SimpleStringProperty carName;
	private SimpleStringProperty image;
	
	public Car() {
		this.carName = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
	}
	
	public Car(String name, String image) {
		this.carName = new SimpleStringProperty(name);
		this.image = new SimpleStringProperty(image);
	}
	
	public String getCar() {
		return carName.get();
	}
	public String getImage() {
		return image.get();
	}
	
	public void setCar(String carname) {
		this.carName.set(carname);
	}
	
	public void setImage(String image) {
		this.image.set(image);
	}
}
