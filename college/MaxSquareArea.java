// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class MaxSquareArea {
   public MaxSquareArea() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int[][] var4 = new int[var2][var3];

      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         for(int var6 = 0; var6 < var3; ++var6) {
            var4[var5][var6] = var1.nextInt();
         }
      }

      var5 = var1.nextInt();
      int[][] var11 = new int[var5][3];

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         var11[var7][0] = var1.nextInt();
         var11[var7][1] = var1.nextInt();
         var11[var7][2] = var1.nextInt();
      }

      for(var7 = 0; var7 < var5; ++var7) {
         int var8 = var11[var7][0];
         int var9 = var11[var7][1];
         int var10 = var11[var7][2];
         System.out.println(maxSquareArea(var2, var3, var4, var8, var9, var10));
      }

      var1.close();
   }

   private static int maxSquareArea(int var0, int var1, int[][] var2, int var3, int var4, int var5) {
      int[][] var6 = new int[var0 + 1][var1 + 1];

      int var7;
      int var8;
      for(var7 = 1; var7 <= var0; ++var7) {
         for(var8 = 1; var8 <= var1; ++var8) {
            var6[var7][var8] = var2[var7 - 1][var8 - 1] + var6[var7 - 1][var8] + var6[var7][var8 - 1] - var6[var7 - 1][var8 - 1];
         }
      }

      var7 = 0;
      var8 = 0;
      int var9 = Math.min(var0, var1);

      while(var8 <= var9) {
         int var10 = (var8 + var9) / 2;
         int var11 = Math.max(0, var3 - var10);
         int var12 = Math.max(0, var4 - var10);
         int var13 = Math.min(var0, var3 + var10 + 1);
         int var14 = Math.min(var1, var4 + var10 + 1);
         int var15 = var6[var13][var14] - var6[var11][var14] - var6[var13][var12] + var6[var11][var12];
         if (var15 <= var5) {
            var7 = Math.max(var7, (2 * var10 + 1) * (2 * var10 + 1));
            var8 = var10 + 1;
         } else {
            var9 = var10 - 1;
         }
      }

      return var7;
   }
}
