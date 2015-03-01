package foo.chap2_impl;

import foo.chap2.PerformanceException;
import foo.chap2.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler (Poem poem){
		super ();
		this.poem=poem;
	}//PoeticJuggler
	
	public PoeticJuggler(int beanBags, Poem poem){
		super(beanBags);
		this.poem=poem;
	}//PoeticJuggler
	
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("While recting...*");
		poem.recite();
	}//perform
	
}//end PoeticJuggler
