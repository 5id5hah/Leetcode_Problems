class Solution {
    public int countNegatives(int[][] grid) {
        int cunt = 0;
        for(int i = 0; i<= grid.length-1; i++){
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] < 0){
                    cunt++;
                }
        }
      }
      return cunt;
    }
}
