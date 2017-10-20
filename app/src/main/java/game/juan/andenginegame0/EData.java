package game.juan.andenginegame0;

/**
 * Created by juan on 2017. 10. 10..
 */

public class EData {
    public static final int TYPE_PLAYER = 0;
    public static final int TYPE_GERM = 1;
    public static final int TYPE_OBS = 2;
    int type;
    boolean should_remove = false;
    public EData(int type){
        this.type = type;
    }
    public int getType(){return type;}
    public void setShould_remove(){
        this.should_remove = true;
    }
    public boolean isShouldRemove(){
        return should_remove;
    }
}
