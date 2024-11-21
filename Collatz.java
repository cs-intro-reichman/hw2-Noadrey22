// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int input = Integer.parseInt(args[0]);
		String letter = (args[1]);
		int calc, count = 0;
		for (int i = 1; i<=input; i++ ){
			calc = i;
			count = 1;
			do { 
				count++;
				if (letter.equals("v")) {
					System.out.print(calc + " ");
				}
				if (calc %2 ==0) {
					calc=calc/2;
				}else {
					calc=(calc*3) +1;
				}
			}while (calc != 1);
			if (letter.equals("v")) {
				System.out.println(1 + " (" + count + ")" ); }
		}
		
	
		System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
	}

}