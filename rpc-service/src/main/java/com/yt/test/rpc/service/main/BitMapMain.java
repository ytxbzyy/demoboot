package com.yt.test.rpc.service.main;

import java.util.BitSet;

/**
 * Created by YT on 2019/1/4.
 */
public class BitMapMain {

    public static void main(String[] args) {
        int [] array = new int [] {1,2,3,22,0,3};
        BitSet bitSet  = new BitSet(6);
        //将数组内容组bitmap
        for(int i=0;i<array.length;i++)
        {
            bitSet.set(array[i], true);
        }
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(0));
        System.out.println(bitSet.toString());
    }
}
