public class Solution {
    	// DP + back track
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		int n = s.length();
		ArrayList<ArrayList<Integer>> pres = new ArrayList<ArrayList<Integer>>(
				n);
		// initialize
		for (int i = 0; i < n; ++i)
			pres.add(new ArrayList<Integer>());
		// DP. pres[i] stores position j where should insert space
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j) {
				String suffix = s.substring(j, i + 1);
				if ((j == 0 || pres.get(j - 1).size() > 0) && dict.contains(suffix))
					pres.get(i).add(j);
			}
		}
		return getPath(s, n, pres);
	}

	public ArrayList<String> getPath(String s, int n, ArrayList<ArrayList<Integer>> pres) {
		ArrayList<String> res = new ArrayList<String>();
		for (int pre : pres.get(n - 1)) {
			if (pre == 0) {
				res.add(s.substring(0, n));
			} else {
				ArrayList<String> preres = getPath(s, pre, pres);
				String sub = s.substring(pre, n);
				for (String ss : preres)
					res.add(ss + " " + sub);
			}
		}
		return res;
	}

}