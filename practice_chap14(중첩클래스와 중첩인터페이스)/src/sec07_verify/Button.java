package sec07_verify;

public class Button {
	
	interface OnClicklistner {
		void OnClick();
	}
	
	OnClicklistner listener;
	
	
	void setOnClickListener(OnClicklistner listener) {
		this.listener=listener;
	}
	
	
	void touch() {
		listener.OnClick();
	}
	
	
	
		
}
