package com.qacaffe.gists;

public class Lamp {

    boolean isLightOn = true;

    public void turnOffLight() {
        isLightOn = false;
        System.out.println("Turning off the light. ⚠");
    }

    public void turnOnLight() {
        isLightOn = true;
        System.out.println("Turning on the light. 💡");
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        System.out.println("Light is on 💡");
        lamp.turnOffLight();
        lamp.turnOnLight();
    }

}

/*
Output :
Light is on 💡
Turning off the light. ⚠
Turning on the light. 💡
*/
