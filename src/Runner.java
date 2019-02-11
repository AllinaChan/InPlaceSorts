//Author: Allen Chen, Johnathan
public class Runner {
        public static void main(String[] args)
        {
            String[] stringArr= InPlaceSorts.randomStringArr(5, 5);
            String[] stringArr1= InPlaceSorts.randomStringArr(10000, 5);
            String[] strings= {"feizh", "feizh", "arrpl", "loopp", "ueoee"};
            int[] intArr= InPlaceSorts.randIntArr(10000);
            int[] mergeIntArr= InPlaceSorts.randIntArr(50000);
            int[] quickIntArr= InPlaceSorts.randIntArr(50000);
            int[] quickIntArr2= quickIntArr.clone();
            int[] quickIntArr3= quickIntArr2.clone();
            double[] doubleArr= InPlaceSorts.randDoubleArr(5);
            int[] testArr= InPlaceSorts.randMostSortIntArray(100000);
            int[] testArr2=InPlaceSorts.randMostSortIntArray(100000);
            int[][] Multi=InPlaceSorts.randMultiArray(1000,1000);
            int []MakeittoOne=InPlaceSorts.MakeintoOne(Multi);
            int[] arr = new int[4];
            arr[0]=1;
            arr[1]=0;
            arr[2]=10;
            arr[3]=12;
            System.out.println(InPlaceSorts.FindMedian(arr, arr.length));

            long time= System.nanoTime();
/*
            System.out.println("----BUBBLE SORT--strings--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printStringArr(stringArr));

            long time= System.nanoTime();

            InPlaceSorts.bubbleSort(stringArr);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printStringArr(stringArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);

            /*
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

*//*
            System.out.println("----TimSort--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr2));

            time= System.nanoTime();
            InPlaceSorts.timSort(quickIntArr2,quickIntArr2.length);
            time=System.nanoTime()-time;

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr2));


            System.out.println("Time take: "+ time);

*/



            System.out.println("----Quick Sort3--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr3));

            time= System.nanoTime();
            InPlaceSorts.quickSort3(quickIntArr3,0, quickIntArr3.length-1);
            time=System.nanoTime()-time;

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(quickIntArr3));


            System.out.println("Time take: "+ time);




            System.out.println("----Quick Sort3-Strings--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printStringArr(strings));

            time= System.nanoTime();
            InPlaceSorts.quickSortString(strings,0, strings.length-1);
            time=System.nanoTime()-time;

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printStringArr(strings));


            System.out.println("Time take: "+ time);


            System.out.println(InPlaceSorts.binarySearch(strings, 0, strings.length-1 ,"feizh", strings.length));



/*
            System.out.println("----MostlySortedTestInserstion--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(testArr));

            time= System.nanoTime();
            InPlaceSorts.insertionSort(testArr);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(testArr));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);

            System.out.println("----MostlySortedTestSelection--ints--");
            System.out.println("Before: ");
            System.out.println(InPlaceSorts.printIntArr(testArr2));

            time= System.nanoTime();
            InPlaceSorts.selectionSort(testArr2);

            System.out.println("After: ");
            System.out.println(InPlaceSorts.printIntArr(testArr2));

            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);
            System.out.println("------MultiArrayInsertion---------");
            System.out.println("Before:");
            time=System.nanoTime();
            System.out.println(InPlaceSorts.printMultiArr(Multi));
            System.out.print(InPlaceSorts.printIntArr(MakeittoOne));
            InPlaceSorts.insertionSort(MakeittoOne);
            System.out.println("After:");
            System.out.println(InPlaceSorts.printIntArr(MakeittoOne));
            System.out.println(InPlaceSorts.FindMedian(MakeittoOne));
            time=System.nanoTime()-time;
            System.out.println("Time take: "+ time);
            */
        }
    }
