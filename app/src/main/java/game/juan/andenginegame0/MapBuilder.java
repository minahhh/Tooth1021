package game.juan.andenginegame0;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.badlogic.gdx.physics.box2d.joints.WeldJointDef;

import org.andengine.engine.Engine;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.extension.physics.box2d.PhysicsConnector;
import org.andengine.extension.physics.box2d.PhysicsFactory;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.ui.activity.BaseGameActivity;

import java.util.ArrayList;

class MapBuilder {

    //item1
    public static void create_item1_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion itemTextureRegion,
                                             float centerX, float centerY, float angle){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite item1 = new Sprite(centerX,centerY, itemTextureRegion, activity.getVertexBufferObjectManager());
        item1.setRotation(angle);
        final Body item1Body = PhysicsFactory.createBoxBody(physicsWorld, item1,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(item1, item1Body, true, true));
        scene.attachChild(item1);
    }

    //item2
    public static void create_item2_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion itemTextureRegion2,
                                             float centerX, float centerY, float angle){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite item2 = new Sprite(centerX,centerY, itemTextureRegion2, activity.getVertexBufferObjectManager());
        item2.setRotation(angle);
        final Body item2Body = PhysicsFactory.createBoxBody(physicsWorld, item2,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(item2, item2Body, true, true));
        scene.attachChild(item2);
    }

    //item3
    public static void create_item3_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion itemTextureRegion3,
                                             float centerX, float centerY){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite item3 = new Sprite(centerX,centerY, itemTextureRegion3, activity.getVertexBufferObjectManager());
        final Body item3Body = PhysicsFactory.createBoxBody(physicsWorld, item3,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(item3, item3Body, true, true));
        scene.attachChild(item3);
    }

    //slide
    public static void create_slide_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion slideTextureRegion,
                                             float centerX, float centerY, float angle){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite slide = new Sprite(centerX,centerY, slideTextureRegion, activity.getVertexBufferObjectManager());
        slide.setRotation(angle);
        final Body slideBody = PhysicsFactory.createBoxBody(physicsWorld, slide,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(slide, slideBody, true, true));
        scene.attachChild(slide);
    }

    //slow1
    public static void create_slow_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion slowTextureRegion1,
                                             float centerX, float centerY, float angle){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite slow1 = new Sprite(centerX,centerY, slowTextureRegion1, activity.getVertexBufferObjectManager());
        slow1.setRotation(angle);
        /*final Body slow1Body = PhysicsFactory.createBoxBody(physicsWorld, slow1,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(slow1, slow1Body, true, true));*/
        scene.attachChild(slow1);
    }

    //germ
    public static void create_germ_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                             BaseGameActivity activity,
                                             ITextureRegion germTextureRegion,
                                             float centerX, float centerY){

        final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(1f, 0.5f, 0.5f);

        final Sprite germ = new Sprite(centerX,centerY, germTextureRegion, activity.getVertexBufferObjectManager());
        final Body germBody = PhysicsFactory.createBoxBody(physicsWorld, germ,
                BodyDef.BodyType.StaticBody, objectFixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(germ, germBody, true, true));
        scene.attachChild(germ);
    }

    //joint_2
    public static void create_2bar_Obstacle(Scene scene,PhysicsWorld physicsWorld,
                                            BaseGameActivity activity,
                                            ITextureRegion jointTextureRegion1, ITextureRegion jointTextureRegion5,
                                            float centerX, float centerY){
        final FixtureDef fixtureDef = PhysicsFactory.createFixtureDef(1.0F ,0.5F, 1F);
        fixtureDef.filter.maskBits=ConstantsSet.OBS_MASK_BITS;
        fixtureDef.filter.categoryBits=ConstantsSet.OBS_CATG_BITS;

        final Sprite rect1 = new Sprite(centerX,centerY,jointTextureRegion5,activity.getVertexBufferObjectManager());
        final Body barBody1 = PhysicsFactory.createBoxBody(physicsWorld, rect1, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect1, barBody1, true, true));
        scene.attachChild(rect1);


        final Sprite rect5 = new Sprite(centerX - jointTextureRegion1.getWidth()/2,
                centerY - jointTextureRegion1.getHeight()/2,jointTextureRegion1,
                activity.getVertexBufferObjectManager());
        final Body barBody5 = PhysicsFactory.createBoxBody(physicsWorld, rect5, BodyDef.BodyType.StaticBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect5, barBody5, true, true));
        scene.attachChild(rect5);

        RevoluteJointDef revoluteJointDef = new RevoluteJointDef();
        revoluteJointDef.initialize(barBody5,barBody1,barBody5.getWorldCenter());
        revoluteJointDef.localAnchorB.set(0,0);
        revoluteJointDef.upperAngle = 350f*0.0174533f;
        revoluteJointDef.collideConnected = false;

        physicsWorld.createJoint(revoluteJointDef);

    }

    //joint_3
    public static void create_3bar_Obstacle(Scene scene, PhysicsWorld physicsWorld,
                                            BaseGameActivity activity,
                                            ITextureRegion centerTextureRegion, ITextureRegion barTextureRegion,
                                            float centerX, float centerY){


        final FixtureDef fixtureDef = PhysicsFactory.createFixtureDef(1.0F ,0.5F, 1F);
        fixtureDef.filter.maskBits=ConstantsSet.OBS_MASK_BITS;
        fixtureDef.filter.categoryBits=ConstantsSet.OBS_CATG_BITS;

        final Sprite rect1 = new Sprite(centerX,centerY,barTextureRegion,activity.getVertexBufferObjectManager());
        final Body barBody1 = PhysicsFactory.createBoxBody(physicsWorld, rect1, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect1, barBody1, true, true));
        scene.attachChild(rect1);

        final Sprite rect2 = new Sprite(centerX, centerY,barTextureRegion,activity.getVertexBufferObjectManager());
        final Body barBody2 = PhysicsFactory.createBoxBody(physicsWorld, rect2, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect2, barBody2, true, true));
        scene.attachChild(rect2);

        final Sprite rect3 = new Sprite(centerX, centerY,barTextureRegion,activity.getVertexBufferObjectManager());
        final Body barBody3 = PhysicsFactory.createBoxBody(physicsWorld, rect3, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect3, barBody3, true, true));
        scene.attachChild(rect3);


        final Sprite rect4 = new Sprite(centerX - centerTextureRegion.getWidth()/2,
                centerY - centerTextureRegion.getHeight()/2,centerTextureRegion,
                activity.getVertexBufferObjectManager());
        final Body barBody4 = PhysicsFactory.createBoxBody(physicsWorld, rect4, BodyDef.BodyType.StaticBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect4, barBody4, true, true));
        scene.attachChild(rect4);


        WeldJointDef weldJointDef1 = new WeldJointDef();
        weldJointDef1.initialize(barBody1,barBody2,barBody1.getWorldCenter());
        weldJointDef1.localAnchorA.set(-((float)(rect1.getWidth()))/64.0f,0);
        weldJointDef1.localAnchorB.set(-((float)(rect1.getWidth()))/64.0f,0);
        weldJointDef1.referenceAngle =2.0f*(2.0944f);
        weldJointDef1.collideConnected = false;
        physicsWorld.createJoint(weldJointDef1);

        WeldJointDef weldJointDef2 = new WeldJointDef();
        weldJointDef2.initialize(barBody1,barBody3,barBody1.getWorldCenter());
        weldJointDef2.localAnchorA.set(-((float)(rect1.getWidth()))/64.0f,0);
        weldJointDef2.localAnchorB.set(-((float)(rect1.getWidth()))/64.0f,0);
        weldJointDef2.referenceAngle =(2.0944f);
        weldJointDef2.collideConnected = false;
        physicsWorld.createJoint(weldJointDef2);

        RevoluteJointDef revoluteJointDef = new RevoluteJointDef();
        revoluteJointDef.initialize(barBody4,barBody1,barBody4.getWorldCenter());
        revoluteJointDef.localAnchorB.set(-(float)(rect1.getWidth())/64.0f,0);

        revoluteJointDef.upperAngle = 350f*0.0174533f;
        revoluteJointDef.collideConnected = false;

        physicsWorld.createJoint(revoluteJointDef);

    }

    //joint_4
    public static void create_4bar_Obstacle(Scene scene,PhysicsWorld physicsWorld,
                                            BaseGameActivity activity,
                                            ITextureRegion jointTextureRegion1, ITextureRegion jointTextureRegion5,
                                            float centerX, float centerY){
        final FixtureDef fixtureDef = PhysicsFactory.createFixtureDef(1.0F ,0.5F, 1F);
        fixtureDef.filter.maskBits=ConstantsSet.OBS_MASK_BITS;
        fixtureDef.filter.categoryBits=ConstantsSet.OBS_CATG_BITS;

        final Sprite rect1 = new Sprite(centerX,centerY,jointTextureRegion5,activity.getVertexBufferObjectManager());
        final Body barBody1 = PhysicsFactory.createBoxBody(physicsWorld, rect1, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect1, barBody1, true, true));
        scene.attachChild(rect1);

        final Sprite rect2 = new Sprite(centerX, centerY,jointTextureRegion5,activity.getVertexBufferObjectManager());
        final Body barBody2 = PhysicsFactory.createBoxBody(physicsWorld, rect2, BodyDef.BodyType.DynamicBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect2, barBody2, true, true));
        scene.attachChild(rect2);




        final Sprite rect5 = new Sprite(centerX - jointTextureRegion1.getWidth()/2,
                centerY - jointTextureRegion1.getHeight()/2,jointTextureRegion1,
                activity.getVertexBufferObjectManager());
        final Body barBody5 = PhysicsFactory.createBoxBody(physicsWorld, rect5, BodyDef.BodyType.StaticBody, fixtureDef);
        physicsWorld.registerPhysicsConnector(new PhysicsConnector(rect5, barBody5, true, true));
        scene.attachChild(rect5);

        WeldJointDef weldJointDef1 = new WeldJointDef();
        weldJointDef1.initialize(barBody1,barBody2,barBody1.getWorldCenter());
        weldJointDef1.referenceAngle =(float)Math.toRadians(90.0);
        weldJointDef1.collideConnected = false;
        physicsWorld.createJoint(weldJointDef1);



        RevoluteJointDef revoluteJointDef = new RevoluteJointDef();
        revoluteJointDef.initialize(barBody5,barBody1,barBody5.getWorldCenter());
        revoluteJointDef.localAnchorB.set(0,0);
        revoluteJointDef.upperAngle = 350f*0.0174533f;
        revoluteJointDef.collideConnected = false;

        physicsWorld.createJoint(revoluteJointDef);

    }

    public static void create_germs(Scene scene, PhysicsWorld physicsWorld,
                                    BaseGameActivity activity,
                                    ITextureRegion germTextureRegion, int posX[], int posY[], Player p){

        for(int i=0;i<posX.length;i++){
            Germ germ = new Germ(posX[i],posY[i],germTextureRegion,activity.getVertexBufferObjectManager());
            germ.createUnit(physicsWorld,scene);
            germ.setPlayer(p);

        }
    }


}
