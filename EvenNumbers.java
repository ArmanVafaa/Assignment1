package exercise1;

public class EvenNumbers {
	public static void main(String[] args) {
		int count = 0;
		int i =1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
				count++;
				
			}
			if (count % 10 == 0)
				System.out.println();
			i++;
		}
		
	}

}
