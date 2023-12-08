package SlidingWindow;

import java.util.ArrayList;







public class Test3 {

    private static String color;

    public Test3(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Test3[][] myBoard = new Test3[5][3];
        System.out.println("myBoard length :: " + myBoard[0].length);
        for (int i = 0; i < myBoard.length; i++) {
            for (int y = 0; y < myBoard[i].length; y++) {
                myBoard[i][y] = new Test3("white");
            }
        }

        String[] queries = new String[]{"v 1 2", "x 2 2", "v 1 2", "> 2 1", "x 2 3", "> 2 1", "< 2 0"};
        int count = 0;
        for (String query : queries) {
            if (!query.split(" ")[0].equals("x")) {
                count++;
            }
        }

        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
        // int[][] solution = new int[count][2];
        for (String query : queries) {
            String[] parts = query.split(" ");
            String instruction = parts[0];
            String row = parts[1];
            String column = parts[2];

            try {
                if (instruction.equals("v")) {
                    int newColumn = Integer.parseInt(column);
                    ArrayList<Integer> boardPiece = new ArrayList<>();
                    boardPiece.add(Integer.parseInt(row));
                    boardPiece.add(Integer.parseInt(column));
                    solution.add(boardPiece);
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }

        System.out.println(solution);
    }


}