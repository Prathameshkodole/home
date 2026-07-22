class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
       int totalElements = rows * cols;
        int[][] result = new int[totalElements][2];
        
        // 1. Fill the matrix with all cell coordinates
        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[index++] = new int[]{r, c};
            }
        }
        
        // 2. Sort coordinates by Manhattan distance: |r1 - r2| + |c1 - c2|
        Arrays.sort(result, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });
        
        return result;
    }
}