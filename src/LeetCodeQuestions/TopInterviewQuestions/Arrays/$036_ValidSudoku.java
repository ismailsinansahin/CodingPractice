package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $036_ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {{'1','2','3','.','.','.','.','.','.'}
                         ,{'4','5','6','.','.','.','.','.','.'}
                         ,{'7','8','9','.','.','.','.','.','.'}
                         ,{'2','3','1','.','.','.','.','.','.'}
                         ,{'5','6','4','.','.','.','.','.','.'}
                         ,{'8','9','7','.','.','.','.','.','.'}
                         ,{'3','1','2','.','.','.','4','5','6'}
                         ,{'6','4','5','.','.','.','7','8','9'}
                         ,{'9','7','8','.','.','.','1','2','3'}};
        System.out.println("Input  : " + Arrays.deepToString(board));
        System.out.println("Output : " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        char target;
        int refI=0;
        int refJ=0;

        for(int i=0 ; i< board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                target = board[i][j];
//                System.out.println("TARGET position / value - i/j    = [" + i + "][" + j + "] / " + target);
                if (target != '.') {
                    for (int k = j + 1; k < 9; k++) {
//                        System.out.println("comparing position / value - i/k = [" + i + "][" + k + "] / " + board[i][k]);
                        if (target == board[i][k]) return false;
                    }
                    for (int k = i + 1; k < 9; k++) {
//                        System.out.println("comparing position / value - k/j = [" + k + "][" + j + "] / " + board[k][j]);
                        if (target == board[k][j]) return false;
                    }
                    if (i < 3) {
                        if (j < 3) {
                            refI = 0;
                            refJ = 0;
                        } else if (j < 6) {
                            refI = 0;
                            refJ = 3;
                        } else {
                            refI = 0;
                            refJ = 6;
                        }
                    } else if (i < 6) {
                        if (j < 3) {
                            refI = 3;
                            refJ = 0;
                        } else if (j < 6) {
                            refI = 3;
                            refJ = 3;
                        } else {
                            refI = 3;
                            refJ = 6;
                        }
                    } else {
                        if (j < 3) {
                            refI = 6;
                            refJ = 0;
                        } else if (j < 6) {
                            refI = 6;
                            refJ = 3;
                        } else {
                            refI = 6;
                            refJ = 6;
                        }
                    }
//                System.out.println("referenceI = " + refI);
//                System.out.println("referenceJ = " + refJ);
                    if ((i == refI) & (j == refJ)) {
//                        System.out.println("comparing position / value - i+1/j+1 = [" + (i + 1) + "][" + (j + 1) + "] / " + board[i + 1][j + 1]);
//                        System.out.println("comparing position / value - i+1/j+2 = [" + (i + 1) + "][" + (j + 2) + "] / " + board[i + 1][j + 2]);
//                        System.out.println("comparing position / value - i+2/j+1 = [" + (i + 2) + "][" + (j + 1) + "] / " + board[i + 2][j + 1]);
//                        System.out.println("comparing position / value - i+2/j+2 = [" + (i + 2) + "][" + (j + 2) + "] / " + board[i + 2][j + 2]);
                        if ((target == board[i + 1][j + 1]) || (target == board[i + 1][j + 2]) ||
                                (target == board[i + 2][j + 1]) || (target == board[i + 2][j + 2])) return false;
                    }
                    if ((i == refI) & (j == refJ + 1)) {
//                        System.out.println("comparing position / value - i+1/j-1 = [" + (i + 1) + "][" + (j - 1) + "] / " + board[i + 1][j - 1]);
//                        System.out.println("comparing position / value - i+2/j-1 = [" + (i + 2) + "][" + (j - 1) + "] / " + board[i + 2][j - 1]);
//                        System.out.println("comparing position / value - i+1/j+1 = [" + (i + 1) + "][" + (j + 1) + "] / " + board[i + 1][j + 1]);
//                        System.out.println("comparing position / value - i+2/j+1 = [" + (i + 2) + "][" + (j + 1) + "] / " + board[i + 2][j + 1]);
                        if ((target == board[i + 1][j - 1]) || (target == board[i + 2][j - 1]) ||
                                (target == board[i + 1][j + 1]) || (target == board[i + 2][j + 1])) return false;
                    }
                    if ((i == refI) & (j == refJ + 2)) {
//                        System.out.println("comparing position / value - i+1/j-2 = [" + (i + 1) + "][" + (j - 2) + "] / " + board[i + 1][j - 2]);
//                        System.out.println("comparing position / value - i+1/j-1 = [" + (i + 1) + "][" + (j - 1) + "] / " + board[i + 1][j - 1]);
//                        System.out.println("comparing position / value - i+2/j-2 = [" + (i + 2) + "][" + (j - 2) + "] / " + board[i + 2][j - 2]);
//                        System.out.println("comparing position / value - i+2/j-1 = [" + (i + 2) + "][" + (j - 1) + "] / " + board[i + 2][j - 1]);
                        if ((target == board[i + 1][j - 2]) || (target == board[i + 1][j - 1]) ||
                                (target == board[i + 2][j - 2]) || (target == board[i + 2][j - 1])) return false;
                    }
                    if ((i == refI + 1) & (j == refJ)) {
//                        System.out.println("comparing position / value - i+1/j+1 = [" + (i + 1) + "][" + (j + 1) + "] / " + board[i + 1][j + 1]);
//                        System.out.println("comparing position / value - i+1/j+2 = [" + (i + 1) + "][" + (j + 2) + "] / " + board[i + 1][j + 2]);
                        if ((target == board[i + 1][j + 1]) || (target == board[i + 1][j + 2])) return false;
                    }
                    if ((i == refI + 1) & (j == refJ + 1)) {
//                        System.out.println("comparing position / value - i+1/j-1 = [" + (i + 1) + "][" + (j - 1) + "] / " + board[i + 1][j - 1]);
//                        System.out.println("comparing position / value - i+1/j+1 = [" + (i + 1) + "][" + (j + 1) + "] / " + board[i + 1][j + 1]);
                        if ((target == board[i + 1][j - 1]) || (target == board[i + 1][j + 1])) return false;
                    }
                    if ((i == refI + 1) & (j == refJ + 2)) {
//                        System.out.println("comparing position / value - i+1/j-2 = [" + (i + 1) + "][" + (j - 2) + "] / " + board[i + 1][j - 2]);
//                        System.out.println("comparing position / value - i+1/j-1 = [" + (i + 1) + "][" + (j - 1) + "] / " + board[i + 1][j - 1]);
                        if ((target == board[i + 1][j - 2]) || (target == board[i + 1][j - 1])) return false;
                    }
                }
            }
        }
        return true;
    }

}
