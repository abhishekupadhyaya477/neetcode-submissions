class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[][] squares = new HashSet[3][3];

        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }

        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                squares[r][c]=new HashSet<>();
            }
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch=board[r][c];

                if(ch=='.') continue;

                if(rows[r].contains(ch)) return false;
                rows[r].add(ch);

                if(cols[c].contains(ch)) return false;
                cols[c].add(ch);

                int sR=r/3;
                int sC=c/3;
                if(squares[sR][sC].contains(ch)) return false;
                squares[sR][sC].add(ch);

            }

        }

        return true;
    }
}
