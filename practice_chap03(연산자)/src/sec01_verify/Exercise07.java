package sec01_verify;

public class Exercise07 {

	public static void main(String[] args) {
		
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println("1+x<<3의 값 : "+(1+x<<3));
		System.out.println("y>=5||(x<0&&x>2) 의 값은 :" + (y>=5||(x<0&&x>2)));
		System.out.println("y +=10-x++의 값 : "+ (y +=10-x++));//x값 2 밑으로 내려가면 후위연산으로 3이됨
		System.out.println("x+=2의 값 :"+ (x+=2));//후위 연산 때문에 3+2=5
        System.out.println("!('A'<=c&&c<='Z')의 값 : "+ ('A'<=c&&c<='Z'));//값은 트루지만 !연산 때문에 false로 출력될것
        System.out.println("'C-c의 값 : " + ('C'-c));
        System.out.println("'5'-'0'의 값 : "+ ('5'-'0'));
        System.out.println("c+1의 값 : "+ (c+1));//이항연산자때문에 int형변환일어나서 숫자
        System.out.println("++c의 값 : "+ ++c);//단항연산자라 코드 그대로 출력
        System.out.println("c++의 값 : "+ c++);//후위연산이라 B로 출력
        System.out.println("c의값 :"+ c);//위의 후위연산 C로 넘어간상태라 C로 출력
        
	}

}
