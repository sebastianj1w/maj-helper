package components.Pai;

import components.Pai.Pai;
import enums.ShuPaiTypeEnum;

public class ShuPai extends Pai {
    private ShuPaiTypeEnum numberType;

    public ShuPaiTypeEnum getNumberType() {
        return numberType;
    }

    public void setNumberType(ShuPaiTypeEnum numberType) {
        this.numberType = numberType;
    }

    @Override
    public String toString() {
        return "[" + numberType.getCode() + this.getType().getDesc() + "]";
    }
}


