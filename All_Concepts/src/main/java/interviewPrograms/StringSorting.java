package interviewPrograms;

public class StringSorting {
	public static void ascendingOrder() {
		String[] arr= {"india","romaina","russia","ukraine","arabia"};
		
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				String s2 = arr[j];
				if (s1.compareTo(s2)>0) {
					String temp=s1;
					arr[i]=s2;
					arr[j]=temp;
				}
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}
		

	public static void descendingOrder() {
		String[] arr= {"india","romaina","russia","ukraine","arabia"};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j])<0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args) {
		ascendingOrder();
		System.out.println();
		descendingOrder();
	}

}
