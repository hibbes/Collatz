
public class Collatz {

	public static void main(String[] args) {
	//collatz(1,100);
	fibfolge(20);
	//System.out.println("fac(9) = "+fac(9));
	}
	
	
	static void fibfolge(long max){
		for(long i =0; i<=max;i++){
			if(i==max){System.out.print(fibonacci(i));}
			else{System.out.print(fibonacci(i)+", ");}
			}
	}
	
	static long fibonacci(long i){
		if(i<=0){return 0;}
			else {
				if(i==1 || i==2){return 1;}
			    	 else{return(fibonacci(i-2)+fibonacci(i-1));}
						 }		
		}
	
	static int fac(int i){
		return i==0?1:i*fac(i-1);
		}
	
	public static void collatz(long startzahl, long limit){
		 	 
	while(startzahl<=limit){
	  long zahl = startzahl;
	 
	 if(startzahl>1){System.out.print(" f�r "+ (startzahl)+": "); }
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
