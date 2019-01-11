public class InPlaceSorts {

    public static String[] swap(String[] arr, int i, int j)
    {
        String temp=arr[i];
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

    public static String[] selectionSort(String[] arr)
    {
        int currentPos=0;
        for(int j=0; j<arr.length; j++)
        {
            int min=0;
            for(int i= currentPos; i <arr.length; i++)
            {
                if(arr[i].compareTo(arr[min])<0)
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