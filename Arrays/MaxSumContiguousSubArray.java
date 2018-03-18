public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        
        for(int i=0; i<A.size(); i++){
            max_ending_here += A.get(i);
            
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
            
        }
        return max_so_far;
    }
}
