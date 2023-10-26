import java.util.*;
public class countElement {


//Input array
public static int[][] inputArray(){
    int input[][]=new int[3][3];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i < 3; i++){
        for(int j=0; j < 3; j++){
            System.out.println("Enter the element: row"+(i+1)+"cols: "+(j+1));
            input[i][j]=sc.nextInt();
        }
    }
    
    return input;
}

//Display array
    public static void DisplayArray(int arr[][]){

    for(int i=0; i < 3; i++){
        for(int j=0; j < 3; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }  
}

public static int count_element(int element,int arr[][]){
    int count=0;
    for(int i=0; i < 3; i++){
        for(int j=0; j < 3; j++){
           if(arr[i][j]==element){
            count++;
           }
        }
        System.out.println();
    }  
    return count;
}

public static void main(String args[]){
    
    int arr[][]=inputArray();
    DisplayArray(arr);
    System.out.println((count_element(3, arr)));

}


}
