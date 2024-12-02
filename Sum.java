import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    System.out.println("Indices: "+i+","+j);
                }
            }
        }

    }
}