import java.util.Scanner;

class Arrsum
{
    public static int[] input()
    {
        int in[]=new int[5];
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<in.length;i++)
        {
             System.out.println("Enter the element:"+i);
            in[i]=sc.nextInt();
        }
        return in;
    }

    public static int[] summation(int[] arr)
    {
        int i=0;
        for(;i<arr.length;++i)
        {
            if((i+1)==arr.length)
            {
                arr[i]=arr[i]+arr[i+1];
            }
        }
        return arr;
    }
    
    // public static int frequency(int[] arr,int element)
    // {
    //     int count=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(element==arr[i])
    //         {
    //             count++;
    //         }
    //     }
    //     return count;
    // }


    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr=input();
        display(arr);
        int[] a=summation(arr);
        display(a);
        // int b=frequency(arr, 3);
        // System.out.println(b);
    
    }
}