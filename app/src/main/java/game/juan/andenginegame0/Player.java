package game.juan.andenginegame0;

import android.util.Log;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;

import org.andengine.engine.Engine;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.extension.physics.box2d.PhysicsConnector;
import org.andengine.extension.physics.box2d.PhysicsFactory;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.Constants;


class Player extends Sprite {
    private Body body;

    public Player(float pX, float pY, ITextureRegion pTextureRegion, VertexBufferObjectManager pVertexBufferObjectManager) {
        super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
    }

    void createRectUnit(PhysicsWorld physicsWorld, Scene scene,
                               final float ratiox, final float ratioy){

        final FixtureDef FIX = PhysicsFactory.createFixtureDef(3.0F ,0.6F, 0.3F);
        FIX.filter.categoryBits = ConstantsSet.PLAYER_CATG_BITS;
        FIX.filter.maskBits = ConstantsSet.PLAYER_MASK_BITS;
        body = PhysicsFactory.createCircleBody(physicsWorld,
                getX() + (getWidth()*(1.0f-ratiox)/2.0f),
                getY() + (getHeight()*(1.0f-ratioy)),
                getWidth()/2.5f,
                BodyDef.BodyType.DynamicBody,FIX);
        body.setUserData(new EData(EData.TYPE_PLAYER));
        scene.attachChild(this);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(this,body,true,true));
    }
    Body getBody(){
        return this.body;
    }


}

