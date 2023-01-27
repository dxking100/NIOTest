package com.test;

import java.nio.ByteBuffer;

/**
 * @author Victor
 * @version 1.0
 * @date 2022-09-15/09/2022 6:19 PM
 */
public class io {
    public static void main(String[] args) {
        /**
         * 1.在java中，只有8大類型，它們都可以轉換爲array
         * 2.但是轉爲byte後，都只有本類型的基本方法
         */
        byte[] bytes = new byte[]{1,2,3,4,5,6};
        char[] chars = new char[]{'1','2','3'};
        System.out.println(bytes);
        System.out.println(chars);

        /**
         * 爲了擴展他的操作，如取得position,limit,mark等信息，都只能手動去控制
         */
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes); //創建緩衝區
        System.out.println("capacity:"+byteBuffer.capacity()); //容量，(不能修改)
        System.out.println("position:"+byteBuffer.position()); //讀寫位置
        System.out.println("limit:"+byteBuffer.limit()); //限制
        System.out.println("mark:"+byteBuffer.mark()); //標記
        System.out.println("remaining:"+byteBuffer.remaining()); //剩餘空間

        /**
         * s1:試讀取信息
         */
//        for (int i = 0; i < byteBuffer.capacity(); i++) {
//            System.out.println(byteBuffer.get()); //讀取內容，每次讀取時，position都會加1
//            System.out.println("position:"+byteBuffer.position()); //每次讀取後，position都會加1
//            System.out.println("remaining:"+byteBuffer.remaining()); //剩餘空間
//        }

        /**
         * s2:設置limit後再讀
         */
//        byteBuffer.limit(2); //設置後，它只能讀取position:1-2的數據，注：設置limit時，不能大於capacity
//        for (int i = 0; i < byteBuffer.capacity(); i++) {
//            System.out.println(byteBuffer.get()); //讀取內容，每次讀取時，position都會加1
//            System.out.println("position:"+byteBuffer.position()); //每次讀取後，position都會加1
//        }

        /**
         * s3:配置mark,在讀取結束後，下一次讀取會由它再次開始
         * 所以，mark與reset配合一起使用
         */
//        for (int i = 0; i < byteBuffer.capacity(); i++) {
//            System.out.println(byteBuffer.get()); //讀取內容，每次讀取時，position都會加1
//           // System.out.println("position:"+byteBuffer.position()); //每次讀取後，position都會加1
//            if(byteBuffer.position() == 4){
//                byteBuffer.mark(); //如果讀取到第4個位置時
//            }
//        }
//        byteBuffer.reset(); //還原position,如果有mark，那就position就由mark位置開始
//        System.out.println("下一個值："+byteBuffer.get());

        /**
         * s4:reset會由mark開始，但使用clear可以還原緩衝區的狀態
         * mark有值時，才能reset，不然會報錯。
         */
//        for (int i = 0; i < byteBuffer.capacity(); i++) {
//            System.out.println(byteBuffer.get()); //讀取內容，每次讀取時，position都會加1
//           // System.out.println("position:"+byteBuffer.position()); //每次讀取後，position都會加1
//            if(byteBuffer.position() == 4){
//                byteBuffer.mark(); //如果讀取到第4個位置時
//            }
//        }
//        byteBuffer.clear(); //還原position,如果有mark，也會還原
//        System.out.println("下一個值："+byteBuffer.get());
        /**
         * s5:緩衝區反轉：在s2中可以看到，當get超出了limit範圍時再取值時會報錯。
         * 而flip後，下一個值不再是position，而是由0開始。
         * 並且把position設置爲limit；
         */
//        System.out.println("---場景----");
//        System.out.println("limit:"+byteBuffer.limit()); //限制
//        for (int i = 0; i < byteBuffer.capacity(); i++) {
//            System.out.println(byteBuffer.get()); //讀取內容，每次讀取時，position都會加1
//            System.out.println("position:"+byteBuffer.position()); //每次讀取後，position都會加1
//            System.out.println("limit:"+byteBuffer.limit()); //限制
//            if(byteBuffer.position() == 4){
//                byteBuffer.flip(); //設置後，它只能讀取position:1-2的數據，注：設置limit時，不能大於capacity
//                System.out.println("limit:"+byteBuffer.limit()); //限制
//            }
//        }
        /**
         * s6:判斷緩衝區是否有可訪問的數組
         */
//        System.out.println("是否有可訪問的數組："+byteBuffer.hasArray());
//        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
//        System.out.println("是否有可訪問的數組："+buffer.hasArray()); //直接緩存是沒有jvm緩存數組的。
//
        /**
         * s7:判斷是否有空餘位置及空餘個數
         */
//        System.out.println("是否有空餘位置："+byteBuffer.hasRemaining());
//        System.out.println("是否有空餘個數："+byteBuffer.remaining()); //由於沒有進行操作讀/寫.所以結果便是原始長度。
        /**
         * s8:還原位置與mark,但不還原limit
         */
//        byteBuffer.limit(2); //設置後，它只能讀取position:1-2的數據，注：設置limit時，不能大於capacity
//        while(byteBuffer.hasRemaining()){
//            System.out.println(byteBuffer.get());
//        }
//        //byteBuffer.clear(); //如果使用clear，limit會還原
//        byteBuffer.rewind(); //不還原limit
//        while(byteBuffer.hasRemaining()){
//            System.out.println(byteBuffer.get());
//        }
        /**
         * s9:
         */


    }
}
