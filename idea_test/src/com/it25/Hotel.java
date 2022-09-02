package com.it25;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        //行表示层，列表示每个房间
        rooms = new Room[3][10];//动态初始化
        //填值
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    //一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    //一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                } else if (i == 2) {
                    //一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
                }

            }

        }
    }
    public void print(){
        //打印酒店里的所有房间
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);

            }
            System.out.println();
        }
    }
    public void order(double id){
        //房间207（rooms[1][6]）
        Room room = rooms[((int)id / 100) - 1][(int)id % 100 - 1];
        room.setStatue(false);
        System.out.println(id+"房已定");
    }
    public void exit(double id){
        Room room = rooms[((int)id / 100) - 1][(int)id % 100 - 1];
        room.setStatue(true);
        System.out.println(id+"房已退定");
    }

}
