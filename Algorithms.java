<<<<<<< HEAD
=======

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 * Created by Rafał on 2017-04-04.
 */
public class Algorithms {
 /*  public void quickSort(int lowerIndex, int higherIndex) {
        BufferedReader bufferedReader = null;
        ArrayList<Long> durationTime = null;
        int i = 0;
        int j = array.length;
<<<<<<< HEAD
=======


>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
       long start = System.nanoTime();
       int pivot = values[lowerIndex+(higherIndex-lowerIndex)/2];
                    // Divide into two arrays
                    while (i <= j) {
                        while (values[i] < pivot) {
                            i++;
                        }
                        while (values[j] > pivot) {
                            j--;
                        }
                        if (i <= j) {
                            int temp = values[i];
                            values[i] = values[j];
                            values[j] = temp;
                            //move index to next position on both sides
                            i++;
                            j--;
                        }
                    }
                    // call quickSort() method recursively
                    if (lowerIndex < j)
                        quickSort(lowerIndex, j);
                    if (i < higherIndex)
                        quickSort(i, higherIndex);
                    long end = System.nanoTime();
                    durationTime.add(end - start);
                }
<<<<<<< HEAD
=======

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
            long max = 0;
            long sum = 0;
            long min = Long.MAX_VALUE;
            for(int v = 0; v < durationTime.size();v++){
                sum+=durationTime.get(v);
                if(durationTime.get(v) > max){
                    max = durationTime.get(v);
                }
                if(durationTime.get(v)<min){
                    min = durationTime.get((v));
                }
            }
<<<<<<< HEAD
=======

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
            long avg = sum/durationTime.size();
            System.out.println("avg "+avg);
            System.out.println("max "+max);
            System.out.println("min "+min);
<<<<<<< HEAD
=======



>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
/*
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/


    public long shellSort(int[] array) {

        long start=System.nanoTime();
<<<<<<< HEAD
        int min, max, temp;
=======
        int inner, outer, temp;
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

        int interval = 1;
        while (interval <= array.length / 3) {

            // Define an interval sequence

            interval = interval * 3 + 1;
        }
        // Keep looping until the interval is 1
        // Then this becomes an insertion sort

        while (interval > 0) {

            // Continue incrementing outer until the end of the array is reached

<<<<<<< HEAD
            for (max = interval; max < array.length; max++) {
=======
            for (outer = interval; outer < array.length; outer++) {
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

                // Store the value of the array in temp unless it has to be
                // copied to a space occupied by a bigger number closer to the
                // beginning of the array

<<<<<<< HEAD
                temp = array[max];
=======
                temp = array[outer];
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

                // inner is assigned the value of the highest index to check
                // against all values the proceed it. Along the way if a
                // number is greater than temp it will be moved up in the array

<<<<<<< HEAD
                min = max;
=======
                inner = outer;
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

                // While there is a number bigger than temp move it further
                // up in the array

<<<<<<< HEAD
                while (min > interval - 1
                        && array[min - interval] >= temp) {
=======
                while (inner > interval - 1
                        && array[inner - interval] >= temp) {
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17


                    // Make room for the smaller temp by moving values in the
                    // array
                    // up one space if they are greater than temp

<<<<<<< HEAD
                    array[min] = array[min - interval];

                    min -= interval;
=======
                    array[inner] = array[inner - interval];

                    inner -= interval;
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

                }

                // Now that everything has been moved into place put the value
                // stored in temp into the index above the first value smaller
                // than it is

<<<<<<< HEAD
                array[min] = temp;
=======
                array[inner] = temp;
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17

            }

            // Once we get here we have interval sorted our array
            // so we decrement interval and go again

            interval = (interval - 1) / 3;
        }
        long result =  System.nanoTime()-start;

        return result;
    }
<<<<<<< HEAD

=======
}
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17


/*
    public ArrayList<Long> quickSort(int[] array){
<<<<<<< HEAD
=======

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
        ArrayList ar = new ArrayList();
        for(int i = 0; i < 100; i++) {
            for (Integer j : array) {
             //   System.out.println(j);
            }
<<<<<<< HEAD
=======


>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
            long start = System.nanoTime();
            for (int k = 0; k < 100000; k++) {
            }
            long finish = System.nanoTime();
            long result = finish - start;
<<<<<<< HEAD
            ar.add(result);
        }
        return ar;
    }public ArrayList<Long> librarySort(int[] array){
=======

            ar.add(result);
        }
        return ar;



    }public ArrayList<Long> librarySort(int[] array){

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
        ArrayList ar = new ArrayList();
        for(int i = 0; i < 100; i++) {
            for (Integer j : array) {
           //     System.out.println(j);
            }
<<<<<<< HEAD
=======


>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
            long start = System.nanoTime();
            for (int k = 0; k < 100000; k++) {
            }
            long finish = System.nanoTime();
            long result = finish - start;
<<<<<<< HEAD
=======

>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
            ar.add(result);
        }
        return ar;
    }
<<<<<<< HEAD
*/


    public long quickSort(int[] array, int min, int max) {
        long start = System.nanoTime();
        if (max - min > 1) {


            int pivot, idMax, idMin, temp;
            pivot = array[min];
            idMax = ++min;
            idMin = --max;
            do {
                while (idMax <= idMin && array[idMax] <= pivot) {
                    idMax++;
                }

                while (array[idMin] > pivot) {
                    idMin--;
                }

                if (idMax < idMin) {
                    temp = array[idMax];
                    array[idMax] = array[idMin];
                    array[idMin] = temp;
                }
            } while (idMax < idMin);
            array[min] = array[idMin];
            array[idMin] = pivot;
            quickSort(array, min, idMin);
            quickSort(array, idMin + 1, max);

        }
        return System.nanoTime() - start;
    }
void quicksort(int[] array, int len){
    quickSort(array,0,len);
}



    }
=======



  /*
    public ArrayList quickSort(String fileName){
        BufferedReader bufferedReader = null;
        ArrayList<Long> durationTime = null;

        try {
            File file = new File(fileName);
            bufferedReader = new BufferedReader(new FileReader(file));
            durationTime = new ArrayList<Long>();


            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                String[] s = line.split("/n");

                for (String string : s) {
                 //   System.out.println(string);
                    String[] p = string.split("/");
                    int[] values= new int[p.length];
                    long start = System.nanoTime();

                    for(int i = 0; i < p.length;i++){
                        values[i] = Integer.parseInt(p[i]);
                    }

                  for (int i = 0; i < values.length - 1; i++)
                    {
                        int index = i;
                        for (int j = i + 1; j < values.length; j++)
                            if (values[j] < values[index])
                                index = j;

                        int smallerNumber = values[index];
                       values[index] = values[i];
                        values[i] = smallerNumber;
                    }
                    long end = System.nanoTime();
                    durationTime.add(end - start);
                }
            }
            long max = 0;
            long sum = 0;
            long min = Long.MAX_VALUE;
            for(int i = 0; i < durationTime.size();i++){
                sum+=durationTime.get(i);
                if(durationTime.get(i) > max){
                    max = durationTime.get(i);
                }
                if(durationTime.get(i)<min){
                    min = durationTime.get((i));
                }
            }

            long avg = sum/durationTime.size();
            System.out.println("avg "+avg);
            System.out.println("max "+max);
            System.out.println("min "+min);




        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return durationTime;
    }
*/
>>>>>>> 6361f726483eaa8573623ece0ce7d51ab4ee1c17
