package com.rhys.designpatterns.observer.v7;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:39 下午
 */
public class WakeUpEvent {
    public long timestamp;
    public String  loc;
    public Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}
