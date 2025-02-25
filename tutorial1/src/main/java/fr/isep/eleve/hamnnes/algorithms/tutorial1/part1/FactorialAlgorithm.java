package main.java.fr.isep.eleve.hamnnes.algorithms.tutorial1.part1;


public class FactorialAlgorithm {

   public FactorialAlgorithm() {
   }

   public static int factorialRecursive(int n) {
      return n == 0 ? 1 : n * factorialRecursive(n - 1);
   }

   public static int factorialIterative(int n) {
      for(int i = n - 1; i > 0; --i) {
         n *= i;
      }

      return n;
   }
}

