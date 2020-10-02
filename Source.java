public class Source {
   public static int calculateSumofNumbers(String[] array) {
      int sum = 0;
      for (String i : array) {
         /*
          * TODO: Handle the exception thrown during parsing the integer value
          * from string so that sum of all the integer numbers can be calculated
          * successfully in the given array.
          */
         try {
            sum += Integer.parseInt(i);
         } catch (NumberFormatException e) {
         }
      }

      return sum;
   }

   public static void main(String[] args) {
      String[] array = { "1", "2", "3", "5" };
      // uncomment below line and comment above line for testing sample test case 2
//      String[] array = { "1", "2", "3", "abc", "5" };
      
      System.out.println(calculateSumofNumbers(array));
   }
}
