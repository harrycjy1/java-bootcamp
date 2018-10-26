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
		//재생할 소스(Media)를 생성함
				//동영상
				//Media media = new Media(getClass().getResource("media/video.m4v").toString());
				//Media media = new Media(getClass().getResource("media/피고인.mp4").toString());
				
				//오디오
				Media media = new Media(getClass().getResource("media/너무너무너무.mp3").toString());
				System.out.println(getClass().getResource("media/너무너무너무.mp3").toString());
				
				
				MediaPlayer mediaplayer = new MediaPlayer(media);
				
				
				mediaview.setMediaPlayer(mediaplayer);
				
				
				mediaplayer.setOnReady(new Runnable() {
					
					@Override
					public void run() {
						btnPlay.setDisable(false);   	
						btnPause.setDisable(true);		
						btnStop.setDisable(true);
						
						//재생정도를 미디어 슬라이더에 최고값과 최소값을 초단위로 매핑함
						sliderMedia.setMin(0.0);
						sliderMedia.setValue(0.0);
						sliderMedia.setMax(mediaplayer.getTotalDuration().toSeconds());
						
						/*MediaPlayer의 현재시간을 속성감시를 한다. 시간이기에 제네릭타입은 Duration이다
						재생이 되면서 currentTime이 변경되면, 그 값은 newValue에 계속 들어가게 되고
						이 currentTime을 Progressbar나 progressindicator에 나타내기 위해서는 0.0~1.0
						사이의 값으로 환산하여 나타내어줘야 한다.*/
						
						mediaplayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

							public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
									Duration newValue) {
								
								double progress = mediaplayer.getCurrentTime().toSeconds()/
													mediaplayer.getTotalDuration().toSeconds();
								
								//0.0~1.0사이의 값을 각각 설정해준다.
								progressBar.setProgress(progress);
								progressIndicator.setProgress(progress);
								
								//동영상의 재생정도를 나타낸다.
								sliderMedia.setValue(mediaplayer.getCurrentTime().toSeconds());
								
								//재생시간을 Label에 표시하기 위한 설정(Double타입을 보기좋게 int타입으로 강제 변환
								LabelTime.setText((int)mediaplayer.getCurrentTime().toSeconds()+"/"+
								(int)mediaplayer.getTotalDuration().toSeconds()+"초");
								
								sliderMedia.setValue(mediaplayer.getCurrentTime().toSeconds());
								
							}
						});
						
					}
				});
				
				//미디어 소스가 실행중일때 (람다식)
				mediaplayer.setOnPlaying(()->{
					btnPlay.setDisable(true);
					btnPause.setDisable(false);
					btnStop.setDisable(false);
				});
				
				//일시중지
				mediaplayer.setOnPaused(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(false);
				});
				
				//미디어 소스가 정지(stop)상태가 되었을때 시행할 내용
				mediaplayer.setOnStopped(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(true);
					
				});
				
				//미디어 소스 재생이 완료가 되었을때 실행할 내용
				mediaplayer.setOnEndOfMedia(()->{
					btnPlay.setDisable(false);
					btnPause.setDisable(true);
					btnStop.setDisable(true);
					
					
					/*문제는 재생이 완료가 되어도 재생버튼은 활성화가 되어 클릭이 되지만, 재생이 되질 않음
					 * 이유는 재생완료 시점에 그 소스의 상태가 머물러 있기 때문 하여 명시적으로 stop()을 호출하고 그 소스의
					 * 시간을 맨 첨으로 돌려주는 코드를 코딩해야 한다. 하여, 위에 선언한 플래그변수를 true로 설정
					 */
					endOfMedia = true;
					
					
					//강제적으로 1.0을 설정하여 완료(DOne)상태가 나오도록 하자
					progressBar.setProgress(1.0);
					progressIndicator.setProgress(1.0);
				});
				
				//플레이 버튼을 누렀을때 동영상 실행하는 이벤트 처리코드
				btnPlay.setOnAction(event ->{
					//플래그 변수가 true가 되었다는 것은 미디어 상태가 endofmedia상태라는 것이다
					//그러므로 아래와 같이 명시적으로 stop()을 호출하여주고, 미디어의 처음 시간으로 돌려주는 코드를 추가
					
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

				//일시정지 버튼
				btnPause.setOnAction(event -> mediaplayer.pause());
				
				//정지버튼
				btnStop.setOnAction(event -> mediaplayer.stop());
				
				
		
	}
	
	
}
