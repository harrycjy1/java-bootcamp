package sec_verify.exam03;





import java.util.Queue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalController {

	@FXML
	private Button bminus;
	@FXML
	private Button bnum;
	@FXML
	private Button benter;
	@FXML
	private Button b0;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	@FXML
	private Button b8;
	@FXML
	private Button b9;
	@FXML
	private Button bmultifly;
	@FXML
	private Button bdivine;
	@FXML
	private Button bpoint;
	@FXML
	private TextField tfresult = new TextField("0");
	
	public Double x;
	public Double y;
	public String sign = "default";
	public String clear = "1";

	public void shownumber(ActionEvent event) {

		Button btn = (Button) event.getSource();
	
		if(clear.equals("0")||sign.equals("+")||sign.equals("-")||sign.equals("*")||sign.equals("/")) {
			tfresult.setText(btn.getText());
			}
		
		else
		tfresult.appendText(btn.getText());
		
		clear = "1";
		y = Double.parseDouble(btn.getText());
	}
	
	public void add(ActionEvent event) {
		x = Double.parseDouble(tfresult.getText());
		Button btn = (Button) event.getSource();
		sign = btn.getText();
	}
	
	public void minus(ActionEvent event) {
		x = Double.parseDouble(tfresult.getText());
		Button btn = (Button) event.getSource();
		sign = btn.getText();
	}
	
	public void multifly(ActionEvent event) {
		x = Double.parseDouble(tfresult.getText());
		Button btn = (Button) event.getSource();
		sign = btn.getText();
	}
	
	public void divide(ActionEvent event) {
		x = Double.parseDouble(tfresult.getText());
		Button btn = (Button) event.getSource();
		sign = btn.getText();
	}
	
	public void getresult(ActionEvent event) {
	
		switch(sign){
		
		case "+" : 
			tfresult.setText(String.valueOf(y+x));
			break;
		case "-" :
			tfresult.setText(String.valueOf(y-x));
			break;
		case "*" :
			tfresult.setText(String.valueOf(y*x));
			break;
		case "/":
			tfresult.setText(String.valueOf(y/x));
			break;
		}
		
		x=Double.parseDouble(tfresult.getText());
		clear = "0";
	}
	
	public void clear(ActionEvent event) {
		tfresult.clear();
	}
	
		
	

}
