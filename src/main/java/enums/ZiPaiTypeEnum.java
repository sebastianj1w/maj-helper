package enums;

public enum ZiPaiTypeEnum{
    DONG("东", 0),
    NAN("南", 1),
    XI("西", 2),
    BEI("北", 3),
    BAI("白", 4),
    FA("发", 5),
    ZHONG("中", 6);

    private String desc;
    private Integer code;

    ZiPaiTypeEnum(String desc, Integer code) {
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
