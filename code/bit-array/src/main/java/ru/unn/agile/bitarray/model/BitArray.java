package ru.unn.agile.bitarray.model;


public class BitArray {
    private byte[] raw_array;

    public BitArray(int count_bit) {
        int length_raw_array = -1;
        if (count_bit > 0)
            length_raw_array = getNumElem(count_bit);
        raw_array = new byte[length_raw_array];

        for (int i=0; i<raw_array.length; i++)  {
            raw_array[i] = 0;
        }
    }

    public byte[] getRawArray() {
        return raw_array;
    }
    
    private int getNumElem(int bit) {
        int num_raw_array = bit / 8;
        if (bit % 8 != 0) num_raw_array++;
        return num_raw_array;
    }

    public void setBit(int bit) {
        raw_array[getNumElem(bit) - 1] |= 1 << (bit % 8);
    }
}