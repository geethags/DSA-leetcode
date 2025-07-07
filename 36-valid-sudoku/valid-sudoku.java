class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int i = 0; i < N; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                char ele = board[i][j];
                if(ele == '.') continue;
                if(rows[i].contains(ele)){
                    return false;
                }
                rows[i].add(ele);
                if(cols[j].contains(ele)){
                    return false;
                }
                cols[j].add(ele);
                int boxIndex = (i/3) * 3 + (j/3);
                if(boxes[boxIndex].contains(ele)){
                    return false;
                }
                boxes[boxIndex].add(ele);
            }
        }
        return true;
    }
}