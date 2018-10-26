package sec_verify.exam06;



import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class RootController implements Initializable{

		private Stage primaryStage;
		
		@FXML private MenuItem open;
		@FXML private MediaView mediaview;
		private File selectedfile;
	
	public void setPrimaryStage(Stage primaryStage) {
		
		this.primaryStage=primaryStage;
	}


	public void initialize(URL location, ResourceBundle resources) {
		
		open.setOnAction(e->{
			FileChooser filechooser = new FileChooser();
			
			selectedfile = filechooser.showOpenDialog(primaryStage);
			String path = selectedfile.toURI().toString();
			
			Media media = new Media(path);
			
			
			MediaPlayer mediaplayer = new MediaPlayer(media);
			
			mediaview.setMediaPlayer(mediaplayer);
			
			mediaplayer.play();
			
			
			
		});
		
		
		
	}
	
	
	
	
	
	
}
