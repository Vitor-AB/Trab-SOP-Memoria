import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // TESTES FIFO
    @Test
    @DisplayName("FIFO Test 1")
    void  FIFOarraytest1() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f1);
        test.add(f2);
        test.add(f3);
        test.add(f4);
        test.add(f5);
        test.add(f6);
        test.add(f7);
        test.add(f8);
        test.add(f3);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f7);
        memoria.add(f8);
        memoria.add(f3);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.FIFO(test,4));
    }
    @Test
    @DisplayName("FIFO Test 2")
    void  FIFOarraytest2() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f2);
        test.add(f6);
        test.add(f4);
        test.add(f8);
        test.add(f3);
        test.add(f7);
        test.add(f1);
        test.add(f5);
        test.add(f6);
        test.add(f8);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f7);
        memoria.add(f1);
        memoria.add(f5);
        memoria.add(f6);
        memoria.add(f8);
        System.out.println(memoria);
        assertEquals(memoria, Main.FIFO(test,5));
    }
    @Test
    @DisplayName("FIFO Test 3")
    void  FIFOarraytest3() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f3);
        test.add(f1);
        test.add(f1);
        test.add(f6);
        test.add(f8);
        test.add(f7);
        test.add(f8);
        test.add(f2);
        test.add(f2);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f1);
        memoria.add(f6);
        memoria.add(f8);
        memoria.add(f7);
        memoria.add(f2);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.FIFO(test,6));
    }

    // TESTES LFU
    @Test
    @DisplayName("LFU Test 1")
    void  LFUarraytest1() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f1);
        test.add(f2);
        test.add(f3);
        test.add(f4);
        test.add(f5);
        test.add(f6);
        test.add(f7);
        test.add(f8);
        test.add(f3);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f5);
        memoria.add(f6);
        memoria.add(f7);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.LFU(test,4));
    }
    @Test
    @DisplayName("LFU Test 2")
    void  LFUarraytest2() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f2);
        test.add(f6);
        test.add(f4);
        test.add(f8);
        test.add(f3);
        test.add(f7);
        test.add(f1);
        test.add(f5);
        test.add(f6);
        test.add(f8);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f6);
        memoria.add(f8);
        memoria.add(f7);
        memoria.add(f1);
        memoria.add(f5);
        System.out.println(memoria);
        assertEquals(memoria, Main.LFU(test,5));
    }
    @Test
    @DisplayName("LFU Test 3")
    void  LFUarraytest3() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f3);
        test.add(f1);
        test.add(f1);
        test.add(f6);
        test.add(f8);
        test.add(f7);
        test.add(f8);
        test.add(f2);
        test.add(f2);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f3);
        memoria.add(f1);
        memoria.add(f6);
        memoria.add(f8);
        memoria.add(f7);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.LFU(test,6));
    }

    // TESTES LRU
    @Test
    @DisplayName("LRU Test 1")
    void  LRUarraytest1() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f1);
        test.add(f2);
        test.add(f3);
        test.add(f4);
        test.add(f5);
        test.add(f6);
        test.add(f7);
        test.add(f8);
        test.add(f3);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f7);
        memoria.add(f8);
        memoria.add(f3);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.LRU(test,4));
    }
    @Test
    @DisplayName("LRU Test 2")
    void  LRUarraytest2() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f2);
        test.add(f6);
        test.add(f4);
        test.add(f8);
        test.add(f3);
        test.add(f7);
        test.add(f1);
        test.add(f5);
        test.add(f6);
        test.add(f8);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f7);
        memoria.add(f1);
        memoria.add(f5);
        memoria.add(f6);
        memoria.add(f8);
        System.out.println(memoria);
        assertEquals(memoria, Main.LRU(test,5));
    }
    @Test
    @DisplayName("LRU Test 3")
    void  LRUarraytest3() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f3);
        test.add(f1);
        test.add(f1);
        test.add(f6);
        test.add(f8);
        test.add(f7);
        test.add(f8);
        test.add(f2);
        test.add(f2);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f1);
        memoria.add(f6);
        memoria.add(f8);
        memoria.add(f7);
        memoria.add(f2);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.LRU(test,6));
    }

    // TESTES NRU
    @Test
    @DisplayName("NRU Test 1")
    void  NRUarraytest1() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f1);
        test.add(f2);
        test.add(f3);
        test.add(f4);
        test.add(f5);
        test.add(f6);
        test.add(f7);
        test.add(f8);
        test.add(f3);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f2);
        memoria.add(f3);
        memoria.add(f6);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.NRU(test,4));
    }
    @Test
    @DisplayName("NRU Test 2")
    void  NRUarraytest2() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f2);
        test.add(f6);
        test.add(f4);
        test.add(f8);
        test.add(f3);
        test.add(f7);
        test.add(f1);
        test.add(f5);
        test.add(f6);
        test.add(f8);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f2);
        memoria.add(f6);
        memoria.add(f3);
        memoria.add(f7);
        memoria.add(f8);
        System.out.println(memoria);
        assertEquals(memoria, Main.NRU(test,5));
    }
    @Test
    @DisplayName("NRU Test 3")
    void  NRUarraytest3() {
        ArrayList<FrameM> test = new ArrayList<>();
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        test.add(f3);
        test.add(f1);
        test.add(f1);
        test.add(f6);
        test.add(f8);
        test.add(f7);
        test.add(f8);
        test.add(f2);
        test.add(f2);
        test.add(f4);

        ArrayList<FrameM> memoria = new ArrayList<>();
        memoria.add(f3);
        memoria.add(f6);
        memoria.add(f8);
        memoria.add(f7);
        memoria.add(f2);
        memoria.add(f4);
        System.out.println(memoria);
        assertEquals(memoria, Main.NRU(test,6));
    }
}