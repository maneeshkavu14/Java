public class PlayWithArray{
    public static void main(String[] args)
    {
        
        byte[] byteArray = {9, 7, 4, 2, 6, 8, 3, 1, 5, 0};
        short[] shortArray = {3, 7, 1, 5, 9, 2, 8, 4, 6, 0};
        int[] intArray = {18, 27, 35, 49, 66, 73, 84, 95, 100, 112};
        long[] longArray = {500, 300, 100, 400, 250, 600, 450, 150, 350, 200};
        char[] charArray = {'X', 'Y', 'Z', 'U', 'V', 'W', 'P', 'Q', 'R', 'S'};
        float[] floatArray = {14.6f, 9.2f, 35.4f, 21.5f, 12.9f, 4.8f, 7.3f, 18.2f, 27.5f, 30.1f};
        double[] doubleArray = {11.5d, 22.8d, 33.9d, 44.6d, 55.7d, 66.2d, 77.4d, 88.1d, 99.3d, 10.7d};
        boolean[] booleanArray = {true, true, false, false, true, false, true, false, false, true};



      // Byte

      System.out.println("Array elements of byte array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<byteArray.length;i++)
      {
        System.out.println(byteArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=byteArray.length-1;i>=0;i--)
      {
        System.out.println(byteArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<byteArray.length;i++)
      {
        System.out.println(byteArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=6;i>=0;i--)
      {
        System.out.println(byteArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<byteArray.length;i=i+2)
      {
        System.out.println(byteArray[i]);
      }


      // Short

      System.out.println("Array elements of short array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<shortArray.length;i++)
      {
        System.out.println(shortArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=shortArray.length-1;i>=0;i--)
      {
        System.out.println(shortArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<shortArray.length;i++)
      {
        System.out.println(shortArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(shortArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<shortArray.length;i=i+2)
      {
        System.out.println(shortArray[i]);
      }



      // Int

      System.out.println("Array elements of Integer array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<intArray.length;i++)
      {
        System.out.println(intArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=intArray.length-1;i>=0;i--)
      {
        System.out.println(intArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<intArray.length;i++)
      {
        System.out.println(intArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(intArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<intArray.length;i=i+2)
      {
        System.out.println(intArray[i]);
      }

      

      // Long

      System.out.println("Array elements of long array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<longArray.length;i++)
      {
        System.out.println(longArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=longArray.length-1;i>=0;i--)
      {
        System.out.println(longArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<longArray.length;i++)
      {
        System.out.println(longArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(longArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<longArray.length;i=i+2)
      {
        System.out.println(longArray[i]);
      }


      // Char

      System.out.println("Array elements of character array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<charArray.length;i++)
      {
        System.out.println(charArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=intArray.length-1;i>=0;i--)
      {
        System.out.println(charArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<charArray.length;i++)
      {
        System.out.println(charArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(charArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<charArray.length;i=i+2)
      {
        System.out.println(charArray[i]);
      }
      


      // Float

      System.out.println("Array elements of float array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<floatArray.length;i++)
      {
        System.out.println(floatArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=floatArray.length-1;i>=0;i--)
      {
        System.out.println(floatArray[i]);
      }
      System.out.print("Middle to right:");
      for(int i=5;i<floatArray.length;i++)
      {
        System.out.println(floatArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(floatArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<floatArray.length;i=i+2)
      {
        System.out.println(floatArray[i]);
      }


      // Double

      System.out.println("Array elements of double array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<doubleArray.length;i++)
      {
        System.out.println(doubleArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=doubleArray.length-1;i>=0;i--)
      {
        System.out.println(floatArray[i]);
      }
      System.out.print("Middle to right:");
      for(int i=5;i<floatArray.length;i++)
      {
        System.out.println(floatArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(floatArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<floatArray.length;i=i+2)
      {
        System.out.println(floatArray[i]);
      }


      // Boolean
    
      System.out.println("Array elements of boolean array\n");
      System.out.println("Array elements from left to right:");
      for(int i=0;i<booleanArray.length;i++)
      {
        System.out.println(booleanArray[i]);
      }
      System.out.println("Array elements from right to left:");
      for(int i=booleanArray.length-1;i>=0;i--)
      {
        System.out.println(booleanArray[i]);
      }
      System.out.println("Middle to right:");
      for(int i=5;i<booleanArray.length;i++)
      {
        System.out.println(booleanArray[i]);
      }
      System.out.println("Middle to left:");
      for(int i=5;i>=0;i--)
      {
        System.out.println(booleanArray[i]);
      }
      System.out.println("Skipping one index:");
      for(int i=0;i<booleanArray.length;i=i+2)
      {
        System.out.println(booleanArray[i]);
      }

    }
}