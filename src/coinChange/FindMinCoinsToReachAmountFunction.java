package coinChange;

import java.util.Arrays;

public class FindMinCoinsToReachAmountFunction {
    // Dp
	// Bottom up approach
    public int coinChange(int[] coins, int amount) {
        // Place holder to fill up the dp array, we could just do amount + 1 since no point to go above
        int max = amount + 1;
        
        // The last index of the array should be the amount we trying to find, since index starts from 0
        int[] dp = new int[amount + 1];
        
        // Fill up the array with default value as place holder, since we are getting min
        Arrays.fill(dp, max);
//        for(int i = 1; i < dp.length; i++){
//        	dp[i] = amount + 1;
//        }
        
        // Always only need zero coin for $0 amount
        dp[0] = 0;
        
        // Starting from 1 since 0 index is already 0
        // For each dollars in amount
        for(int i = 1; i <= amount; i++){
            // For each coins
            for(int j = 0; j < coins.length; j++){
                // Only look at the coin thatis not bigger than the current dollars
                if(coins[j] <= i){
                    // dp[i - coins[j]] + 1 because +1 is using up one coin at first, then
                    // dp[i - coins[j]] will get how many coins we need to get current dollars
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        
        // Return -1 when the last element is bigger than amount since we did max = amount + 1 earlier
        // The last element will be the fewest coins to get the amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
