class Solution {
    public int solution(int[] A, int[] B) {
        int counter = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == B[i]) {
                roteteTable(B);
                i = -1;
                counter++;
            }
            if(counter >= A.length) return -1;
        }
        return counter;
    }
    public static void roteteTable(int[] B) {
        int lastElement = B[B.length-1];
        for(int i = B.length-1; i > 0; i--) {
            B[i] = B[i-1];
        }
        B[0] = lastElement;
    }
}
