package dynamicfib;

public class dynamicFib {
	static long[] fibs = new long[101];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibs[1] = 1;
		fibs[2] = 1;
		
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
			
			if(fibs[n] != 0){
				result = fibs[n];
					}
					else{
						result = findFib(n-1)+findFib(n-2);
						fibs[n] = result;
					}
			return result;
				}
}

