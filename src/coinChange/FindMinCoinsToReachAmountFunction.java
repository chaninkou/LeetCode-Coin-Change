package coinChange;

import java.util.Arrays;

public class FindMinCoinsToReachAmountFunction {
    // Bottom up approach
    public int coinChange(int[] coins, int amount) {
        // Place holder to fill up the dp array, we could just do amount + 1 since no point to go above
        int max = amount + 1;
        
        // The last index of the array should be the amount we trying to find
        int[] dp = new int[amount + 1];
        
        // Fill up the array with default value
        Arrays.fill(dp, max);
        
        // Always only need zero coin for $0 amount
        dp[0] = 0;
        
        // Starting from 1 since 0 index is already 0
        for(int i = 1; i <= amount; i++){
            // For each coins
            for(int j = 0; j < coins.length; j++){
                // If the coin is not bigger than current amount we trying to find
                if(coins[j] <= i){
                    // Default is amount + 1
                    // dp[i - coins[j]] + 1 because +1 is using up one coin at first, then
                    // dp[i - coins[j]] will get the amount that is left after subtracting first coin
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        
        // The last element can't be bigger than the amount it given
        // The last element will be the fewest coins to get the amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
