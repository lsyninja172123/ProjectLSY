package interviewPrograms;

public class primeNumbers {
	public static void primeNumber() {
		int num = 14;
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else
			System.out.println("Not prime");
	}

	public static void countOfPrimeNumbers() {
      int n;
      int totalNumbersAre = 0;
      for(int i=2;i<=1000;i++) {
    	  n=i;
    	  int count =0;
    	  for(int j=2;j<n/2;j++) {
    		  if(n%j==0) {
    			  count++;
    		  }
    	  }
    	  if(count==0) {
    		  System.out.println(i);
    		  totalNumbersAre++;
    	  }
      }
      System.out.println("Total Count "+totalNumbersAre);
      
	}

	public static void main(String[] args) {
		primeNumber();
		countOfPrimeNumbers();
	}

}
