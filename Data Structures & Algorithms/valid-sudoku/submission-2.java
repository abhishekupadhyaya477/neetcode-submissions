class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];


        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         squares[i][j] = new HashSet<>();
        //     }
        // }

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                
                char ch = board[r][c];

                if(ch=='.') continue;

                int squareIndex=(r/3)*3 + c/3;

                if(row[r].contains(ch)|| col[c].contains(ch) || squares[squareIndex].contains(ch)) return false;

                row[r].add(ch);
                col[c].add(ch);
                squares[squareIndex].add(ch);
            }
        }
        return true;
    }
}
