import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;

    /**
     * Calls the superclass constructor with certain parameters
     * Also sets the turbo to off
     */

    public Saab95(){

        super(2, 125, Color.red, "Saab95");
        turboOn = false;

    }

    /**
     * Sets the turbo to on
     */

    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Sets the turbo to off
     */

    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * Returns the speed factor
     * Overrides the super class's abstract speed factor class
     * It is now equal to the engine power multiplied by 0.01,
     * multiplied by 1.3 (if the turbo is on)
     * @return the speed factor
     */

    @Override
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
