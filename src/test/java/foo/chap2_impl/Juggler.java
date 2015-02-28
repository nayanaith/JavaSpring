package foo.chap2_impl;

import foo.chap2.PerformanceException;
import foo.chap2.Performer;

public class Juggler implements Performer{
	//void perform() throws PerformanceException;
	private int beanBags=3;
	
	public Juggler(){
	}//Juggler
	
	public Juggler (int beanBags){
		this.beanBags=beanBags;
	}//Juggler int
	
	public void perform() throws PerformanceException{
		System.out.println("JUGGLING "+ beanBags + " BEANBAG ");
	}//end PerformanceException
}
