package leetcode322;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		
		int amount = 11;
		
		System.out.println("Coins: " + Arrays.toString(coins) + " amount: " + amount);
		
		FindMinCoinsToReachAmountFunction solution = new FindMinCoinsToReachAmountFunction();
		
		System.out.println("Fewest coins needed: " + solution.coinChange(coins, amount));
		
	}
}
