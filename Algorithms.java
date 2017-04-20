
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

            long avg = sum/durationTime.size();
            System.out.println("avg "+avg);
            System.out.println("max "+max);
            System.out.println("min "+min);



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
        int inner, outer, temp;

        int interval = 1;
        while (interval <= array.length / 3) {

            // Define an interval sequence

            interval = interval * 3 + 1;
        }
        // Keep looping until the interval is 1
        // Then this becomes an insertion sort

        while (interval > 0) {

            // Continue incrementing outer until the end of the array is reached

            for (outer = interval; outer < array.length; outer++) {

                // Store the value of the array in temp unless it has to be
                // copied to a space occupied by a bigger number closer to the
                // beginning of the array

                temp = array[outer];

                // inner is assigned the value of the highest index to check
                // against all values the proceed it. Along the way if a
                // number is greater than temp it will be moved up in the array

                inner = outer;

                // While there is a number bigger than temp move it further
                // up in the array

                while (inner > interval - 1
                        && array[inner - interval] >= temp) {


                    // Make room for the smaller temp by moving values in the
                    // array
                    // up one space if they are greater than temp

                    array[inner] = array[inner - interval];

                    inner -= interval;

                }

                // Now that everything has been moved into place put the value
                // stored in temp into the index above the first value smaller
                // than it is

                array[inner] = temp;

            }

            // Once we get here we have interval sorted our array
            // so we decrement interval and go again

            interval = (interval - 1) / 3;
        }
        long result =  System.nanoTime()-start;

        return result;
    }
}


/*
    public ArrayList<Long> quickSort(int[] array){

        ArrayList ar = new ArrayList();
        for(int i = 0; i < 100; i++) {
            for (Integer j : array) {
             //   System.out.println(j);
            }


            long start = System.nanoTime();
            for (int k = 0; k < 100000; k++) {
            }
            long finish = System.nanoTime();
            long result = finish - start;

            ar.add(result);
        }
        return ar;



    }public ArrayList<Long> librarySort(int[] array){

        ArrayList ar = new ArrayList();
        for(int i = 0; i < 100; i++) {
            for (Integer j : array) {
           //     System.out.println(j);
            }


            long start = System.nanoTime();
            for (int k = 0; k < 100000; k++) {
            }
            long finish = System.nanoTime();
            long result = finish - start;

            ar.add(result);
        }
        return ar;
    }



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
