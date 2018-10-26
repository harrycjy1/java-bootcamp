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
		
		//����� �ҽ�(Media)�� ������
		//������
		//Media media = new Media(getClass().getResource("media/video.m4v").toString());
		Media media1 = new Media(getClass().getResource("media/�ǰ���.mp4").toString());
		
		//�����
		//Media media2 = new Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());
		
		//MediaPlayer�� ����� �ҽ��� �Ű����� ������ Mediaplayer�� ������
		MediaPlayer mediaplayer = new MediaPlayer(media1);
		
		//MediaPlayer�� ����ϴ� ������ mediaView�� �����ְ��� ������
		mediaview.setMediaPlayer(mediaplayer);
		
		//�ҽ��� �м��� �ȵ� ���¿��� �Ʒ��� ���� play()�� ȣ���ϸ� �ȵ�
		//mediaPlayer.play();
		
		//�ҽ��м��� ������ Ready���°� �Ǹ� �Ʒ��� ���� �ڵ� �����Ѵ�(�����͸�����ü ����)
		mediaplayer.setOnReady(new Runnable() {
			
			@Override
			public void run() {
				btnPlay.setDisable(false);   	//false = Ȱ��ȭ
				btnPause.setDisable(true);		//true = ��Ȱ��ȭ
				btnStop.setDisable(true);
				
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
		
		//�Ͻ����� ��ư
		btnPause.setOnAction(event -> mediaplayer.pause());
		
		//������ư
		btnStop.setOnAction(event -> mediaplayer.stop());
	}
}
