package sec06.exam03_view;

import javafx.beans.property.SimpleStringProperty;

public class Phone {

		//�ʵ��� Ÿ���� SimpleStringProperty�̴�. FX�Ӽ� ������ Ŭ������ Ÿ������ �����ߴ�
		//������ �Ӽ����ø� ���ؼ� ���� �о�ö� ���ϰ� �ϱ� ���ؼ��̴�
	
		private SimpleStringProperty smartPhone;
		private SimpleStringProperty image;
		
		
		public Phone() {
			this.smartPhone = new SimpleStringProperty(); 	//�ܼ���ü ����
			this.image = new SimpleStringProperty();		//�ܼ���ü����
		}
		
		
		public Phone(String smartPhone, String image) {
			this.smartPhone = new SimpleStringProperty(smartPhone); //����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
			this.image = new SimpleStringProperty(image);			//����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
		}
		
		//Getter,Setter
		
		//�ָ��� ���� ���ϰ��� �Ű����� STring�̹Ƿ� SimpleStringProperty��ü�� get()�޼���� set()�޼��带 ������� �������
		
		public String getSmartPhone() {
			return smartPhone.get();
		}
		
		public String getImage() {
			return image.get();
		}
		
		public void setSmartPhone(String smartPhone) {
			this.smartPhone.set(smartPhone);
		}
		
		public void setImage(String image) {
			this.image.set(image);
		}
		
}
