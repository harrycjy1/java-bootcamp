package sec03_exam_PoinTExample;

public class Point3D extends Point{

	int z =30;
	
	//Point3D(int x,int y,int z)를 호출한다
	
	public Point3D() {
		this(100,200,300);
	}
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}

}
