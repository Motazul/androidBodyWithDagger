package com.ilusia.pruebadagger2_androide.bodyparts;

public class Body {
    public Head head;
    public Arm armR, armL;
    public Leg legL, legR;


    public Body(
            Head head,
            Arm armR,
            Arm armL,
            Leg legL,
            Leg legR
            ){
        this.head = head;
        this.armL=armL;
        this.armR=armR;
        this.legL=legL;
        this.legR=legR;
    }

    public String getBodyData(){
        return "Head " + head.name +
                " arms " + armL.name + " " + armR.name +
                " legs " + legL.name + " " + legR.name;
    }
}
