import java.util.ArrayList;

public class Main {
    //----------------------------------------------------------------------
    // FIFO - First-in First-out
    // SUB FIFO
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
    
    // FIFO - First-in First-out
    public static ArrayList<FrameM> FIFO(ArrayList<FrameM> frames, int limPag){
        System.out.println("FIFO");
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
            System.out.println("Memoria: " +memoria);
        }
        aux += 1;
        return memoria;
    }

    //----------------------------------------------------------------------
    // LFU - Least-Frequently-Used
    // SUB LFU
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
    
    // LFU - Least-Frequently-Used
    public static ArrayList<FrameM> LFU(ArrayList<FrameM> frames, int limPag){
        System.out.println("LFU");
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
    // SUB LRU
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
    
    // LRU - Least-Recently-Used
    public static ArrayList<FrameM> LRU(ArrayList<FrameM> frames, int limPag){
        System.out.println("LRU");
        ArrayList<FrameM> memoria = new ArrayList<>();
        int aux = 1;
        for (FrameM i: frames) {
            i.setTempo_UltRef(aux);
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
                int id = FindsubLRU(memoria);
                for (int j = 0; j < memoria.size(); j++) {
                    if (memoria.get(j).getID() == id && !namemo){
                        memoria.remove(j);
                        memoria.add(i);
                        break;
                    }
                }
            }
            aux += 1;


            System.out.println("Memoria: " +memoria);
        }

        return memoria;
    }

    //----------------------------------------------------------------------
    // NRU - Not-Recently-Used
    // SUB NRU
    public static int FindsubNRU(ArrayList<FrameM> memoria){
        int ID = 0;
        boolean b0b0 = false;
        boolean b0b1 = false;
        for(FrameM i: memoria){
            if (i.getBR() == 0 && i.getBM() == 0){
                ID = i.getID();
                b0b0 = true;
            }
            if (i.getBR() == 0 && i.getBM() == 1 && !b0b0){
                ID = i.getID();
                b0b1 = true;
            }
            if(!b0b0 && !b0b1){ 
                ID = i.getID();
            }
        }
        return ID;
    }
    
    // NRU - Not-Recently-Used
    public static ArrayList<FrameM> NRU(ArrayList<FrameM> frames, int limPag){
        System.out.println("NRU");
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
                int id = FindsubNRU(memoria);
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
    

    public static void main(String[] args) {
        ArrayList<FrameM> frames = new ArrayList<>();
        int limPag = 4;
        FrameM f1 = new FrameM(1,13,0,0);
        FrameM f2 = new FrameM(2,1,1,1);
        FrameM f3 = new FrameM(3,2,1,0);
        FrameM f4 = new FrameM(4,11,0,1);
        FrameM f5 = new FrameM(5,21,0,0);
        FrameM f6 = new FrameM(6,26,1,1);
        FrameM f7 = new FrameM(7,16,1,0);
        FrameM f8 = new FrameM(8,12,0,1);
        frames.add(f2);
        frames.add(f6);
        frames.add(f4);
        frames.add(f8);
        frames.add(f3);
        frames.add(f7);
        frames.add(f1);
        frames.add(f5);
        frames.add(f6);
        frames.add(f8);
        System.out.println("Frames: " + frames);

        FIFO(frames,4);
        LFU(frames,5);
        LRU(frames,6);
        NRU(frames,6);
    }
}
