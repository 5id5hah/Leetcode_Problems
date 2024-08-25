class Solution {
    public boolean isValidSudoku(char[][] board) {
          int n = board.length;

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n];
            boolean[] colCheck = new boolean[n];
            for (int j = 0; j < n; j++) {
                // Check row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; // Convert char to int index
                    if (rowCheck[num]) {
                        return false;
                    }
                    rowCheck[num] = true;
                }

                // Check column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (colCheck[num]) {
                        return false;
                    }
                    colCheck[num] = true;
                }
            }
        }

        // Check 3x3 subgrids
        for (int row = 0; row < n; row += 3) {
            for (int col = 0; col < n; col += 3) {
                boolean[] boxCheck = new boolean[n];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[row + i][col + j] != '.') {
                            int num = board[row + i][col + j] - '1';
                            if (boxCheck[num]) {
                                return false;
                            }
                            boxCheck[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
    }
