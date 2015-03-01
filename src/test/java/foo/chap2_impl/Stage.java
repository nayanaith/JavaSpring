package foo.chap2_impl;

public class Stage {
	private Stage(){		
	}//end Stage con
	
	private static class StageSingletonHolder{
		static Stage instance=new Stage();
	}//end StageSingletonHolder
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}//end getInstance
	
}//end Stage
