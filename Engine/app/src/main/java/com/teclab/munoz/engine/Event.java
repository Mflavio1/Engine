package com.teclab.munoz.engine;

/**
 * Created by Alumno on 04/04/2017.
 */

public class Event {

    EventDispatcher currentTarget;

    Object data;

    EventDispatcher target;

    String Type;




    public  Event(String _type){ Type = _type; }

    Event(String _type, Object _data){ Type = _type;  data = _data; }





}
