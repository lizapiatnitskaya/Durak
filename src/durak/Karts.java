package durak;

public class Karts {
	int sila;
	String mast;
	String type;
	boolean koz;
	
	
	Karts(String mast,String type,int sila,boolean koz)
	{
		this.mast=mast;
		this.type=type;
		this.sila=sila;
		this.koz=koz;
		
	}
	public String toString(){
		return mast+" "+type;
	}
	
	public boolean strongerThan(Karts karta){
	if(	this.koz == true && karta.koz == false)
	{
		return true;
	}
	if(	this.koz == false && karta.koz == true){
		return false;
	}
	
	
		if(	this.sila > karta.sila ){
			return true;
		}
		return false;
		
	
	}
	

	
	
	
	
	
}
