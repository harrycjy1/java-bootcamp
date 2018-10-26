package sec06.exam04_mediaview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable{
	
	@FXML private MediaView mediaview;
	@FXML private ImageView imageview;
	@FXML private Button btnPlay,btnPause,btnStop;
	
	private boolean endOfMedia;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//재생할 소스(Media)를 생성함
		//동영상
		//Media media = new Media(getClass().getResource("media/video.m4v").toString());
		Media media1 = new Media(getClass().getResource("media/피고인.mp4").toString());
		
		//오디오
		//Media media2 = new Media(getClass().getResource("media/너무너무너무.mp3").toString());
		
		//MediaPlayer가 재생할 소스를 매개값을 가지고 Mediaplayer를 생성함
		MediaPlayer mediaplayer = new MediaPlayer(media1);
		
		//MediaPlayer가 재생하는 내용을 mediaView에 보여주고자 설정함
		mediaview.setMediaPlayer(mediaplayer);
		
		//소스가 분석도 안된 상태에서 아래와 같이 play()를 호출하면 안됨
		//mediaPlayer.play();
		
		//소스분석이 끝나고 Ready상태가 되면 아래와 같이 자동 실행한다(직접익명구현객체 생성)
		mediaplayer.setOnReady(new Runnable() {
			
			@Override
			public void run() {
				btnPlay.setDisable(false);   	//false = 활성화
				btnPause.setDisable(true);		//true = 비활성화
				btnStop.setDisable(true);
				
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
		
		//일시정지 버튼
		btnPause.setOnAction(event -> mediaplayer.pause());
		
		//정지버튼
		btnStop.setOnAction(event -> mediaplayer.stop());
	}
}
