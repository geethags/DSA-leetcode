class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char ele = board[i][j];
                if(ele != '.'){
                    if(!set.add(ele + " row "+ i) ||
                    !set.add(ele + " col "+ j) || 
                    !set.add(ele + " block " + i/3+j/3) ){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}