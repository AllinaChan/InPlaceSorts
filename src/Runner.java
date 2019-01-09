public class Runner {
        public static void main(String[] args)
        {
            int[] arr= InPlaceSorts.randIntArr(5);


            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printArr(arr));

            long time= System.nanoTime();
            //InPlaceSorts.bubbleSort(arr);
            InPlaceSorts.selectionSort(arr);


            System.out.println("After: ");
            System.out.println(InPlaceSorts.printArr(arr));
            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);
        }
    }
