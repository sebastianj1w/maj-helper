package components.Pai;

import enums.PaiTypeEnum;

public class Pai {
    private PaiTypeEnum type;

    public PaiTypeEnum getType() {
        return type;
    }

    public void setType(PaiTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "type=" + type;
    }
}
