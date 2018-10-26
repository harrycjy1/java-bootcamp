package sec06.exam02_input;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{

	
	@FXML private TextField txtTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea txtContent;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	public void handleBtnregAction(ActionEvent event) {
		String title = txtTitle.getText();
		System.out.println("제목 : "+title);
		
		String password = txtPassword.getText();
		System.out.println("비밀번호 : "+password);
		
		String strPublic = comboPublic.getValue();
		if(strPublic != null) {
			System.out.println("공개 여부 : "+strPublic);
		}
		
		//DatePicker는 사용자로부터 날짜가 선택이 되어야지만 그값을 LocatDate로 리턴을 한다.
		//하지만 아무선택을 하지 않았다면 null이 리턴되어 지므로 유효성 검사를 해야한다
		LocalDate localDate = dateExit.getValue();
		if(localDate !=null) {
			System.out.println("게시 종료일 :"+localDate.toString());
		}
		
		String content = txtContent.getText();
		System.out.println("내 용 : "+content);
	}
	
	
	
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
	
	
}
