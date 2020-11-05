package mySimpleSpringApp;

public class Fruit {
	
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public Fruit(){}
	
	public Fruit(String pName) {
		
		setMyName(pName);
	}

	public String talkaboutyourself()
	{
		String speech="hello i'm Fruit";
		if(myName!=null && myName!="") speech= speech + " My name is "+ myName; 
		
		return speech;
	}

}
