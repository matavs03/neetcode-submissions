class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Map<Character, Integer> mapa = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(mapa.getOrDefault(board[i][j], 0)>0) return false;
                mapa.put(board[i][j], mapa.getOrDefault(board[i][j], 0)+1);
            }
        }
        for(int i=0;i<9;i++){
            Map<Character, Integer> mapa = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(mapa.getOrDefault(board[j][i], 0)>0) return false;
                mapa.put(board[j][i], mapa.getOrDefault(board[j][i], 0)+1);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Map<Character, Integer> mapa = new HashMap<>();
                for(int r=i;r<i+3;r++){
                    for(int k=j;k<j+3;k++){
                        if(board[r][k] == '.') continue;
                        if(mapa.getOrDefault(board[r][k], 0)>0) return false;
                        mapa.put(board[r][k], mapa.getOrDefault(board[r][k], 0)+1);
                    }
                }
            }
        }
        return true;
    }
}
