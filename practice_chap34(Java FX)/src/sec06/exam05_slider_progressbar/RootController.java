package sec06.exam05_slider_progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable{

	@FXML private MediaView mediaview;
	@FXML private ImageView imageview;
	@FXML private Button btnPlay,btnPause,btnStop;
	
	@FXML private Label LabelTime;
	@FXML private Slider sliderVolume,sliderMedia;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	
	private boolean endOfMedia;
	Duration mediaduration;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		//����� �ҽ�(Media)�� ������
				//������
				//Media media = new Media(getClass().getResource("media/video.m4v").toString());
				//Media media = new Media(getClass().getResource("media/�ǰ���.mp4").toString());
				
				//�����
				Media media = new Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());
				System.out.println(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());
				
				
				MediaPlayer mediaplayer = new MediaPlayer(media);
				
				
				mediaview.setMediaPlayer(mediaplayer);
				
				
				mediaplayer.setOnReady(new Runnable() {
					
					@Override
					public void run() {
						btnPlay.setDisable(false);   	
						btnPause.setDisable(true);		
						btnStop.setDisable(true);
						
						//��������� �̵�� �����̴��� �ְ��� �ּҰ��� �ʴ����� ������
						sliderMedia.setMin(0.0);
						sliderMedia.setValue(0.0);
						sliderMedia.setMax(mediaplayer.getTotalDuration().toSeconds());
						
						/*MediaPlayer�� ����ð��� �Ӽ����ø� �Ѵ�. �ð��̱⿡ ���׸�Ÿ���� Duration�̴�
						����� �Ǹ鼭 currentTime�� ����Ǹ�, �� ���� newValue�� ��� ���� �ǰ�
						�� currentTime�� Progressbar�� progressindicator�� ��Ÿ���� ���ؼ��� 0.0~1.0
						������ ������ ȯ���Ͽ� ��Ÿ������� �Ѵ�.*/
						
						mediaplayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

							public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
									Duration newValue) {
								
								double progress = mediaplayer.getCurrentTime().toSeconds()/
													mediaplayer.getTotalDuration().toSeconds();
								
								//0.0~1.0������ ���� ���� �������ش�.
								progressBar.setProgress(progress);
								progressIndicator.setProgress(progress);
								
								//�������� ��������� ��Ÿ����.
								sliderMedia.setValue(mediaplayer.getCurrentTime().toSeconds());
								
								//����ð��� Label�� ǥ���ϱ� ���� ����(DoubleŸ���� �������� intŸ������ ���� ��ȯ
								LabelTime.setText((int)mediaplayer.getCurrentTime().toSeconds()+"/"+
								(int)mediaplayer.getTotalDuration().toSeconds()+"��");
								
								sliderMedia.setValue(mediaplayer.getCurrentTime().toSeconds());
								
							}
						});
						
					}
				});
				
				//�̵�� �ҽ��� �������϶� (���ٽ�)
				mediaplayer.setOnPlaying(()->{
					btnPlay.setDisable(true);
					btnPause.setDisable(false);
					btnStop.setDisable(false);
				});
				
				//�Ͻ�����
				mediaplayer.setOnPaused(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(false);
				});
				
				//�̵�� �ҽ��� ����(stop)���°� �Ǿ����� ������ ����
				mediaplayer.setOnStopped(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(true);
					
				});
				
				//�̵�� �ҽ� ����� �Ϸᰡ �Ǿ����� ������ ����
				mediaplayer.setOnEndOfMedia(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(true);
					
					
					/*������ ����� �Ϸᰡ �Ǿ �����ư�� Ȱ��ȭ�� �Ǿ� Ŭ���� ������, ����� ���� ����
					 * ������ ����Ϸ� ������ �� �ҽ��� ���°� �ӹ��� �ֱ� ���� �Ͽ� ��������� stop()�� ȣ���ϰ� �� �ҽ���
					 * �ð��� �� ÷���� �����ִ� �ڵ带 �ڵ��ؾ� �Ѵ�. �Ͽ�, ���� ������ �÷��׺����� true�� ����
					 */
					endOfMedia = true;
					
					
					//���������� 1.0�� �����Ͽ� �Ϸ�(DOne)���°� �������� ����
					progressBar.setProgress(1.0);
					progressIndicator.setProgress(1.0);
				});
				
				//�÷��� ��ư�� �������� ������ �����ϴ� �̺�Ʈ ó���ڵ�
				btnPlay.setOnAction(event ->{
					//�÷��� ������ true�� �Ǿ��ٴ� ���� �̵�� ���°� endofmedia���¶�� ���̴�
					//�׷��Ƿ� �Ʒ��� ���� ��������� stop()�� ȣ���Ͽ��ְ�, �̵���� ó�� �ð����� �����ִ� �ڵ带 �߰�
					
					if(endOfMedia) {
						mediaplayer.stop();
						mediaplayer.seek(mediaplayer.getStartTime());
						endOfMedia=false;
					}
					mediaplayer.play();
				});
				
				sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
					
					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue,
							Number newValue) {
						
						mediaplayer.setVolume(sliderVolume.getValue()/100.0);
						
					}
				});
				
				sliderVolume.setValue(50.0);
				
				
				sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {

					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue,
							Number newValue) {
						if(sliderMedia.isValueChanging()||(Math.abs(oldValue.doubleValue()-newValue.doubleValue())>0.5)){
							mediaplayer.seek(Duration.seconds(sliderMedia.getValue()));
						}				
					}
				});

				//�Ͻ����� ��ư
				btnPause.setOnAction(event -> mediaplayer.pause());
				
				//������ư
				btnStop.setOnAction(event -> mediaplayer.stop());
				
				
		
	}
	
	
}
