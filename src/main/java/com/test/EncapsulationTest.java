package com.test;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * @author Victor
 * @version 1.0
 * @date 2022-10-05/10/2022 9:01 AM
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        /**
         * 直接緩存區 vs 間接緩衝區
         */

//        int size = 1900000000;
//        long beginTime = System.currentTimeMillis();
//        ByteBuffer buffer = ByteBuffer.allocateDirect(size); //間接緩衝區
////        ByteBuffer buffer = ByteBuffer.allocate(size); //直接緩衝區
//        for (int i = 0; i < size; i++) {
//            buffer.put((byte) 123);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - beginTime);

        /**
         * wrap預設的內容值
         */
//        byte[] bytes = new byte[]{1,2,3,4,5,6,7,8};
//        ByteBuffer buffer = ByteBuffer.wrap(bytes);
//        ByteBuffer buffer1 = ByteBuffer.wrap(bytes,2,4); //offset設置position初始位, limit爲 offset+length
//        System.out.println(buffer.capacity()+","+buffer.limit()+","+buffer.position());
//        System.out.println(buffer1.capacity()+","+buffer1.limit()+","+buffer1.position());

        /**
         * put,get 會遞增position
         */
//        byte[] bytes = new byte[]{1,2,3,4,5,6,7,8};
//        ByteBuffer buffer = ByteBuffer.wrap(bytes);
//        System.out.println("defaultPosition:"+buffer.position());
//        System.out.println("defaultCapacity:"+buffer.capacity());
//        System.out.println("defaultLimit:"+buffer.limit());
//        if(buffer.hasRemaining()){
//            System.out.println("value:"+buffer.get());
//            System.out.println("currentPosition:"+buffer.position());
//            buffer.put((byte)1);
//            System.out.println("currentPosition:"+buffer.position());
//            System.out.println("currentCapacity:"+buffer.capacity());
//            System.out.println("currentLimit:"+buffer.limit());
//        }
        /**
         * 1.把特定的數組長度送到特定的數組位置中
         * 2.取得buffer的特定值
         * bufferoverflowexception
         * bufferunderflowexception
         * indexoutof
         */
//        byte[] bytes = new byte[]{1,2,3,4,5,6,7};
//        byte[] bytes1 = new byte[]{66,77,88};
//        //--------傳值------
//        ByteBuffer buffer = ByteBuffer.wrap(bytes);
//        //在bytes下的n位置，
//        int n = 2;
//        buffer.position(n);
//        //取得bytes1數組的第n位，獲取length個。。並塞到buffer中。
//        buffer.put(bytes1,0,1);
//        System.out.println(buffer);
//        //--------取值------
//        buffer.position(2);
//        byte[] bytesOut = new byte[buffer.capacity()];
//        buffer.get(bytesOut,0,2); //這里的offset與length是控制放值的位置，真正取值開始位置依舊是buffer
//        System.out.println("結束");

        /**
         * put,get 使用src
         */
//        byte[] bytes = new byte[]{3,4,5,6,7,8};
//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        buffer.put((byte) 1);
//        buffer.put((byte)2);
//        //bytes 的所有數據放到buffer中
//        buffer.put(bytes);//由Position時放入去的
//
//        //在buffer中取得n長度的值
//        int n=3;
//        byte[] getBytes = new byte[n];
//        buffer.rewind();
//        buffer.get(getBytes);//由position位置開始，在buffer中取得值
//        System.out.println("完成");

        /**
         * put,get 使用index 在絕對位置取/設值，沒什麼特別，不寫例子。
         */

        /**
         * 在buffer中，可以插入基本類型。
         */
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putChar('h');
        System.out.println(byteBuffer);




    }
}
