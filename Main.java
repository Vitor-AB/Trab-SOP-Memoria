import algSubstituicao.FIFO;

import java.util.ArrayList;

public class Main {

    public static int FindSubFIFO(ArrayList<FrameM> memoria){
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
            }
        }

        return ID;
    }

    public static ArrayList<FrameM> FIFO(ArrayList<FrameM> frames, int limPag){
        ArrayList<FrameM> memoria = new ArrayList<>();
        int aux = 1;
        for (FrameM i: frames){
            i.setTempCarga(aux);

            if (memoria.size() != limPag) {
                memoria.add(i);
            }else{
                int sub = FindSubFIFO(memoria);
                for (int j = 0; j < memoria.size(); j++){
                    if(memoria.get(j).getID() == sub){
                        memoria.remove(j);
                        memoria.add(i);
                        break;
                    }
                }
            }
            aux += 1;
        }
        System.out.println(memoria);
        return memoria;
    }

    /*public static ArrayList<FrameM> LFR(ArrayList<FrameM> frames, int limPag){

    }*/

    public static void main(String[] args) {
        ArrayList<FrameM> frames = new ArrayList<>();
        int limPag = 4;
        FrameM f1 = new FrameM(1,10,15,0,0);
        FrameM f2 = new FrameM(2,1,20,1,1);
        FrameM f3 = new FrameM(3,2,12,1,0);
        FrameM f4 = new FrameM(4,11,21,0,1);
        FrameM f5 = new FrameM(5,21,10,0,0);
        FrameM f6 = new FrameM(6,26,52,1,1);
        FrameM f7 = new FrameM(7,15,36,1,0);
        FrameM f8 = new FrameM(8,12,18,0,1);
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
        System.out.println(frames);
        System.out.println(FIFO(frames,6));
    }
}
