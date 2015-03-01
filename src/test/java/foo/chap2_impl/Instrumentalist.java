package foo.chap2_impl;

import foo.chap2.Instrument;
import foo.chap2.PerformanceException;
import foo.chap2.Performer;

public class Instrumentalist implements Performer{
	public Instrumentalist(){
	}
	
	public void perform() throws PerformanceException{
		System.out.print("Playing "+ song + " : ");
		instrument.play();		
	}//end perform
	
	private String song;
	
	public void setSong(String song){
		this.song=song;
	}//setSong
	
	public String getSong(){
		return song;
	}//getSong
	
	public String screamsong(){
		return song;
	}//screamsong
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument){
		this.instrument=instrument;
	}//setInstrument
	 
}//end Instrumentalist
