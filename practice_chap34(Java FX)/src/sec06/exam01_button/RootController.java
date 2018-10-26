package sec06.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{

	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView chkImageView;
	@FXML private ImageView radioImageView;
	@FXML private ToggleGroup group;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//ToggleGroup�� �������ִ� RadioButton�� �Ӽ����ø� ���� ImageView�� Image�� 
		//�ѷ������� �Ѵ�. RadioButton�� �ٲ� �� ���� ChangeListener�� �߻��Ͽ� root.fxml
		//���Ͽ� �ִ� RadioButton�� �ִ� userData="" �Ӽ��� �̿��ؼ� �����̸��� ������ ��,
		//ImageView�� �ѷ��ش�.
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/"+
								newValue.getUserData().toString()).toString());
				radioImageView.setImage(image);
			}
			
		});
	}
	public void handleChkAction(ActionEvent event) {
		if(chk1.isSelected() && chk2.isSelected()) {
			//ImageView�� setImage�� �Ű������� Image��ü�� �ָ� �Ǵµ� ���� ������ �������� ����θ� ��´�.
			//Image�� �Ű����� StringŸ���� ���ڿ� URL�̴�. 
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		}
		else if(chk1.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}
		else if(chk2.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}
		else {
			chkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}
	
	public void handleBtnExitAction(ActionEvent event) {
		System.out.println("��ưŬ������ ���ø����̼� ����");
		Platform.exit();
	}
}