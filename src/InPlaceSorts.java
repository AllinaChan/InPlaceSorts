public class InPlaceSorts {

    public static int[] swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted= InPlaceSorts.sorted(arr);
        int lastSwap = arr.length;
        int lastSwapTemp=0;
        while(sorted==false)
        {
            for(int i=0; i<lastSwap; i++)
            {
                if(i+1!=arr.length) {
                    if (arr[i] > arr[i + 1]) {
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
        int currentPos=0;
        for(int j=0; j<arr.length; j++)
        {
            int min=0;
            for(int i= currentPos; i <arr.length; i++)
            {
                if(arr[i]<arr[min])
                {
                    min=i;
                }
            }
            swap(arr, currentPos, min);
            currentPos++;
        }
        return arr;
    }

    public static boolean sorted(int[] arr)
    {
        boolean result=true;
        for(int i =0; i <arr.length; i++)
        {
            if(i+1!=arr.length) {
                if (arr[i] > arr[i + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean checkSum(int[] before, int [] after)
    {
        int sum=0;
        int sum2=0;
        for(int num: before)
        {
            sum+=num;
        }
        for(int num: after)
        {
            sum2+=num;
        }
        return sum==sum2;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (int)(Math.random()*10000);
        }
        return arr;
    }

    public static String printArr(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

}
