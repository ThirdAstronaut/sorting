import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;




/**
 * Created by Rafał on 2017-03-29.
 */
public class NumbersGenerator {

    void generateTestSequences() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
        int[] tab = new int[1_000];

        for (int i = 0; i < 1_000; i++) {
            tab[i]=ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
        }
        out.writeObject(tab);

        out.close();
    }


    void generate10kSequences() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("10k.txt"));
        int[] tab = null;
        for (int i = 0; i < 100; i++) {
            tab = new int[10_000];
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\10k\\0\\" +(i + 1) + ".txt"));

            for (int j = 0; j < 10_000; j++) {
                tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
            }
            out.writeObject(tab);
        }
        out.close();
    }



    void generate50kSequences() throws IOException {
        ObjectOutputStream out =null;
        int[] tab = null;
        for (int i = 0; i < 100; i++) {
            tab = new int[50_000];
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\50k\\0\\" + (i + 1) + ".txt"));
            for (int j = 0; j < 50_000; j++) {
                tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
            }
            out.writeObject(tab);
        }
        out.close();
    }


    void generate100kSequences() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("100k.txt"));
        int[] tab = null;
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\100k\\0\\" + (i + 1) + ".txt"));
            tab = new int[100_000];
            for (int j = 0; j < 10_000_000; j++) {
                tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
            }
            out.writeObject(tab);
        }
        out.close();
    }

    void generate500kSequences() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("500k.txt"));
        int[] tab = null;
        for (int i = 0; i < 100; i++) {
            tab = new int[500_000];
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\500k\\0\\" + (i + 1) + ".txt"));

            for (int j = 0; j < 500_000; j++) {
                tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
            }
            out.writeObject(tab);
        }
        out.close();
    }

    void generate1MSequences() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1M.txt"));
        int[] tab = null;
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\1M\\0\\" + (i + 1) + ".txt"));
            tab = new int[1_000_000];
            for (int j = 0; j < 1_000_000; j++) {
                tab[j] = ThreadLocalRandom.current().nextInt(0, 300_999 + 1);
            }
            out.writeObject(tab);
        }
        out.close();
    }



    void generate10kSequences_Sorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\10k\\100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 10_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            Collections.sort(arrayList);
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }

    void generate50kSequences_Sorted() throws IOException {
        ObjectOutputStream out =null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\50k\\100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 50_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            Collections.sort(arrayList);
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }


    void generate100kSequences_Sorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\100k\\100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 100_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            Collections.sort(arrayList);
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }



    void generate500kSequences_Sorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\500k\\100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 500_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            Collections.sort(arrayList);
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }



    void generate1MSequences_Sorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {

            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\1M\\100\\"+(i + 1)+".txt"));
            for (int j = 0; j < 1_000_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }

            Collections.sort(arrayList);
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }



    void generate10kSequences_PartlySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {

            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\10k\\50\\"+(i + 1)+".txt"));
            for (int j = 0; j < 5_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
            }
            Collections.sort(arrayList);

            for (int p = 0; p < 5_000; p++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
            }
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }





    void generate50kSequences_PartlySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {

            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\50k\\50\\"+(i + 1)+".txt"));
            for (int j = 0; j < 25_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
            }
            Collections.sort(arrayList);

            for (int p = 0; p < 25_000; p++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
            }
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }



    void generate100kSequences_PartlySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {

            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\100k\\50\\"+(i + 1)+".txt"));
            for (int j = 0; j < 50_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
            }
            Collections.sort(arrayList);

            for (int p = 0; p < 50_000; p++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
            }
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }

    void generate500kSequences_PartlySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {

            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\500k\\50\\"+(i + 1)+".txt"));
            for (int j = 0; j < 250_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
            }
            Collections.sort(arrayList);

            for (int p = 0; p < 250_000; p++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
            }
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }

    void generate1MSequences_PartlySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\1M\\50\\"+(i + 1)+".txt"));

            for (int j = 0; j < 500_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 125_000 + 1));
            }
            Collections.sort(arrayList);

            for (int p = 0; p < 500_000; p++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(135_000, 300_000 + 1));
            }
            int[] tab = new int[arrayList.size()];
            for (int k = 0; k < arrayList.size(); k++) {
                tab[k] = arrayList.get(k);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }





    void generate10kSequences_ReverselySorted() throws IOException {
        ArrayList<Integer> arrayList = new ArrayList();
        ObjectOutputStream out = null;
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\10k\\-100\\"+(i + 1)+".txt"));
            for (int j = 0; j < 10_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            int[] tab = new int[arrayList.size()];
            Collections.sort(arrayList, Collections.reverseOrder());
            for(int p = 0; p < arrayList.size(); p++){
                tab[p] = arrayList.get(p);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }


    void generate50kSequences_ReverselySorted() throws IOException {

        ArrayList<Integer> arrayList = new ArrayList();
        ObjectOutputStream out = null;
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\50k\\-100\\"+(i + 1)+".txt"));
            for (int j = 0; j < 50_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            int[] tab = new int[arrayList.size()];
            Collections.sort(arrayList, Collections.reverseOrder());
            for(int p = 0; p < arrayList.size(); p++){
                tab[p] = arrayList.get(p);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }


    void generate100kSequences_ReverselySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\100k\\-100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 100_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            int[] tab = new int[arrayList.size()];
            Collections.sort(arrayList, Collections.reverseOrder());
            for(int p = 0; p < arrayList.size(); p++){
                tab[p] = arrayList.get(p);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }


    void generate500kSequences_ReverselySorted() throws IOException {
        ObjectOutputStream out = null;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\500k\\-100\\"+(i + 1)+".txt"));

            for (int j = 0; j < 500_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            int[] tab = new int[arrayList.size()];
            Collections.sort(arrayList, Collections.reverseOrder());
            for(int p = 0; p < arrayList.size(); p++){
                tab[p] = arrayList.get(p);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }


    void generate1MSequences_ReverselySorted() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1M_reverselySorted.txt"));
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rafał\\IdeaProjects\\SortingAlghoritms_AiSD\\1M\\-100\\rev"+(i + 1)+".txt"));

            for (int j = 0; j < 1_000_000; j++) {
                arrayList.add(ThreadLocalRandom.current().nextInt(0, 300_999 + 1));
            }
            int[] tab = new int[arrayList.size()];
            Collections.sort(arrayList, Collections.reverseOrder());
            for(int p = 0; p < arrayList.size(); p++){
                tab[p] = arrayList.get(p);
            }
            out.writeObject(tab);
            arrayList.clear();
        }
        out.close();
    }




    public static void main(String[] args) throws IOException {
        NumbersGenerator numbersGenerator = new NumbersGenerator();


        //      numbersGenerator.generateTestSequences();

        //            numbersGenerator.generate10kSequences();
//             numbersGenerator.generate50kSequences();
//            numbersGenerator.generate100kSequences();
//             numbersGenerator.generate500kSequences();
//              numbersGenerator.generate1MSequences();


        //           numbersGenerator.generate10kSequences_Sorted();
        //       numbersGenerator.generate50kSequences_Sorted();
        //           numbersGenerator.generate100kSequences_Sorted();
        //             numbersGenerator.generate500kSequences_Sorted();
        //           numbersGenerator.generate1MSequences_Sorted();


//             numbersGenerator.generate10kSequences_PartlySorted();
        //            numbersGenerator.generate50kSequences_PartlySorted();
//              numbersGenerator.generate100kSequences_PartlySorted();
//              numbersGenerator.generate500kSequences_PartlySorted();
//             numbersGenerator.generate1MSequences_PartlySorted();


        //           numbersGenerator.generate10kSequences_ReverselySorted();
        //            numbersGenerator.generate50kSequences_ReverselySorted();
        //            numbersGenerator.generate100kSequences_ReverselySorted();
        //            numbersGenerator.generate500kSequences_ReverselySorted();
        //           numbersGenerator.generate1MSequences_ReverselySorted();







    }

}
