public class InPlaceSorts {

    public static String[] swap(String[] arr, int i, int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static String[] bubbleSort(String[] arr)
    {
        boolean sorted= InPlaceSorts.sorted(arr);
        String lastSwap = arr.length;
        String lastSwapTemp=0;
        while(sorted==false)
        {
            for(String i=0; i<lastSwap; i++)
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

    public static String[] selectionSort(String[] arr)
    {
        int currentPos=0;
        for(String j=0; j<arr.length; j++)
        {
            String min=0;
            for(String i= currentPos; i <arr.length; i++)
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

    public static boolean sorted(String[] arr)
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

    /*public static String[] randStringArr(String count)
    {
        String[] arr = new String[count];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (String)(Math.random()*10000);
        }
        return arr;
    }
*/


    public static String printArr(String[] arr)
    {
        String result="";

        for(String num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

}
