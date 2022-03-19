package enums;

public enum MianziTypeEnum {
    KEZI("刻子", 0),
    SHUNZI("顺子",1);

    private String desc;
    private Integer code;

    MianziTypeEnum(String desc, Integer code) {
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
