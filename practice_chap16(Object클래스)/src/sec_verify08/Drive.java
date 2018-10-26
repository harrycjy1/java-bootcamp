package sec_verify08;

import java.util.Arrays;

public class Drive implements Cloneable{

	
	String 			name;
	int 			size;
	String[] 		driverList;
	Folder 			folder;
	
	public Drive(String name, int size, String[] driverList, Folder folder) {
		this.name=name;
		this.size=size;
		this.driverList=driverList;
		this.folder=folder;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Drive cloned = (Drive)super.clone();
		
		
		cloned.driverList=Arrays.copyOf(this.driverList, this.driverList.length);
		cloned.folder=new Folder(this.folder.name, this.folder.size);
		
		
		return cloned;
	}
	
	public Drive getDrive() {
		Drive cloned =null;
		
		try {
			cloned = (Drive)this.clone();
		}
		catch(CloneNotSupportedException e) {}
		
		return cloned;
	}
	
	
}
