package components.Pai;

import components.Pai.Pai;
import enums.ZiPaiTypeEnum;

public class ZiPai extends Pai {
    private ZiPaiTypeEnum nameType;

    public ZiPaiTypeEnum getName() {
        return nameType;
    }

    public void setName(ZiPaiTypeEnum nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "[" + nameType.getDesc() + "]";
    }
}



