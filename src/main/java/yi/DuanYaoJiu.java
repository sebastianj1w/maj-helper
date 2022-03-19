package yi;

import components.*;

import java.util.List;

public class DuanYaoJiu extends Yi {
    @Override
    public boolean check(List<Combination> listeningCombinations, List<Tile> tiles) {
        for (Combination combination :
                listeningCombinations) {
            for (Mianzi mianzi : combination.getMianziList()) {
                if (mianzi.getTileList() == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
