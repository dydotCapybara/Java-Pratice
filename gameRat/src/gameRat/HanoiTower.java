package gameRat;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        // 创建一个 Scanner 对象来获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入盘子的数量
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        // 调用 solveHanoi 方法解决汉诺塔问题
        solveHanoi(n, 'A', 'B', 'C');
    }

    // 递归解决汉诺塔问题的方法
    public static void solveHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            // 基础条件：如果只有一个盘子，直接从源杆移动到目标杆
            System.out.println("Move disk 1 from " + source + " to " + target);
        } else {
            // 将前 n-1 个盘子从源杆移动到辅助杆
            solveHanoi(n - 1, source, target, auxiliary);
            // 将第 n 个盘子从源杆移动到目标杆
            System.out.println("Move disk " + n + " from " + source + " to " + target);
            // 将前 n-1 个盘子从辅助杆移动到目标杆
            solveHanoi(n - 1, auxiliary, source, target);
        }
    }
}
