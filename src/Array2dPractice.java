public class Array2dPractice {

    // Declare all methods as static.
    // 1. sumAllCells
    public static int sumAllCells(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }


    // 2. sumRowN
    public static int sumRowN(int[][] array, int k) {
        int sum = 0;
        for (int i = 0; i < array[k].length; i++) {
            sum = sum + array[k][i];
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int[][] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][k];
        }
        return sum;
    }


    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] array, int startRow, int startCollum, int endRow, int endCollum) {
        int sum = 0;



        for(int j =startCollum; j<= array[startRow].length -1;j++)
        {
            sum+= array[startRow][j];

        }

       if(startRow!= endRow)
       {
           for(int r = startRow+1;r<= endRow;r++) {
                   if (r< endRow)
                   {
                       for (int i = 0; i < array[r].length; i++) {
                           sum += array[r][i];
                       }
                   } 


                   if(r==endRow){
                       for(int f = 0; f<= endCollum;f++)
                       {
                           System.out.println(array[endRow][f]);
                           sum = sum + array[endRow][f];
                       }
               }
           }
       }
       if(startRow ==endRow)
       {
           return sum;
       }



        return sum;


    }
}
