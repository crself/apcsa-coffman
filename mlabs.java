public class mlabs
{
	public static void main(String[] args)
	{
     String matrix[][] = new String[3][3];
     displayRowMajorRL(matrix);
     displayColumnMajorTD(matrix);
     displayRowMajorLR(matrix);
     displayColumnMajorDT(matrix);
     displayEvens(matrix);
     displayDoubles(matrix);
     displayTelescope(matrix);
   }
   public static void displayRowMajorRL(String [][] matrix)
   {  
         for(int row=0;row<matrix.length;row++)
         {
            for(int col=0;col<matrix[0].length;col++)
            {
               matrix[row][col]="[" + row + "][" + col + "]";
            }
         }
         System.out.println();
         System.out.println("Row Major Right to Left");
         for(int row=0;row<matrix.length;row++)
         {
            for(int col=0;col<matrix[0].length;col++)
            {
               System.out.print(matrix[row][col]);
            }
            System.out.println();
         }
   }
   public static void displayColumnMajorTD(String [][] matrix)
   {
     for(int row=0;row<matrix.length;row++)
     {
        for(int col=0;col<matrix[0].length;col++)
        {
           matrix[row][col]="[" + row + "][" + col + "]";
        }
     }
     System.out.println();
     System.out.println("Column Major Top to Bottom");
     for(int col=0;col<matrix.length;col++)
     {
         for(int row=0;row<matrix[0].length;row++)
         {
            System.out.print(matrix[col][row]);
         }
         System.out.println();
     }
   }
   public static void displayRowMajorLR(String [][] matrix)
   {  
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=0;col<matrix[0].length;col++)
         {
            matrix[row][col]="[" + row + "][" + col + "]";
         }
      }
      System.out.println();
      System.out.println("Row Major Left to Right");
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=matrix[0].length-1;col>=0;col--)
         {
            System.out.print(matrix[row][col]);
         }
         System.out.println();
      }
   }
   public static void displayColumnMajorDT(String [][] matrix)
   {
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=0;col<matrix[0].length;col++)
         {
            matrix[row][col]="[" + row + "][" + col + "]";
         }
      }
      System.out.println();
      System.out.println("Column Major Bottom to Top");
      for(int col=matrix.length-1;col>=0;col--)
      {
         for(int row=0;row<matrix[0].length;row++)
         {
            System.out.print(matrix[col][row]);
         }
         System.out.println();
      }
   }
   public static void displayEvens(String [][] matrix)
   {
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=0;col<matrix[0].length;col++)
         {
            matrix[row][col]="[" + row + "][" + col + "]";
         }
      }
      System.out.println();
      System.out.println("Row Major Evens & Zeros");
      for(int row=0;row<matrix.length;row++)
      {
        for(int col=0;col<matrix[0].length;col++)
        {
         if(row%2==0 && col%2==0)
            System.out.print(matrix[row][col]);
        }
         System.out.println();
      }
   }
   public static void displayDoubles(String [][] matrix)
   {
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=0;col<matrix[0].length;col++)
         {
            matrix[row][col]="[" + row + "][" + col + "]";
         }
      }
      System.out.println();
      System.out.println("Row Major Doubles");
      for(int row=0;row<matrix.length;row++)
      {
        for(int col=0;col<matrix[0].length;col++)
        {
         if(row==col)
            System.out.print(matrix[row][col]);
        }
        System.out.println();
      }
   }
   public static void displayTelescope(String [][] matrix)
   {  
      for(int row=0;row<matrix.length;row++)
      {
         for(int col=0;col<matrix[0].length;col++)
         {
            matrix[row][col]="[" + row + "][" + col + "]";
         }
      }
      System.out.println();
      System.out.println("Row Major Telescope");
      for(int row=0;row<matrix.length;row++)
      {
         if(row%2==0)
         {
            for(int col=0;col<matrix[0].length;col++)
            {
               System.out.print(matrix[row][col]);
            }
         }
         else if(!(row%2==0))
         {
            for(int col=matrix[0].length-1;col>=0;col--)
            {
               System.out.print(matrix[row][col]);
            }
         }
         System.out.println();
      }
   }
}