package components;

import enums.MianziTypeEnum;

import java.util.List;

public class Mianzi {
    private MianziTypeEnum type;
    private Tile[] tileList = new Tile[3];
    private Boolean listen;
    private Integer listen_idx;

    public MianziTypeEnum getType() {
        return type;
    }

    public Tile[] getTileList() {
        return tileList;
    }

    public void setTiles(Tile[] tileList) {
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
