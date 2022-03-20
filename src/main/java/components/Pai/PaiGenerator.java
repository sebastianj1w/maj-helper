package components.Pai;

import enums.PaiTypeEnum;

public class PaiGenerator {

    /**
     * 创建牌
     * @param type
     * @return
     */
    public Pai createPai(PaiTypeEnum type)
    {
        Pai pai = null;

        if(type.getCode() <= 2)
        {
            pai = new ShuPai();
            pai.setType(type);
        }
        else
        {
            pai = new ZiPai();
            pai.setType(type);
        }

        return pai;
    }
}
