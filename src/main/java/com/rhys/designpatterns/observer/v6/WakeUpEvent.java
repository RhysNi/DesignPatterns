package com.rhys.designpatterns.observer.v6;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/15 11:39 下午
 */
public class WakeUpEvent {
    public long timestamp;
    public String  loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}
