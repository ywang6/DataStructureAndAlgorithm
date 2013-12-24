public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // if(s1.length()==0 && s2.length()==0) return s3.length()==0;
        // if(s1.length() + s2.length()!= s3.length()) return false;
        // if(s1.length()<=0) return s2.equals(s3);
        // if(s2.length()<=0) return s1.equals(s3);
        // char c1=s1.charAt(0), c2=s2.charAt(0),c3=s3.charAt(0);
        // if(c1!=c3 && c2!=c3) return false;
        // else
        // if(c1==c3 && c2==c3) return isInterleave(s1.substring(1),s2,s3.substring(1)) 
        //     || isInterleave(s1,s2.substring(1),s3.substring(1)) ;
        // if(c1==c3)return isInterleave(s1.substring(1),s2,s3.substring(1));
        // else return isInterleave(s1,s2.substring(1),s3.substring(1));
        
          if(s3.length() != s1.length() + s2.length())
            return false;
        //create indicator
        boolean[][] match = new boolean[s1.length()+1][s2.length()+1];
        //initialization the first row and the first column
        match[0][0] = true;
        for( int l1 = 1; l1 <= s1.length(); ++ l1 ) {
            char c1 = s1.charAt(l1-1);
            char c3 = s3.charAt(l1-1);
            if (c1 == c3) {
                match[l1][0] = true;
            } else 
                break;
        }
        for( int l2 = 1; l2 <= s2.length(); ++ l2 ) {
            char c2 = s2.charAt(l2-1);
            char c3 = s3.charAt(l2-1);
            if (c2 == c3) {
                match[0][l2] = true;
            } else 
                break;
        }
        //work through the rest of matrix using the formula
        for( int l1 = 1; l1 <= s1.length(); ++ l1 ) {
            char c1 = s1.charAt(l1-1);
            for( int l2 = 1 ; l2 <= s2.length() ; ++ l2 ) {
                char c2 = s2.charAt(l2-1);
                int l3 = l1 + l2;
                char c3 = s3.charAt(l3-1);
                if (c1 == c3) {
                    match[l1][l2] = match[l1 - 1][l2] || match[l1][l2];
                }
                if (c2 == c3) {
                    match[l1][l2] = match[l1][l2 - 1] || match[l1][l2];
                }
            }
        }
        //the last element is the result
        return match[s1.length()][s2.length()];
    }
}
