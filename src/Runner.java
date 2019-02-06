//Author: Allen Chen, Johnathan
public class Runner {
        public static void main(String[] args)
        {
            String[] stringArr= InPlaceSorts.randomStringArr(5, 5);
            int[] intArr= InPlaceSorts.randIntArr(10000);
            int[] mergeIntArr= InPlaceSorts.randIntArr(50000);
            int[] quickIntArr= InPlaceSorts.randIntArr(50000);
            double[] doubleArr= InPlaceSorts.randDoubleArr(5);


            System.out.println("----BUBBLE SORT--strings--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printStringArr(stringArr));

            long time= System.nanoTime();
            InPlaceSorts.bubbleSort(stringArr);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printStringArr(stringArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);

            System.out.println("------Selection Sort---doubles--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printDoubleArr(doubleArr));
            time= System.nanoTime();
            InPlaceSorts.selectionSort(doubleArr);
            System.out.println("After: ");
            System.out.println(InPlaceSorts.printDoubleArr(doubleArr));
            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);


            System.out.println("----Insertion Sort--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(intArr));

            time= System.nanoTime();
            InPlaceSorts.insertionSort(intArr);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(intArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);



            System.out.println("----Merge Sort--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(mergeIntArr));

            time= System.nanoTime();
            InPlaceSorts.mergeSort(mergeIntArr);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(mergeIntArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);


            System.out.println("----Quick Sort--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr));

            time= System.nanoTime();
            InPlaceSorts.quickSort(quickIntArr,0, quickIntArr.length-1);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);



        }
    }
