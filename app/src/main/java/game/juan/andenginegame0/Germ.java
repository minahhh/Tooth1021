package game.juan.andenginegame0;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;

import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.extension.physics.box2d.PhysicsConnector;
import org.andengine.extension.physics.box2d.PhysicsFactory;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by juan on 2017. 10. 10..
 */

public class Germ extends Sprite {
    boolean alive = true;
    Body body;
    Player player;
    public Germ(float pX, float pY, ITextureRegion pTextureRegion, VertexBufferObjectManager pVertexBufferObjectManager) {
        super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
    }
    public void createUnit(PhysicsWorld physicsWorld, Scene scene){

        final FixtureDef FIX = PhysicsFactory.createFixtureDef(1.0F ,0.0F, 0.3F);
        FIX.filter.categoryBits = ConstantsSet.GERM_CATG_BITS;
        FIX.filter.maskBits = ConstantsSet.GERM_MASK_BITS;
        body = PhysicsFactory.createCircleBody(physicsWorld,
                getX()+getWidth()/2f,
                getY()+getHeight()/2f,
                getWidth()/2.5f,
                BodyDef.BodyType.DynamicBody,FIX);
        body.setUserData(new EData(EData.TYPE_GERM));
        scene.attachChild(this);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(this,body,true,true));
    }
    public void setPlayer(Player p){
        this.player = p;
    }
    public void setDie(){
        this.alive = false;
    }
    public boolean isAlive(){return alive;}
    public void update(){
        if(!alive)
            return;
        if(((EData)body.getUserData()).isShouldRemove()){
            body.setTransform(-100,-100,0);
            body.setLinearVelocity(0,0);
            alive = false;
        }
        if(Math.abs(body.getPosition().y - player.getBody().getPosition().y)<=15f){
            body.applyLinearImpulse(new Vector2(player.getBody().getPosition().x-body.getPosition().x
                    , player.getBody().getPosition().y - body.getPosition().y)
                    ,body.getWorldCenter());
        }
    }

    @Override
    protected void onManagedUpdate(float pSecondsElapsed) {
        super.onManagedUpdate(pSecondsElapsed);
        update();
    }
}
