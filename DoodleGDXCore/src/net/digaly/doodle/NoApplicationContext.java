package net.digaly.doodle;

import net.digaly.doodle.events.EventDispatcher;
import net.digaly.doodle.events.NoEventDispatcher;

/**
 * Created by Tom Dobbelaere on 30/10/2016.
 */
public class NoApplicationContext implements ApplicationContext
{
    private EventDispatcher noEventDispatcher;

    public NoApplicationContext() {
        this.noEventDispatcher = new NoEventDispatcher();
    }

    @Override
    public void setCurrentRoom(Room room)
    {

    }

    @Override
    public EventDispatcher getEventDispatcher()
    {
        return noEventDispatcher;
    }
}