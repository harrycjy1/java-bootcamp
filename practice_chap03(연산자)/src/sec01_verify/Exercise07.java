package sec01_verify;

public class Exercise07 {

	public static void main(String[] args) {
		
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println("1+x<<3�� �� : "+(1+x<<3));
		System.out.println("y>=5||(x<0&&x>2) �� ���� :" + (y>=5||(x<0&&x>2)));
		System.out.println("y +=10-x++�� �� : "+ (y +=10-x++));//x�� 2 ������ �������� ������������ 3�̵�
		System.out.println("x+=2�� �� :"+ (x+=2));//���� ���� ������ 3+2=5
        System.out.println("!('A'<=c&&c<='Z')�� �� : "+ ('A'<=c&&c<='Z'));//���� Ʈ������ !���� ������ false�� ��µɰ�
        System.out.println("'C-c�� �� : " + ('C'-c));
        System.out.println("'5'-'0'�� �� : "+ ('5'-'0'));
        System.out.println("c+1�� �� : "+ (c+1));//���׿����ڶ����� int����ȯ�Ͼ�� ����
        System.out.println("++c�� �� : "+ ++c);//���׿����ڶ� �ڵ� �״�� ���
        System.out.println("c++�� �� : "+ c++);//���������̶� B�� ���
        System.out.println("c�ǰ� :"+ c);//���� �������� C�� �Ѿ���¶� C�� ���
        
	}

}
