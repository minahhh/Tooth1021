package game.juan.andenginegame0;

/**
 * Created by juan on 2017. 10. 10..
 */

public interface ConstantsSet {
    int TRI_OBSTACLE = 0;
    int _OBSTACLE = 1;

    short OBS_CATG_BITS = 0x0001;
    short GERM_CATG_BITS = 0x0002;
    short PLAYER_CATG_BITS = 0x0004;

    short OBS_MASK_BITS = PLAYER_CATG_BITS;
    short GERM_MASK_BITS = PLAYER_CATG_BITS;
    short PLAYER_MASK_BITS = OBS_CATG_BITS|GERM_CATG_BITS;

}
