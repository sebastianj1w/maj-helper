package enums;

public enum ShuPaiTypeEnum{
    YI("一", 1),
    ER("二", 2),
    SAN("三", 3),
    SI("四", 4),
    WU("五", 5),
    LIU("六", 6),
    QI("七", 7),
    BA("八", 8),
    JIU("九", 9);

    private String desc;
    private Integer code;

    ShuPaiTypeEnum(String desc, Integer code) {
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
