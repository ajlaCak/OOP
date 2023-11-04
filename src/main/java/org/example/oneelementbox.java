package org.example;

public class oneelementbox extends boxx{
    private tobestored thing;

    public oneelementbox() {
        this.thing = null;
    }

    @Override
    public void add(tobestored thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
}}
