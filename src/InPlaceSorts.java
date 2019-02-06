public class InPlaceSorts {

    public static String[] swap(String[]arr, int i, int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static int binarySearch(int[] arr, int target)
    {
        int min=0;
        int max=0;
        while(min<= max)
        {
            int middle= (min+max)/2;
            if(target> arr[middle])
            {
                min=middle+1;

             } else if(target< arr[middle])
               {
                   max=middle-1;
               }else
            {
                return middle;
            }
        }
        return -1;
    }

    public static double[] swap(double[] arr, int i, int j){
        double temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;

    }

    public static int[] swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num>0)
        {
            int i =0;
            String s="";
            while(i<length)
            {
                char c= (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void quickSort(int arr[], int low, int high)
    {


        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }


    public static String[] bubbleSort(String[] arr)
    {
        boolean sorted= InPlaceSorts.sorted(arr);
        int lastSwap = arr.length;
        int lastSwapTemp=0;

        while(sorted==false)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i+1!=arr.length) {
                    if (arr[i].compareTo(arr[i + 1])>0) {
                        InPlaceSorts.swap(arr, i, i + 1);
                    }
                }
                lastSwapTemp=i;
            }
            lastSwap=lastSwapTemp;
            sorted=InPlaceSorts.sorted(arr);
        }
        return arr;
    }

    public static double[] selectionSort(double[] arr)
    {
        int minPos;
        for(int curPos=0; curPos<arr.length-1; curPos++)
        {
            double minNum=arr[curPos];
            minPos=curPos;
            for(int i= curPos+1; i<arr.length; i++)
            {
                if(minNum>arr[i])
                {
                    minNum=arr[i];
                    minPos=i;
                }
            }
            swap(arr, curPos, minPos);
        }
        return arr;
    }

    public static void insertionSort(int[] arr)
    {
        int currentPos=1;
        for(int i=1; i<arr.length; i++)
        {
            for(int j=i; j>0; j--)
            {
                if (arr[j]<arr[j-1]) {
                    InPlaceSorts.swap(arr, j,j-1 );
                }else if(arr[j]>arr[j-1]){
                    break;
                }
            }
        }
    }




    public static boolean sorted(String[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length; i++)
        {
            if(i+1!=arr.length) {
                if (arr[i].compareTo(arr[i + 1])>0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /*public static boolean checkSum(String[] before, String [] after)
    {
        String sum=0;
        String sum2=0;
        for(String num: before)
        {
            sum+=num;
        }
        for(String num: after)
        {
            sum2+=num;
        }
        return sum==sum2;
    }
    */

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=(Math.random()*10000);
        }
        return arr;
    }



    public static String printStringArr(String[] arr)
    {
        String result="";

        for(String num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }
    public static String printDoubleArr(double[] arr)
    {
        String result="";

        for(double num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    public static String printIntArr(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }

    public static void mergeSort(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right,int[]temp){
        if(left<right){
            int mid=(left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }



}