package com.teclab.munoz.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;

import java.util.HashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources {


    private HashMap texturepool;
    public SoundManager sounds;
    public Context mContext;
    private  int fps;
    public  Canvas canvas;
    public PointF aspect;
    private  String hashKey;

    public Resources(Context _context){
        fps = 32;
        hashKey = "";
        mContext = _context;
        texturepool = new HashMap();
        sounds = new SoundManager(_context);
    }

    public void loadTexture(String key, int resouce)
        if(!texturepool.containsKey(key))


    public Resources(GameView view){
        this.view = view;
        pool  = new HashMap<String, Bitmap>();
    }

    public Bitmap getBmp(String resource){
        if(!this.pool.containsKey(resource)){
            this.pool.put(resource, BitmapFactory.decodeResource(this.view.getResources(),this.view.getResources().getIdentifier(resource , "drawable", this.view.getContext().getPackageName())));
        }

        return this.pool.get(resource);
    }

    public Bitmap removeBmp(String resource){
        return this.pool.remove(resource);
    }

}
