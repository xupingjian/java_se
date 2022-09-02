package com.it25;

import java.util.Scanner;

public class RoomTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();


        //欢迎
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请输入对应的功能编号：[1]表示查看房间列表.[2]表示订房.[3]表示退房.[0]表示退出");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入功能编号:");
            int i = s.nextInt();

            if (i == 1) {
                hotel.print();
            } else if (i == 2) {
                System.out.println("请输入房间号");
                int i1 = s.nextInt();
                hotel.order(i1);
            } else if (i == 3) {
                System.out.println("请输入退房编号");
                int i2 = s.nextInt();
                hotel.exit(i2);
            } else if (i == 0) {
                System.out.println("再见，欢迎下次见");
                return;
            } else {
                System.out.println("系统出错");

            }
          /*  switch (i){
                case '1':
                    hotel.print();
                break;
                default:
                    break;

            }*/
        }
    }
}

