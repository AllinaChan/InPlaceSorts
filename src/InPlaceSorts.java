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




