public class Solution {
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack <Integer> stack = new Stack<Integer>();
        int max=0,count=0;
        for(int i =0;i<height.length;i++){
            if(stack.isEmpty() || stack.peek()<=height[i])
                stack.push(height[i]);
            else{
                count=0;
                while(!stack.isEmpty() && stack.peek()>height[i])
                    max = Math.max(++count*stack.pop(),max);
                for(; count>=0; count--)
                    stack.push(height[i]);
            }
        }
        count=0;
        while(stack.size()>0)
             max = Math.max(++count*stack.pop(),max);
        return max;
    }
}
