package sec07_verify;

public class WindowExample {

	public static void main(String[] args) {
		Window window = new Window();

		window.btn1.touch();
		window.btn2.touch();
		
		window.btn1.listener.OnClick();

	}

}
