public class week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.79;
		double moneyInWallet = 55.70;
		int thirstLevel = 3;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		if (shouldByIcecream == true) {
			System.out.println("It's hot outside and we have money to buy ice cream.");
		} else {
			System.out.println("No, do not buy ice cream");
		}
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		if (willGoSwimming) {
			System.out.println("It's hot outside and it's the weekend so let's all go swimming!");
		} else {
			System.out.println("We can't go siwmming.");
		}
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		if (isAGoodDay) {
			System.out.println("It's hot outside, we have money and it's the weekend.  This is a good day!");
		} else {
			System.out.println("It's not a good day afterall..");
		}
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
		if (willBuyMilk) {
			System.out.println("It's hot outside, we are thirsty and we have enough money to buy milk.");
		} else {
			System.out.println("We cannot buy milk.");
		}
		} 
	}


