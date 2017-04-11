package com.teclab.munoz.engine;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.renderscript.Sampler;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayContainer extends DisplayObject{

    private List children;
    public int numChildren;

    public DisplayContainer()
    {
        children = new ArrayList();
        numChildren = 0;
    }

    @SuppressLint( value = ("wrongCali"))
    public void onDraw(){
        for (int i = 0; i < numChildren; i++)
            ((DisplayObject)children.get(i)).primaryOperations();
    }

    public int addChild(DisplayObject child){
        children.add(child);
        child.parent = this;
        numChildren = children.size();
        return  numChildren;
    }

    public int addchildAT(DisplayObject child, int index){

        children.add(index, child);
        child.parent = this;
        numChildren = children.size();
        return numChildren;
    }

    public  boolean contains(DisplayObject child)
    {
    return  children.contains(child);
    }

    public DisplayObject getChildAT(int index){
        return  (DisplayObject)children.get(index);
    }

    private  int getChildIndex(DisplayObject child){
        return  children.indexOf(child);
    }

    public void removeChild(DisplayObject child){
        children.remove(child);
    }

    public void removeChild(DisplayObject child, boolean _dispose){
        children.remove(child);
        if(_dispose)
            child.dispose();
    }

    public DisplayObject removeChild(int index){
        return (DisplayObject)children.remove(index);
    }

    public DisplayObject removeChildAT(int index){
        return (DisplayObject)children.remove(index);
    }

    public DisplayObject removeChildAT(int index, boolean _dispose){
        if (_dispose)
            ((DisplayObject)children.get(index)).dispose();
        children.clear();
    }

    public void removeChildrens(boolean _dispose){
        if (_dispose)
        {for (int i=0; i < numChildren; i++)
            ((DisplayObject)children.get(i)).dispose();}
        children.clear();
    }

    public void removeChildrens(int begin, int end){
        for (int i = end; i>begin; i--)
            children.remove(i);
    }

    public void removeChildrens(int begin, int end, boolean _dispose){
        for (int i = end; i > begin; i--) {
            if (_dispose)
                ((DisplayObject) children.get(i)).dispose();

            children.remove(i);
        }
    }


    public  void sortChildrensIndex(DisplayObject child, int index){
        children.remove(child);
        children.add(index, child);
    }

    public  void sortChildren(Comparator comparator){
        Collections.sort(children,comparator);
    }

    public void swapChildrenAt(DisplayObject child1, DisplayObject child2){
        int index1 = children.indexOf(child1);
        int index2 = children.indexOf(child2);
        Collections.swap(children, index1, index2);
    }

    public  void dispose(){
        for (int i = 0; i < numChildren; i++){
            ((DisplayObject)children.get(i)).dispose();
            children.set(i, null);
        }
        children.clear();
        super.dispose();
    }
}
