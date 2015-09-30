
public class Collatz {

	public static void main(String[] args) {
	
 	 long startzahl = 435;
	
	 while(startzahl >1){		
			if(startzahl%2==0){
				startzahl=startzahl/2;
			    }
			
			else{startzahl=(startzahl*3)+1;}
			
			if(startzahl>1){System.out.print(startzahl+", ");}
			else{System.out.print(startzahl);}
		 
	 }

	}
	
}
