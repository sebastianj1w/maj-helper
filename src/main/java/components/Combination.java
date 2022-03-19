package components;

import java.util.List;

public class Combination {
    private List<Mianzi> mianziList;
    private Quetou quetou;
    private boolean listen;
    private int listen_idx;

    public List<Mianzi> getMianziList() {
        return mianziList;
    }

    public void setMianziList(List<Mianzi> mianziList) {
        this.mianziList = mianziList;
    }

    public Quetou getQuetou() {
        return quetou;
    }

    public void setQuetou(Quetou quetou) {
        this.quetou = quetou;
    }

    public boolean isListen() {
        return listen;
    }

    public void setListen(boolean listen) {
        this.listen = listen;
    }

    public int getListen_idx() {
        return listen_idx;
    }

    public void setListen_idx(int listen_idx) {
        this.listen_idx = listen_idx;
    }
}
