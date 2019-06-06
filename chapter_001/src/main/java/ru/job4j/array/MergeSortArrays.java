package ru.job4j.array;

/**
 * Merge two sort arrays.
 *
 * @author Maksym Mateiuk (maxymmateuk@gmail.com)
 */
public class MergeSortArrays
{
   public int[] merge(int[] left, int[] right) {

       int[] result = new int[left.length + right.length];
       int i = 0;
       int j = 0;
       int k = 0;

       while (i < left.length && j < right.length) {
           if (left[i] < right[j]) {
               result[k] = left[i];
               i++;
           } else {
               result[k] = right[j];
               j++;
           }
           k++;
       }

       while (i < left.length) {
           result[k] = left[i];
           i++;
           k++;
       }

       while (j < right.length) {
           result[k] = right[j];
           j++;
           k++;
       }

       return result;
   }
}
