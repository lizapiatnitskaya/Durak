package durak;
import java.util.ArrayList;



public class Koloda {
	ArrayList<Karts> koloda = new ArrayList<Karts>();
	ArrayList<Karts> koloda2 = new ArrayList<Karts>();
	ArrayList<Karts> gamer1 = new ArrayList<Karts>();
	
	ArrayList<Karts> gamer1sorting = new ArrayList<Karts>();
	
	int[] sila = {1,2,3,4,5,6,7,8,9};
	String[] type = {"six","sev","eig","nin","ten","val","dam","kor","tuz"};
	int m=0;
	public void enter(){
		for(int i=0;i<=36;i++){
			if(i<9){
				 koloda.add(new Karts("bubi",type[m],sila[m],false));
				 m=m+1;
				 if(m==9){m=0;}
			}
			if(i>8 && i<18){
				koloda.add(new Karts("cherv",type[m],sila[m],true));
				m=m+1;
				if(m==9){m=0;}
			}
			if(i>17 && i < 27){
				koloda.add(new Karts("piki",type[m],sila[m],false));
				m=m+1;
				if(m==9){m=0;}
			}
			if(i>27 && i <=36){
				koloda.add(new Karts("krest",type[m],sila[m],false));
				m=m+1;
			}
		}
		
	}
	public void enterGamer1(){
		for(int i=0;i<=12;i++){
			gamer1.add(new Karts("","",0,false));
		}
		
	}

	
	public void peretasovka(){
		
		int[] a = new int[]{ 16, 0, 31,7,10,17,1,2,3,22,5,29,33,6,35,19,24,32,25,13,30,34,12,18,11,23,9,28,15,27,20,21,8,26,14,4 };
		koloda2 = (ArrayList<Karts>)koloda.clone();
		for (int i=0;i<36;i++)
		{
			
		koloda2.set(a[i],koloda.get(i));
		}
	}
	public void KartsGamer1()
	{
		for(int i=0;i<12;i++){
			gamer1.set(i,koloda2.get(i));
		}
	}

	public void printKoloda(){
		for(int i=0;i<36;i++)
		{
			System.out.println(koloda2.get(i));
		}
	}
	public void sorting2(){
		gamer1sorting=(ArrayList<Karts>)sorting(gamer1).clone();
		
	}
	public void printGamer1(){
		for(int i=0;i<12;i++)
		{
			System.out.println(gamer1.get(i));
		}
	}


	public void printGamer1sorting(){
		for(int i=0;i<12;i++)
		{
			System.out.println(gamer1sorting.get(i));
		}
	}



	public ArrayList<Karts> sorting (ArrayList<Karts> karta){
		for (int i = 0; i < 12; i++) {
            
            for (int j = 12 - 1; j > i; j--) {
                
                if (karta.get(j-1).strongerThan( karta.get(j))) {
                   Karts temp = karta.get(j);
                   karta.set(j,karta.get(j-1));
                   karta.set(j-1,temp);
                }
            }
        }
		return karta;
	}

	
    }
	
	


