import java.util.Scanner;

/**
 * 编写一个Java程序，要求用户输入三个整数，然后确定它们是否可以构成一个三角形。
 * 如果可以，进一步判断这个三角形是等边三角形、等腰三角形还是不等边三角形。
 * 使用三角形不等式定理判断这三个整数是否可以构成一个三角形。三角形不等式定理的内容是任意两边之和大于第三边。
 */
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side1:");
        int side1 = sc.nextInt();
        System.out.print("Enter the side2:");
        int side2 = sc.nextInt();
        System.out.print("Enter the side3:");
        int side3 = sc.nextInt();
        //把三边的值都输入进程序了
        if(side1 +side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1){
            System.out.println("无法构成一个三角形");
        }else{              //构成三角形了进行进一步的判断
            if(side1 == side2 && side2 == side3){
                System.out.println("该三角形是等边三角形");
            } else if (side1 !=side2 && side2 !=side3 && side1 !=side3) {
                System.out.println("该三角形是不等边三角形");
            }else {
                System.out.println("该三角形是等腰三角形");
            }
        }
    }
}
