package sec05.exam01_property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable{

	@FXML private Label label1;
	@FXML private Label label2;
	@FXML private Slider slider;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Thread.currentThread().getName());
		
		
		//slider��Ʈ���� �Ӽ����� �����ϱ� ���� valueProperty()�� ChangeListener ���
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			/*oldValue�� ����Ǳ� ������, newValue�� ����Ȱ��� �ǹ��Ѵ�.
			< ? extends Number>�� ���׸� ���ϵ� ī�� Ÿ������ NumberŬ������ 
			Number�� ��ӹ޴� ����Ŭ������ ������ ���������� �����Ѵ�*/
			
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				//Slider�� ���� ����(�ۼ�����)�� ���� Label��Ʈ���� Font������ ���� ���������ν� ������ ũ�Ⱑ �ٲ�� �Ǵ°��̴�.
				label1.setFont(new Font(arg2.doubleValue()));
				label2.setFont(new Font(arg2.doubleValue()));
				System.out.println("������ �� : "+arg1.doubleValue());
				System.out.println("������ �� : "+arg2.doubleValue());
			}
		});
		
		
	}
}
