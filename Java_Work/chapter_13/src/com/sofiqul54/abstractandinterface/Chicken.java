package com.sofiqul54.abstractandinterface;

class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Chicken: Fry it";
    }

    @Override
    public String howToEat() {
        return "Chicken: cock-a-doodle-doo";
    }

}
