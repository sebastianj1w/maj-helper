package enums;

public enum PaiTypeEnum{
    WAN("万", PaiType.SHUPAI, 0),
    TONG("筒", PaiType.SHUPAI,1),
    SUO("条", PaiType.SHUPAI,2),
    FENG("风牌", PaiType.ZIPAI, 3),
    SANYUAN("三元牌", PaiType.ZIPAI, 4);

    private String desc;
    private PaiType tileType;
    private Integer code;

    PaiTypeEnum(String desc, PaiType tileType, Integer code) {
        this.desc = desc;
        this.tileType = tileType;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PaiType getTileType() {
        return tileType;
    }

    public void setTileType(PaiType tileType) {
        this.tileType = tileType;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}

enum PaiType{
    SHUPAI("数牌", 0),
    ZIPAI("字牌", 1);

    private String desc;
    private Integer code;

    PaiType(String desc, Integer code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}




