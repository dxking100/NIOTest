package com.channel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.*;

/**
 *
 *
 * @author Victor
 * @version 1.0
 * @date 2022-10-06/10/2022 2:15 PM
 */
public class FileChannelTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        RandomAccessFile fileA = new RandomAccessFile("/Users/zhihuali/Desktop/FDCTBB05420210515000000tuPRLDN(1).tudf","rw");
        FileChannel fileChannel = fileA.getChannel();
        System.out.println("ok");
        fileChannel.lock();
        Thread.sleep(10000000);
    }
}

class FileChannelTest1{
    public static void main(String[] args) throws IOException, InterruptedException {
        ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1,2,3,4});
        RandomAccessFile fileA = new RandomAccessFile("/Users/zhihuali/Desktop/FDCTBB05420210515000000tuPRLDN(1).tudf","rw");
        FileChannel fileChannel = fileA.getChannel();
        fileChannel.write(buffer);
        fileChannel.lock();
        System.out.println("xxxxx");
    }
}
