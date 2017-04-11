package com.teclab.munoz.engine;

/**
 * Created by Alumno on 04/04/2017.
 */

import android.net.sip.SipAudioCall;
import java.util.List;
import java.util.ArrayList;

public class EventDispatcher {

public  EventDispatcher(){

    listeners = new ArrayList();
}
    public  void  addEventListeners(String type){
        listeners.add(type);
    }

    public void dispatchEvent(Event e){
        if(e.target == null)
            e.target = this;
             for (int i=0; i < listeners.size(); i++)
                 if(((String)listeners.get(i)).equals(e.Type))
                     reciveEvent(e);
    }


    public void dispatchEvent(String Type){
        Event e = new Event(Type);
        if(e.target == null)
            e.target = this;
        for (int i=0; i < listeners.size(); i++)
            if(((String)listeners.get(i)).equals(e.Type))
                reciveEvent(e);
    }

    public void removeEventListener(String Type){listeners(String Type);}

    public  void  removeEventListeners(){listeners.clear();}

    public  void  reciveEvent(Event event){}

    public  void  dipose(){listeners.clear();}

    private  List listeners;

}
