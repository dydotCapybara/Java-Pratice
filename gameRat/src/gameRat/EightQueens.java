package gameRat;

public class EightQueens {

    public static void main(String[] args) {
        // 使用一维数组表示棋盘
        int[] board = new int[8];
        // 初始化棋盘
        for (int i = 0; i < 8; i++) {
            board[i] = -1;
        }
        System.out.println("初始棋盘");
        P p = new P();
        p.print(board);
        System.out.println("====================");
        // 开始放置皇后
        placeQueens(board, 0);
    }

    // 递归函数：尝试在第 row 行放置皇后
    public static void placeQueens(int[] board, int row) {
        if (row == 8) {
            // 所有行都放置完毕，打印棋盘
            P p = new P();
            p.print(board);
            System.out.println("====================");
            return;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col; // 放置皇后
                placeQueens(board, row + 1); // 递归放置下一行的皇后
                board[row] = -1; // 回溯
            }
        }
    }

    // 安全性检查函数：检查 (row, col) 是否与之前的皇后有冲突
    public static boolean isSafe(int[] board, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            if (board[prevRow] == col ||  // 同列冲突
                board[prevRow] - prevRow == col - row ||  // 主对角线冲突
                board[prevRow] + prevRow == col + row) {  // 副对角线冲突
                return false;
            }
        }
        return true;
    }
}

class P {
    // 打印一维数组的棋盘表示
    public void print(int[] board) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
