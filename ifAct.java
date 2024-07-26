import java.util.Scanner;

public class ifAct {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ Scanner เพื่อรับค่าจากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // รับค่าคะแนนจากผู้ใช้
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        // เปรียบเทียบคะแนนและแสดงผลลัพธ์
        if (score >= 60) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }

        // ปิด Scanner
        scanner.close();
    }
}
