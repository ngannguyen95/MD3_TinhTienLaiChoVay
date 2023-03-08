package rikkeiacademy;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month; //tháng
        double money; // tiền
        double interestRate; //lãi suất
        System.out.println("Nhập vào số tiền cần gửi : ");
        money = sc.nextDouble();
        System.out.println("Nhập vào số tháng gửi : ");
        month = sc.nextInt();
        System.out.println("Nhập vào lãi suất gửi : ");
        interestRate = sc.nextDouble();
        double total = 0;

        for (int i = 0; i < month; i++) {
            total = money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Số tiền lãi nhận được: "+total);

    }
}
