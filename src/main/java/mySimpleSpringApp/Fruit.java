package mySimpleSpringApp;

import java.util.List;
import java.util.Map;

public class Fruit {
	
	private String myName;
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	private List<String> fruitNamelist;
	private Map<String,String> fruitNameMap;
	
	public List<String> getFruitNamelist() {
		return fruitNamelist;
	}

	public void setFruitNamelist(List<String> fruitNamelist) {
		this.fruitNamelist = fruitNamelist;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	
	

	public String talkaboutyourself()
	{
		String speech="hello i'm Fruit";
		
		if(fruitNamelist!=null && fruitNamelist.size()> 0)
		{
			speech += "\nList";
			for(int i =0;i<fruitNamelist.size();i++) {
				speech += " name :" + fruitNamelist.get(i);
		}
		}
		
		if(fruitNameMap!=null && fruitNameMap.size()>0)
		{
			speech += "\nMap ";
			for(Map.Entry<String, String> fruitName : fruitNameMap.entrySet()) {
				speech += fruitName.getKey() + "==>" + fruitName.getValue() + "  ";
	}
		}
   return speech;

}
}