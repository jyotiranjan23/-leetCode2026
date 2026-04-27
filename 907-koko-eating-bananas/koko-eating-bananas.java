class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length == 1){
            return (piles[0]+h-1)/h;
        }
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }
        while(low <= high){
            int mid = (low+high)/2;
            long sum = 0;
            for(int i=0; i<piles.length; i++){
                sum+= (piles[i]+mid-1)/mid;
            }
            if(sum <= h){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
}