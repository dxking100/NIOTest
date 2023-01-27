package com.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 字符緩衝區
 * @author Victor
 * @version 1.0
 * @date 2022-10-05/10/2022 2:17 PM
 */
public class CharBufferTest {
    /**
     * 1.默認的getBytes方法是"utf-8",由於在charbuffer.get打印的時候，只能用utf-16BE，不然打印就會亂碼。
     * 2.所有的byte to xxxas 都稱爲“轉換視圖”
     * @param args
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws IOException {
        /**
         * 把bytebuffer 轉爲 charbuffer
         */
////        byte[] charByte = "我是李志華".getBytes("utf-8");utf-16BE
//        byte[] charByte = "我是李志華".getBytes();
//        ByteBuffer buffer = ByteBuffer.wrap(charByte);
////        CharBuffer charBuffer = buffer.asCharBuffer();
//        CharBuffer charBuffer = Charset.forName("utf-8").decode(buffer);
//        while (charBuffer.hasRemaining()){
//            System.out.println(charBuffer.get());
//        }

        /**
         * buffer 轉換時，都是引用，所以需要克隆對象。
         */

        /**
         * bytebuffer vs 其它類型buffer
         */
//        IntBuffer buffer = IntBuffer.allocate(10);  //1.以值爲索引，插入值的position會遞增
//        buffer.put(111);
//        buffer.put(222);
//        System.out.println(buffer.get(1));
//        System.out.println(buffer.position());
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(10); //以字引爲索引值，插入值的position會以字節數遞增遞增
//        byteBuffer.put("123".getBytes(StandardCharsets.UTF_8));
//        byteBuffer.put("222".getBytes(StandardCharsets.UTF_8));
//
//        System.out.println(byteBuffer.get(1));
//        System.out.println(byteBuffer.position());

        /**
         * 控制讀取方式，高/低位讀
         * 只有byte才有所謂的高低位，其它int,double的order方法是不能設參數的
         */
//        int value = 123456;
//        ByteBuffer buffer = ByteBuffer.allocate(4);
//        System.out.println(buffer.order(ByteOrder.BIG_ENDIAN)); //高位開始讀
//       // System.out.println(buffer.order(ByteOrder.LITTLE_ENDIAN)); //低位開始讀
//        buffer.putInt(value); //把某個值轉爲buffer
//        for(byte a : buffer.array()){
//            System.out.println(a);
//        }

        /**
         * 創建只讀緩衝區,asReadOnlyBuffer()，就能設計
         */

        /**
         * 壓縮緩衝區 compact，暫時未知道有什麼用
         */
//        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1,2,3,4,5,6,7,8});
//        buffer.position(3);
//        buffer.compact(); //把position至limit里的值，從頭開始，拷貝到當前對象中。
//        buffer.clear();
//        System.out.println("ok");

        /**
         * buffer 的equal 已經做了迭代去對比數據
         */
//        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1,2,3,4,5,6,7,8});
//        ByteBuffer buffer1 = ByteBuffer.wrap(new byte[]{1,2,3,4,5,6,7,8});
//        System.out.println(buffer.equals(buffer1));

        /**
         * buffer 的equal 已經做了迭代去對比數據
         * 會對比position與limit，如果其中一個不一致都會報false
         */
//        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1,2,3,4,5,6,7,8});
//        ByteBuffer buffer1 = ByteBuffer.wrap(new byte[]{1,2,3,4,5,6,7,8});
//        System.out.println(buffer.compareTo(buffer1));

        /**
         * 重載，追加數據
         */
//        CharBuffer buffer = CharBuffer.allocate(5);
//        buffer.put('c');
//        buffer.put("aaa");
//        buffer.append('c');
//        buffer.rewind();
//        while (buffer.hasRemaining()) { //要配合position使用。
//            System.out.println(buffer.get());
//        }
//
//        buffer.rewind(); //讀char時，都會因爲position影響的。
//        //buffer.array() 讀取整個buffer的數組列表。
//        System.out.println(buffer.charAt(0));

        /**
         * buffer 讀取
         */
        //寫入某對象時，是否會影響他的Position
//        CharBuffer targetBuffer = CharBuffer.allocate(10);
//        CharBuffer buffer = CharBuffer.wrap(new char[]{'1','2','3','4'});
//        buffer.read(targetBuffer); //會跟隨
//        buffer.rewind();
//        buffer.charAt(1);
//        CharBuffer targetBuffer1 = buffer.subSequence(0,1);  //這個不影響Position,如charAt不一樣(charAt會影響位置)
//
//        System.out.println(buffer.position());
//
//        System.out.println(targetBuffer.position());

        /**
         * 轉換值
         */
        char[] chars = new char[]{'a','b','c','d'};
        CharBuffer buffer = CharBuffer.wrap(chars,0,2); //其實wrap，都是把char的值設進去，但實際上是用limit都限制它。而且是只讀的。
        buffer.rewind();
        buffer.put('c');
        buffer.rewind();
        while (buffer.hasRemaining()){
            System.out.println(buffer.get());
        }

    }
}
