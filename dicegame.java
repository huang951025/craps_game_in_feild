package dice;

public class dicegame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int diceone;
		int dicetwo;
		
		int bet = 10;
		int time = 900000000;
		int win = 0;
		int lose = 0;
		int dicenumber = 0;
		
		int money1 =10000;
		for(int i = 0; i < time; i++){
		diceone = (int) (Math.random()*6+1);
		dicetwo = (int) (Math.random()*6+1);
		dicenumber = diceone + dicetwo;
			
		switch(dicenumber){
		
			case 2: 
			win++;
			money1 = 30 + money1;
			break;
		    case 3: 
			win++;
			money1 = bet+money1;
			break;
			case 4: 
			win++;
			money1 = bet+money1;
			break;
			case 5: 
			lose++;
			money1 = money1 - 10;
			break;
					case 6: 
			lose++;
			money1 = money1 - 10;
			break;
						case 7: 
			lose++;
			money1 = money1 - 10;
			break;
						case 8: 
			lose++;
			money1 = money1 - 10;
			break;
						case 9: 
			win++;
			money1 = money1 + 10;
			break;
					case 10:
			win++;
			money1 = money1 + 10;
			break;
			case 11: 
			win++;
			money1 = money1 + 10;
			break;
			case 12: 
			win++;
			money1 = money1 + 30;
			break;
			default:
				System.out.print("Wrong");
			break;}
		}
		
		
			
		System.out.println("win: " + win +" lose: " + lose + " money: " + money1);

	}
}
		
		

