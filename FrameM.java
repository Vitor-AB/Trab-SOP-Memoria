public class FrameM {

    private int ID;
    private int tempCarga;
    private int quanRef;
    private int tempo_UltRef;
    private int BR;
    private int BM;

    public FrameM(int ID, int quanRef, int BR, int BM) {
        this.ID = ID;
        this.quanRef = quanRef;
        this.BR = BR;
        this.BM = BM;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTempCarga() {
        return tempCarga;
    }

    public void setTempCarga(int tempCarga) {
        this.tempCarga = tempCarga;
    }

    public int getQuanRef() {
        return quanRef;
    }

    public void setQuanRef(int quanRef) {
        this.quanRef = quanRef;
    }

    public int getTempo_UltRef() {
        return tempo_UltRef;
    }

    public void setTempo_UltRef(int tempo_UltRef) {
        this.tempo_UltRef = tempo_UltRef;
    }

    public int getBR() {
        return BR;
    }

    public void setBR(int BR) {
        this.BR = BR;
    }

    public int getBM() {
        return BM;
    }

    public void setBM(int BM) {
        this.BM = BM;
    }

    @Override
    public String toString(){
        return ID + "";
    }
}
