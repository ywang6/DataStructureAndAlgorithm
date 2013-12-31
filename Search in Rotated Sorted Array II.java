public class Solution {
    public boolean search(int[] A, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(A.length == 0)
        return false;
        
        int left = 0; 
        int right = A.length-1;
        while(left<=right)
        {
            int mid = left + (right- left)/2;
            if(A[mid]==target)
            return true;
            else
            {
                if(A[left]<A[mid])
                {
                    if(A[mid]>target && target>=A[left])
                    right = mid - 1;
                    else
                    left = mid + 1;
                }
                else if(A[left]>A[mid])
                {
                    if(A[mid]<target && target<=A[right])
                    left = mid + 1;
                    else
                    right = mid-1;
                }
                else
                left++;
            }
        }
        return false;
    }
}
