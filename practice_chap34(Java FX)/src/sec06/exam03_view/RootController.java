package sec06.exam03_view;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.scene.control.SelectedCellsMap;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	@FXML private Button btnOk;
	@FXML private Button btnCancel;
	
	public void initialize(URL location, ResourceBundle resources) {
		//ListView�� ������ String�� ������ observableArrayList�÷����� ����
		//�ε����� 0���� 6�����̴�.
		listView.setItems(FXCollections.observableArrayList("������S1","������S2","������S3","������S4","������S5","������S6","������S7"));
		
		//TableView�� ǥ�õ� �ప�� ��ü�� �����ϱ� ���� �÷��� ����
		//7���� ��ü�� �����Ǿ����� 7���� ���� ������ ���̴�.
		ObservableList<Phone> phoneList = FXCollections.observableArrayList(
				new Phone("������S1","phone01.png"),
				new Phone("������S2","phone02.png"),
				new Phone("������S3","phone03.png"),
				new Phone("������S4","phone04.png"),
				new Phone("������S5","phone05.png"),
				new Phone("������S6","phone06.png"),
				new Phone("������S7","phone07.png")
				);
		
		//TableView�� �ش��÷��� ���ͼ� �� �÷��� ������ �� cell�� ����� �� ���� Phone��ü�� �ʵ�� ������ ���ִ� �۾��̴�.
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		//���� ���� Phone�� smartPhone�ʵ�� �����Ѵ�.
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment : CENTER;"); //CSS��Ÿ���̴� �ڿ� �Ѵ�
		
		TableColumn tcImage = tableView.getColumns().get(1);
		//���� ���� Phone�� image�ʵ�� �����Ѵ�.
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment : CENTER;");
		
		//���Ͱ��� ����� ������ ���� observableArrayList�÷����� TableView�� ������ �����Ѵ�.
		tableView.setItems(phoneList);
		
		//�̺�Ʈ ó�� �κ�
		//lisetview�� �Ӽ����� change������ ���
		
		
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
			//Listview���� �׸��� ���õǾ� �ε����� �ٲ�� tableView�� ���ϵ� �ε����� �Ű������� �ָ� 
			//TableView�� �൵ �ڵ� �ٲ�� �Ͽ���
				
			//�ε����� �Ű����̴�.
			tableView.getSelectionModel().select(newValue.intValue());
			
			//�Ѿ�� �ε����� ȭ��� ������ �������� ������ ���̰Բ� ��ũ���� �����Ѵ�.
			tableView.scrollTo(newValue.intValue());
			}
		});
		
		
		//TableView�� �׸� ���ÿ� ���� ���� ���� �Ӽ������̴�.
		//����, selectedIndexproperty()�� �ε����� ������ �Ӽ��� �����Ѵ�.
		//�ε����� ���� �̹����信 �̹����� ���ϰԲ� �ϴ� ���̴�.
		//�̷��� �ε����� �̿��ϸ� Image��ü�� URL�� ���鶧 ������ ���� ���� �ִ�.
		//�Ͽ� ��� 2�� ����ϴ°��� �����Ѵ�.
		
		//���1
		/*tableView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if(newValue != null) {
					imageView.setImage(new Image(getClass().getResource("images/phone0"+newValue.intValue()+".png").toString()));
					
					listView.getSelectionModel().select(newValue.intValue());
				}
			}
		});
		*/
		//���2
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				if(newValue!=null) {
					//selectedItemProperty()�� �̿��� �Ѿ�� Phone�� �̿��ؼ� �̹����� ���ϰԲ� �Ͽ���
					imageView.setImage(new Image(getClass().getResource("images/"+newValue.getImage()).toString()));
					}
			}
		});
		
		///��ư �̺�Ʈ ó�� (���ٽ�)
		
		btnOk.setOnAction(event -> handleBtnOkAction(event));
		btnCancel.setOnAction(event -> handleBtnCancelAction(event));
	
		}
	
	public void handleBtnOkAction(ActionEvent event) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView�� ���õ� ����Ʈ�� "+item);
		
		//TableView�� ���� Phone��ü�̴� �Ͽ� Phone���� �޾�����Ѵ�
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView ���õ� ����Ʈ�� : "+phone.getSmartPhone());
		System.out.println("TableView ���õ� �̹��� : "+phone.getImage());
	}
	
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
}
