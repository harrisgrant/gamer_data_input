import java.util.*; 
public class Testng {

	public static void main(String[] args) {
		String wantsToPlayAgain;
		String wantsToEnterData;
		String GAMERSNAME;
		int L1;
		int L2;
		int L3;
		int ES;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Total XP calculation program!"); 
	    System.out.println();   
		System.out.print("Do you want to enter gamer's data? Yes/No ");
		wantsToEnterData = scan.nextLine();
		
		if (wantsToEnterData.equalsIgnoreCase("yes")) {
			
			do {
				System.out.print("Input gamers name: "); 
				GAMERSNAME = scan.nextLine();  
				    
				System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES: " );
				L1 = scan.nextInt();
				L2 = scan.nextInt();
				L3 = scan.nextInt();
				ES = scan.nextInt();
				
				double level1 = L1 * 0.20 + L1;
				double level2 = L2 * 0.30 + L2;
				double level3 = L3 * 0.50 + L3;
				double engagementScore = ES * 0.60 + ES;
				double totalScore = level1 + level2 + level3 + engagementScore;

				System.out.println(); 
				System.out.println("Gamers Name: " + GAMERSNAME + " L1=" + L1 + " L2=" + L2 + " L3=" + L3 + " ES=" + ES); 
				System.out.println("Final XP score with bonuses = " + totalScore);
				
				System.out.println("do you want to play again? yes or no ");
				wantsToPlayAgain = scan.nextLine();
				}
			
			while (wantsToPlayAgain.equalsIgnoreCase("yes"));
			if (wantsToPlayAgain.equalsIgnoreCase("no")) {
			System.out.print("Thank you for using the Total XP calculation program!");
			}
			
		}
		else if (wantsToEnterData.equalsIgnoreCase("no")) {
				System.out.print("Thank you for using the Total XP calculation program!");
			}
		scan.close();
	}
}
