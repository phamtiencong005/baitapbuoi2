import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //Khai báo hai biến số nguyên a, b và nhập giá trị cho a, b từ bàn phím
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();
        //sử dụng ha abs() để trả về giá trị tuyệt đối (phần dương) của a,b
        a = Math.abs(a);
        b = Math.abs(b);
        //ktra a,b có bằng 0 hay không
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        /*Tìm ước số chung lớn nhất của a, b
        Sử dụng vòng lặp kiểm tra trong khi a khác b thì
        Nếu a < b: a = a – b
        Còn lại b = b – a
        Mã nguồn như sau
         */

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        //Kết thúc vòng lặp. In ra ước số chung lớn nhất của a, b là a
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
