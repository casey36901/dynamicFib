package dynamicfib;

public class dynamicFib {
	static long[] fibs = new long[101];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibs[0] = 1;
		fibs[1] = 1;
		
		if(args == null){
			System.out.println("Please enter a number to compute");
		}
		else{
			System.out.println("computing");
			
			Integer Fib = Integer.parseInt(args[0]);
			System.out.println(findFib(Fib));
			
		}
		
	}
		 
		 public static long findFib(Integer n){
			 long result;
			// System.out.println(fibs[100]);
//			 if(n <= 2){
//				 return 1;
//			 }
			if(fibs[n] != 0){
				result = fibs[n];
				System.out.println("I used the array to calc result!");
					}
					else{
						System.out.println("I calced the result the slow way");
						result = findFib(n-1)+findFib(n-2);
						fibs[n] = result;
						//System.out.println("fibs value" + fibs[n]);
					}
			return result;
				}
}

