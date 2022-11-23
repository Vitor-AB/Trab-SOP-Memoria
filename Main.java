import algSubstituicao.FIFO;

import java.util.ArrayList;

public class Main {
    //----------------------------------------------------------------------
    // FIFO - First-in First-out
    public static int FindsubFIFO(ArrayList<FrameM> memoria){
        int minNum = memoria.get(0).getTempCarga();
        for (FrameM i: memoria) {
            if(i.getTempCarga() < minNum){
                minNum = i.getTempCarga();
            }
        }
        int ID = 0;
        for (FrameM i: memoria) {
            if(minNum == i.getTempCarga()){
                ID = i.getID();
                break;
            }
        }

        return ID;
    }
    public static ArrayList<FrameM> FIFO(ArrayList<FrameM> frames, int limPag){
        ArrayList<FrameM> memoria = new ArrayList<>();
        int aux = 1;
        for (FrameM i: frames){
            i.setTempCarga(aux);
            boolean namemo = false;
            if(memoria.size() != 0){
                for (FrameM k: memoria) {
                    if (i == k) {
                        namemo = true;
                        break;
                    }
                }
            }
            if (memoria.size() != limPag && !namemo) {
                memoria.add(i);

            }else{
                int sub = FindsubFIFO(memoria);
                for (int j = 0; j < memoria.size(); j++){
                    if(memoria.get(j).getID() == sub && !namemo){
                        memoria.remove(j);
                        memoria.add(i);
                        break;
                    }
                }
            }
        }
        aux += 1;
        System.out.println("Memoria: " +memoria);
        return memoria;
    }

    //----------------------------------------------------------------------
    // LFU - Least-Frequently-Used
    public static int FindsubLFU(ArrayList<FrameM> memoria){
        int minNum = memoria.get(0).getQuanRef();
        for (FrameM i: memoria) {
            if(i.getQuanRef() < minNum){
                minNum = i.getQuanRef();
            }
        }
        int ID = 0;
        for (FrameM i: memoria) {
            if(minNum == i.getQuanRef()){
                ID = i.getID();
                break;
            }
        }
        return ID;
    }
    public static ArrayList<FrameM> LFU(ArrayList<FrameM> frames, int limPag){
        ArrayList<FrameM> memoria = new ArrayList<>();
        for (FrameM i: frames) {
            boolean namemo = false;
            if(memoria.size() != 0){
                for (FrameM k: memoria) {
                    if (i == k) {
                        namemo = true;
                        break;
                    }
                }
            }
            if (memoria.size() != limPag && !namemo) {
                memoria.add(i);
            }else {
                int id = FindsubLFU(memoria);
                for (int j = 0; j < memoria.size(); j++) {
                    if (memoria.get(j).getID() == id && !namemo){
                        memoria.remove(j);
                        memoria.add(i);
                        break;
                    }
                }
            }
            System.out.println("Memoria: " +memoria);
        }

        return memoria;
    }

    //----------------------------------------------------------------------
    // LRU - Least-Recently-Used
    public static int FindsubLRU(ArrayList<FrameM> memoria){
        int minNum = memoria.get(0).getTempo_UltRef();
        for (FrameM i: memoria) {
            if(i.getTempo_UltRef() < minNum){
                minNum = i.getTempo_UltRef();
            }
        }
        int ID = 0;
        for (FrameM i: memoria) {
            if(minNum == i.getTempo_UltRef()){
                ID = i.getID();
                break;
            }
        }
        return ID;
    }
    public static ArrayList<FrameM> LRU(ArrayList<FrameM> frames, int limPag){
        ArrayList<FrameM> memoria = new ArrayList<>();
        int aux = 1;
        for (FrameM i: frames) {
            i.setTempo_UltRef(aux);
            boolean namemo = false;
            if(memoria.size() != 0){
                for (FrameM k: memoria) {
                    if (i == k) {
                        namemo = true;
                        i.setTempo_UltRef(aux + 1);
                        break;
                    }
                }
            }
            if (memoria.size() != limPag && !namemo) {
                memoria.add(i);
            }else {
                int id = FindsubLRU(memoria);
                for (int j = 0; j < memoria.size(); j++) {
                    if (memoria.get(j).getID() == id && !namemo){
                        memoria.remove(j);
                        memoria.add(i);
                        break;
                    }
                }
            }
            if (aux + 1 == i.getTempo_UltRef()){
                aux += 2;
            } else {
                aux += 1;
            }

            System.out.println("Memoria: " +memoria);
        }

        return memoria;
    }

    public static void main(String[] args) {
        ArrayList<FrameM> frames = new ArrayList<>();
        int limPag = 4;
        FrameM f1 = new FrameM(1,10,0,0,0);
        FrameM f2 = new FrameM(2,1,0,1,1);
        FrameM f3 = new FrameM(3,2,0,1,0);
        FrameM f4 = new FrameM(4,11,0,0,1);
        FrameM f5 = new FrameM(5,21,0,0,0);
        FrameM f6 = new FrameM(6,26,0,1,1);
        FrameM f7 = new FrameM(7,15,0,1,0);
        FrameM f8 = new FrameM(8,12,0,0,1);
        frames.add(f3);
        frames.add(f1);
        frames.add(f1);
        frames.add(f6);
        frames.add(f8);
        frames.add(f7);
        frames.add(f8);
        frames.add(f2);
        frames.add(f2);
        frames.add(f4);
        System.out.println("Frames: " + frames);

        //FIFO(frames,4);
        //LFU(frames,6);
        LRU(frames,4);
    }
}
