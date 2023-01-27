package com.test;

import java.nio.ByteBuffer;

/**
 * @author Victor
 * @version 1.0
 * @date 2022-10-05/10/2022 10:46 AM
 */
public class OtherTest {
    public static void main(String[] args) {
        /**
         * slice 用於分割position對象後，並copy到新對象中。
         */
//        byte[] bytes = new byte[]{1,2,3,4,5};
//        ByteBuffer buffer = ByteBuffer.wrap(bytes);
//        buffer.position(3);
//
//
//        ByteBuffer byteBuffer = buffer.slice(); //由把position位置後的數據copy到新對象中。
//        System.out.println(byteBuffer);
//        byteBuffer.position(0);
//        while (byteBuffer.hasRemaining()){
//            System.out.println(byteBuffer.get());
//        }

        /**
         * duplicate 用於拷貝整個對象
         */
//        byte[] bytes = new byte[]{1,2,3,4,5};
//        ByteBuffer buffer = ByteBuffer.wrap(bytes);
//        buffer.position(3);
//
//        ByteBuffer byteBuffer = buffer.duplicate(); //由把position位置後的數據copy到新對象中。
//        System.out.println(byteBuffer);
//        byteBuffer.position(0);
//        while (byteBuffer.hasRemaining()){
//            System.out.println(byteBuffer.get());
//        }

        /**
         * 擴展buffer,，只能從新地創建一個新對象，並把舊對象put進去。
         */

    }
}
