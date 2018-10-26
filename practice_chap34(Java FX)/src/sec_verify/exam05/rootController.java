package sec_verify.exam05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class rootController implements Initializable{

	@FXML private TableView<Car> table;
	@FXML private ImageView imageview;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		
		ObservableList<Car> list = FXCollections.observableArrayList(
				new Car("car1","car1.jpg"),
				new Car("car2","car2.jpg"),
				new Car("car3","car3.jpg"),
				new Car("car4","car4.jpg"),
				new Car("car5","car5.jpg"),
				new Car("car6","car6.jpg")
				);
		 
		TableColumn column = table.getColumns().get(0);
		column.setCellValueFactory(new PropertyValueFactory("car"));
		column.setStyle("-fx-alignment : CENTER;");
	
		
		TableColumn column2 = table.getColumns().get(1);
		column2.setCellValueFactory(new PropertyValueFactory("image"));
		column2.setStyle("-fx-alignment : CENTER;");
		
		table.setItems(list);
		
		
		table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Car>() {

			public void changed(ObservableValue<? extends Car> observable, Car oldValue, Car newValue) {
				if(newValue!=null) {
				imageview.setImage(new Image(getClass().getResource("images/"+newValue.getImage()).toString()));
				}
				
				
			}
		});
		
		
	}

}
