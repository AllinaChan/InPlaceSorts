public class Runner {
        public static void main(String[] args)
        {
            String[] stringArr= InPlaceSorts.randomStringArr(5, 5);
            int[] intArr= InPlaceSorts.randIntArr(5);
            double[] doubleArr= InPlaceSorts.randDoubleArr(5);

            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printArr(arr));

            long time= System.nanoTime();
           //InPlaceSorts.bubbleSort(arr);
            //InPlaceSorts.selectionSort(arr);
            InPlaceSorts.insertionSort(intArr);
            System.out.println("After: ");
            System.out.println(InPlaceSorts.printArr(arr));
            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);
        }
    }
