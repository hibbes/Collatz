
public class Collatz {

	public static void main(String[] args) {
	 long startzahl = 1;
 	 
	while(startzahl<=1000){
	 long zahl = startzahl;
	 
	 if(startzahl>1){System.out.print(" für "+ (startzahl)+": "); }
	 while(zahl >1){		
			if(zahl%2==0){
				zahl=zahl/2;
			    }
			
			else{zahl=(zahl*3)+1;}
			
		
			if(zahl>1){System.out.print(zahl+", ");}
			else
			if (zahl<10){System.out.println(zahl);}
		 
	 }
	
    startzahl++;
	}
	}
}
