class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];

            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int num=board[i][j] - '1';

                    if(row[num]){
                        return false;
                    }
                    row[num] = true;
                }
                if(board[j][i] != '.'){
                    int num = board[j][i] - '1';

                    if(col[num]){
                        return false;
                    }
                    col[num] = true;
                }
            }
        }
        for(int box = 0; box < 9; box++){
            boolean[] seen = new boolean[9];

            int rowStart = (box/3) * 3;
            int colStart = (box % 3) * 3;

            for(int i=rowStart; i<rowStart+3; i++){
                for(int j=colStart; j<colStart+3; j++){
                    if(board[i][j] != '.'){
                        int num = board[i][j] - '1';

                        if(seen[num]){
                            return false;
                        }

                        seen[num]=true;
                    }
                }
            }
            
        }
        return true;
    }
}