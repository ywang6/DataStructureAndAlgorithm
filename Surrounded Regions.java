public class Solution {
// dfs 用的时间太多了，通过不了，只能用非递归版本的bfs做
    public class Point {
            public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void solve(char[][] board) {
        int height = board.length;
        int width = 0;
        if (height > 0) {
            width = board[0].length;
        }
                
        Queue<Point> q = new LinkedList<Point>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i == 0 || i == width - 1 || j == 0 || j == height - 1) && board[i][j] == 'O') {
                    q.add(new Point(i, j));
                }
            }
        }
                
        while (q.peek() != null) {
            Point p = q.remove();
            board[p.x][p.y] = '-';
            if (p.x > 0 && board[p.x - 1][p.y] == 'O') {
                q.add(new Point(p.x - 1, p.y));
            }
            if (p.x < width - 1 && board[p.x + 1][p.y] == 'O') {
                q.add(new Point(p.x + 1, p.y));
            }
            if (p.y > 0 && board[p.x][p.y - 1] == 'O') {
                q.add(new Point(p.x, p.y - 1));
            }
            if (p.y < height - 1 && board[p.x][p.y + 1] == 'O') {
                q.add(new Point(p.x, p.y + 1));
            }
        }
                
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (board[i][j] != 'X')
                    board[i][j] = board[i][j] == 'O' ? 'X' : 'O';
            }
        }
    }
}
