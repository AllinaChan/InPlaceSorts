public class InPlaceSorts {

    public static String[] swap(String[]arr, int i, int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static int binarySearch(String[] arr, int low, int high, String target, int arrayLength)
    {
        if(high >= low)
        {
            int mid = low + (high - low)/2;

            if( ( mid == 0 || target.compareTo(arr[mid-1])>0) && arr[mid].equals(target)) {
                return mid;
            }
            else if(target.compareTo(arr[mid])>0) {
                return binarySearch(arr, (mid + 1), high, target, arrayLength);
            }
            else {
                return binarySearch(arr, low, (mid - 1), target, arrayLength);
            }
        }
        return -1;
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
    public static int partition2(int[] arr, int low, int high)
    {

        int endNum=arr[high];
        int begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        int middle=arr[middleIndex];

        if(middle < begNum)
        {
            swap(arr,low, middleIndex);
        }
        if(endNum < begNum)
        {
            swap(arr, low, high);
        }
        if(middle<endNum)
        {
            swap(arr, middleIndex,high);
        }


        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            // If current element is smaller
            // than or equal to pivot
            if (arr[j] <= pivot)
            {
                i++; // increment index of
                // smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort2(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition3(arr, low, high);
            quickSort2(arr, low, pi-1);
            quickSort2(arr, pi+1, high);
        }
    }


    public static int partition3(int[] arr, int low, int high)
    {

        int endNum=arr[high];
        int begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        int middle=arr[middleIndex];

        if(middle < endNum)
        {
            swap(arr, high, middleIndex);
        }
        if(begNum < endNum)
        {
            swap(arr, low, high);
        }
        if(middle<begNum)
        {
            swap(arr, middleIndex,low);
        }


        int pivot = arr[low];


        int i = (low-1);
        int j= (high+1);

        while(true)
        {
            do {
            i++;
            }
           while(arr[i] < pivot);


           do{
               j--;
           }
           while(arr[j] >pivot);


           if(i>=j)
           {
               return j;
           }
           swap(arr, i,j);
        }
    }

    public static void quickSort3(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition3(arr, low, high);
            quickSort3(arr, low, pi);
            quickSort3(arr, pi+1, high);
        }
    }

    public static int stringPartition(String[] arr, int low, int high)
    {

        String endNum=arr[high];
        String begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        String middle=arr[middleIndex];

        if(middle.compareTo(endNum)<0)
        {
            swap(arr, high, middleIndex);
        }
        if(begNum.compareTo(endNum)<0)
        {
            swap(arr, low, high);
        }
        if(middle.compareTo(begNum)<0)
        {
            swap(arr, middleIndex,low);
        }

        String pivot = arr[low];


        int i = (low-1);
        int j= (high+1);

        while(true)
        {
            do {
                i++;
            }
            while(arr[i].compareTo(pivot)<0);


            do{
                j--;
            }
            while(arr[j].compareTo(pivot)>0);


            if(i>=j)
            {
                return j;
            }
            swap(arr, i,j);
        }
    }

    public static void quickSortString(String[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = stringPartition(arr, low, high);
            quickSortString(arr, low, pi);
            quickSortString(arr, pi+1, high);
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

    public static int[] selectionSort(int[] arr)
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

    public static void insertionSort(int[] arr, int left, int right)
    {
        for (int i = left + 1; i <= right; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (arr[j] > temp && j >= left)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }


    public static void merge(int[] arr, int l, int m, int r)
    {
        // original array is broken in two parts
        // left and right array
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int x = 0; x < len1; x++)
            left[x] = arr[l + x];
        for (int x = 0; x < len2; x++)
            right[x] = arr[m + 1 + x];

        int i = 0;
        int j = 0;
        int k = l;

        // after comparing, we merge those two array
        // in larger sub array
        while (i < len1 && j < len2)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left, if any
        while (i < len1)
        {
            arr[k] = left[i];
            k++;
            i++;
        }

        // copy remaining element of right, if any
        while (j < len2)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
    }



    // iterative Timsort function to sort the
    // array[0...n-1] (similar to merge sort)
    public static void timSort(int[] arr, int n)
    {
        int RUN=32;
        // Sort individual subarrays of size RUN
        for (int i = 0; i < n; i+=RUN) {
            insertionSort(arr, i, Math.min((i + 31), (n - 1)));
        }

        // start merging from size RUN (or 32). It will merge
        // to form size 64, then 128, 256 and so on ....
        for (int size = RUN; size < n; size = 2*size)
        {
            // pick starting point of left sub array. We
            // are going to merge arr[left..left+size-1]
            // and arr[left+size, left+2*size-1]
            // After every merge, we increase left by 2*size
            for (int left = 0; left < n; left += 2*size)
            {
                // find ending point of left sub array
                // mid+1 is starting point of right sub array
                int mid = left + size - 1;
                int right = Math.min((left + 2*size - 1), (n-1));

                // merge sub array arr[left.....mid] &
                // arr[mid+1....right]
                merge(arr, left, mid, right);
            }
        }
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

    public static int[] randMostSortIntArray(int count){
        int[] arr=new int[count];
        int i=0;
        while(i<arr.length){
            if(i<7500){
                arr[i]=i;
                i++;
            } else{
                arr[i]=(int)(Math.random()*10000);
                i++;
            }
        }
        return arr;
    }
    public static double[] randMostSortDoubleArray(int count ){
        double[] arr=new double[count];
        int i=0;
        while(i<arr.length){
            if(i<7500){
                arr[i]=i;
                i++;
            } else{
                arr[i]=(double)(Math.random()*10000);
                i++;
            }
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
    public static String printInt2Arr(int[][] arr)
    {
        String result="";

        for(int[] num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    public static String printMultiArr(int[][] arr){
        String result="";

        for(int[] num: arr)
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

    public static int[][] randMultiArray(int row, int column){
        int[][] arr= new int[row][column];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10000);
            }
        }
        return arr;
    }

    public static int[] MakeintoOne(int[][] arr){
        int [] medians= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            medians[i]=FindMedian(arr[i], arr.length);
        }
        return medians;
    }

    public static int FindMedian(int[] arr, int length){
            if(length%2==0){
                return (arr[length/2]+arr[(length/2)-1])/2;
            } else {
                return arr[arr.length/2];
            }
        }
    }




