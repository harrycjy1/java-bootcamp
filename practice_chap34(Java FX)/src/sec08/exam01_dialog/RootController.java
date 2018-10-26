package sec08.exam01_dialog;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController {

	private Stage primaryStage;
	
	
	public void setPrimaryStage(Stage primaryStage) {
		
		this.primaryStage=primaryStage;
	}
	
	public void handleOpenFileChooser(ActionEvent event) {
		
		FileChooser fileChooser = new FileChooser();
		//getExtensionFilters()�� ����Ȯ����� �������� ���͸��� ���ִ� �޼����̸�
		//�ƿ﷯ �Ű����� ExtensionFilterŬ������ ������
		fileChooser.getExtensionFilters().addAll(
				//���͸��� ���� : txt files(*.txt), ���͸� ���� : *.txt
				new ExtensionFilter("Txt Files","*.txt"),
				new ExtensionFilter("Image Files","*.png","*.jpg","*.gif"),
				new ExtensionFilter("Audio Files","*.mp3","*.wav","*.aac"),
				new ExtensionFilter("All Files","*.*")
				);
		//ù���� ������� primaryStage�� ������ ��� ���̴�.
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		/*showOpenDialog()�� ����ڰ� ���� ��ư�� ��������, �� ������ ������ ���´�
		�� ��ҳ� X��ư�� ���������� null���� �Ѱ�����.
		showOpenDialog()�� �Ű����� ������ ������(primaryStage)�ε�, ���⼭�� 2���� ������� �����̳ʸ�
		���� ������ �� �������� ������ ���� ����̴�. ���� ShowSaveDialog()�� �����Ҵ� ���� FileChooser�̴�.*/
		
		//File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
		
		//���õ� ������ ���� �����Ͽ� ó���� ���ش�.
		if(selectedFile != null) {
			System.out.println("�����Ͻ� ��� : "+selectedFile.getPath());
		}
	}
	
	public void handleSaveFileChooser(ActionEvent event) {
		
		FileChooser filechooser =new FileChooser();
		filechooser.getExtensionFilters().addAll(
				new ExtensionFilter("All files", "*.*")
				);
		
		//ù��° ������� primaryStage�� ������ ��´�.
		File selectedFile = filechooser.showSaveDialog(primaryStage);
		
		//���õ� ������ ���� �����Ͽ� ó���� ���ش�.
		if(selectedFile != null) {
			System.out.println("����� ���� ��� : "+selectedFile.getPath());
		}
	}
	
	public void handleOpenDirectoryChooser(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		
		//ù���� ���������� primaryStage�� ������ ��´�.
		File selectedFile = directoryChooser.showDialog(primaryStage);
		//���õ� ���丮�� ���� �����Ͽ� ó���� ���ش�.
		if(selectedFile != null)
			System.out.println("���õ� ���丮 ��� : "+selectedFile.getPath());
	}
	
	//Popup
	public void handlePopup(ActionEvent event) throws Exception {
		//Popup ��ü ����
		Popup popup = new Popup();
		//fxml���Ϸ� �ۼ��� load
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
//		�˾��� ���� ----------
//		lookup()�� �Ű������� fxml������ id���̴� �� ImageView�� ã�°��̴�.
//		���ϰ��� Node�̹Ƿ� ����Ÿ�� ��ȯ�Ͽ� imageView�� ������ �ȴ�.
//		Imageview�� node�� ��ӹޱ� ������ �����ϴ�. #�� id�� ������ �ִ� ��ü��
//		�����϶�� ���̴�. �ñ������� �̷��� �ϴ� ������ �ڹ��ڵ忡�� �������� �̹�����
//		�������ֱ� ����
		
		ImageView imageView = (ImageView) parent.lookup("#imgMessage");
		imageView.setImage(new Image(getClass().getResource("image/dialog-info.png").toString()));
		//imageView�� Ŭ���� �����ϴ� �̺�Ʈ ó�� �κ�
		imageView.setOnMouseClicked(e -> popup.hide());
		//Label���� lookup()�� �̿��ؼ� �������� Label�� �ؽ�Ʈ�� �����Ҽ��� �ִ�.
		Label lblmessage = (Label) parent.lookup("#lblMessage");
		lblmessage.setText("�޽����� �Խ��ϴ�.");
		
		//POPupâ�� fxml������ ������ �߰��Ѵ�.
		popup.getContent().add(parent);
		//Popupâ�� ���콺�� ��Ŀ���� �ٸ�������� ���� �ڵ� ����
		popup.setAutoHide(true);
		popup.show(primaryStage);
	}
	
	public void handleCustom(ActionEvent event) throws IOException {
		//������ ����̰� ����� �ݱ� ��ư�� �ִ� Stage����
		Stage dialog = new Stage(StageStyle.UTILITY);
		//dialog�� ���(������������ ���Ұ�)�� ����
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage); //��������(������) ����
		dialog.setTitle("Ȯ��");
		//dialog���� �ε�
		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		//fxml���Ͽ� �ִ� Label��Ʈ���� ������ ��� �������� �޽��� �ۼ�
		Label txtTitle = (Label) parent.lookup("#txtTitle");
		txtTitle.setText("Ȯ���ϼ̽��ϱ�?"); //Label���� ����
		//Button���� ���� ���� fxml���� ������ ��� �̺�Ʈ ó��
		
		Button btnOk = (Button)parent.lookup("#btnOK");
		btnOk.setOnAction(e -> dialog.close());
		
		//���̾�α׿��� x��ư�� ��������.
		dialog.setOnCloseRequest(e -> System.out.println("���̾�α�����Ŭ��"));
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
}
