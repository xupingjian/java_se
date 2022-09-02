package com.it22pm;
/*一维数组扩容
* 先建一个大数组，吧小容量的数组拷贝到小容量里*/
public class test2 {
    public static void main(String[] args) {
        //拷贝源
        int[] src = {1,11,22,3,4};

        //拷贝目标
        int[] dest = new int[20];

        System.arraycopy(src,1,dest,3,3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);

        }

    }


}
