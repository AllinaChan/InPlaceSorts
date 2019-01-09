public class Runner {
        public static void main(String[] args)
        {
            int[] arr= SortingUtil.randIntArr(5);


            System.out.println("Before: ");
            System.out.println(SortingUtil.printArr(arr));

            long time= System.nanoTime();
            //SortingUtil.bubbleSort(arr);
            SortingUtil.selectionSort(arr);


            System.out.println("After: ");
            System.out.println(SortingUtil.printArr(arr));
            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);
        }
    }

}
