public class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(matrix.length<=0) return 0;
        int len = matrix[0].length;
        int[] height = new int[len];
        int max = 0;
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<len; j++)
            {
                if(matrix[i][j]=='1')
                {
                    height[j]++;
                }
                else
                height[j] = 0;
            }
            max = Math.max(max, getMaxArea(height));
        }
        return max;
    }
    public int getMaxArea(int[] height)
    {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i<height.length; i++)
        {
            if(stack.isEmpty() || stack.peek()<=height[i])
            {
                stack.push(height[i]);
            }
            else
            {
                int count = 0;
                while(!stack.isEmpty() && stack.peek()>height[i])
                {
                    count++;
                    int val = stack.pop();
                    max = Math.max(max, val*count);
                }
                for(;count>=0;count--)
                {
                    stack.push(height[i]);
                }
            }
        }
        int count=0;
        while(!stack.isEmpty())
        {
            count++;
            int val = stack.pop();
            max = Math.max(max, val*count);
        }
        return max;
    }
}
