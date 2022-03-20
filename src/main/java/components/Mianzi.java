package components;

import components.Pai.Pai;
import enums.MianziTypeEnum;

public class Mianzi {
    private MianziTypeEnum type;
    private Pai[] tileList = new Pai[3];
    private Boolean listen;
    private Integer listen_idx;

    public MianziTypeEnum getType() {
        return type;
    }

    public Pai[] getTileList() {
        return tileList;
    }

    public void setTiles(Pai[] tileList) {
        this.tileList = tileList;
    }

    public Boolean getListen() {
        return listen;
    }

    public void setListen(Boolean listen) {
        this.listen = listen;
    }

    public Integer getListen_idx() {
        return listen_idx;
    }

    public void setListen_idx(Integer listen_idx) {
        this.listen_idx = listen_idx;
    }
}
