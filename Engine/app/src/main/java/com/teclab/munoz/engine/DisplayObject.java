package com.teclab.munoz.engine;

import android.app.usage.UsageEvents;
import android.graphics.Canvas;
import android.graphics.Point;
import android.provider.ContactsContract;
import android.util.EventLog;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject {

    public int x,y;

   //public DisplayObject parent;
   // public Resources resources;

    int heigth;
    float opacity;

    DisplayContainer parent;

    int pivotX;
    int pivotY;

    int rotation;

    float scaleX;
    float scaleY;

    Transformation transformation;

    boolean visible;

    int width;




    public DisplayObject(){
        x=y=0;
        scaleX = scaleY = 1.0f;
        pivotX = pivotY =0;
        opacity = 1.0f;
        width = heigth=0;
        visible = true;
        parent = null;
       // transformation  = new Transformation(this);
    }




public  void dispathEvent(Event a){}


    public void primaryOperations(){}
    public Point localToGlobal(Point p){
        return p;
    }
    public Point globalToLocal(Point p){
        return p;
    }
    //public void dispatchEvent(Event e){}
    public void dispatchEvent(String type){}
    public void touchDown(Point p,int index){}
    public void touchMove(Point p,int index){}
    public void touchUp(Point p,int index){}
    public void dispose(){}





    public void onDraw(Canvas canvas){
        this.update();
    }




    public void update(){}

    public void onTouchEvent(MotionEvent event) {}
}
