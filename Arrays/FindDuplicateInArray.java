public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int size = a.size();
	    int arr[] = new int[size+1];
	    arr[0]=1;
	    for(int i=0; i<size; i++){
	        arr[a.get(i)]++;
	    }
	    for(int i=0; i<size+1; i++){
	        if(arr[i]>1)
	        return i;
	    }
	    //return total - sum;
	    return -1;
	}
}
