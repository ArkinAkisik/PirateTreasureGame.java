import java.util.Scanner;
public class PirateTreasureMap {
    public static void main(String[] args) {  // Created main and import scanner


        char [][] array = new char[25][25];
        array[0][1] = 'L';array[0][2] = 'L';array[0][3] = 'L';array[0][4] = 'L';array[0][5] = 'L';
        array[0][0] = 'L';array[0][6] = 'L';array[0][7] = 'L';array[0][8] = 'L';array[1][0] = 'L';
        array[1][1] = 'L';array[1][2] = 'L';array[1][3] = 'L';array[1][4] = 'L';array[1][5] = 'L';
        array[1][6] = 'L';array[1][7] = 'L';array[2][0] = 'L';array[2][1] = 'L';array[2][2] = 'L';
        array[2][3] = 'L';array[2][4] = 'L';array[2][5] = 'L';array[2][6] = 'L';array[2][7] = 'L';
        array[3][0] = 'L';array[3][1] = 'L';array[3][2] = 'L';array[3][3] = 'L';array[3][4] = 'L';
        array[3][5] = 'L';array[3][6] = 'L';  // Made some Land for the Map.  So I had to initialized syntax.


        Scanner scan = new Scanner(System.in);

        int size=25;
        int column=25;
        int row=25;
         //integer the values



        {

            System.out.println("Hide your first Treasure on the 25 by 25 Map! and your Treasure will be shown as 'T' on the map:");

            column = scan.nextInt() -1; // for the scanner I had to make -1 cause index starts at 0 so order number will be normal.
            row = scan.nextInt() -1;



            array[column][row] = 'T';  // How treasure will be shown in the map.
            System.out.println("Treasure map is :");
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {


                    System.out.print(array[i][j]);
                }
                System.out.println(" ");

            }

            System.out.println("Hide your second Treasure on the 25 by 25 Map! and your Treasure will be shown as 'T' on the map:");

            column = scan.nextInt() -1; // -1 cause index starts at 0
            row = scan.nextInt() -1;



            array[column][row] = 'T';
            System.out.println("Treasure map is :");
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {


                    System.out.print(array[i][j]);
                }
                System.out.println(" ");

            }

        }
        ScanTreasure(size, column, row, array);
    }
    public static void ScanTreasure  // second public main for the treasure scanner
            (int size, int column, int row,char[][] array)  // integer all of them again.
    {
        for(int k=0;k<size;k++)  // for loop to ask user until they find the treasure.
        {

            Scanner scan = new Scanner(System.in);

            System.out.println("To find the treasure, Input your treasure column and row");

            int scanColumn = scan.nextInt() - 1;

            int scanRow = scan.nextInt() - 1;

            if (array[scanColumn][scanRow]==array[column][row])  // if statement when coordinates matches then it prints off.

            {
                System.out.println("woo hooo! you have retrieved the treasure!");
            }
        }

    }

}

