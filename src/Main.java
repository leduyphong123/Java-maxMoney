import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] arr=new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap size");
        int size=input.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        int index=1;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i+1;
            }
        }
        System.out.println("max =" + max+" index= "+index);
    }
}