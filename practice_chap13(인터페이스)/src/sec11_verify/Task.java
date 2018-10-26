package sec11_verify;

public class Task implements Priority{
	
	
		String 		taskName;
		int 		time;
		int 		priority_number;
	
	
	
	
		Task(String taskName,int time){
		this.taskName=taskName;
		this.time=time;
		
		}
	
	
	
	@Override
	public int getPriority() {
		
		return priority_number;
	}

	@Override
	public void setPriority(int priority_number) {
		this.priority_number=priority_number;
		
	}
	
	

}
