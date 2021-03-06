/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    public Joystick pilot, copilot;
    private DTButton[] driverButtons, copilotButtons, cocopilotButtons;

    public OperatorInterface() {
        pilot = new Joystick(Constants.PILOT_JOYSTICK);
        copilot = new Joystick(Constants.COPILOT_JOYSTICK);
        copilotButtons = new DTButton[20];
        for(int i = 0; i < copilotButtons.length; i++) {
            copilotButtons[i] = new DTButton(copilot, i + 1);
        }
    }

    public double getPilotX() {
        //gets the x axis on the ps4 contoller (side to side) 
        if((pilot.getRawAxis(0))/(Math.abs(pilot.getRawAxis(0))) == 1) {
            return (Math.pow(pilot.getRawAxis(0), 2));//robot with bad grabber and stepper is inverted in the second statement 
        }
            return (-1)*(Math.pow(pilot.getRawAxis(0), 2));
    }

    public double getPilotY() {
        //gets the y axis on the ps4 controller (forward and back)
        if((pilot.getRawAxis(1))/(Math.abs(pilot.getRawAxis(1))) == 1) {
            return (-1)*(Math.pow(pilot.getRawAxis(1), 2));
        }
            return (Math.pow(pilot.getRawAxis(1), 2));
    }

    public double getPilotZ() {
        //gets the z axis on the ps4 controller (rotation)
        if((pilot.getRawAxis(2))/(Math.abs(pilot.getRawAxis(2))) == 1) {
            return (Math.pow(pilot.getRawAxis(2), 2));
        }
            return (-1)*(Math.pow(pilot.getRawAxis(2), 2));
    }

    public DTButton getCopilotButton(int num) {
        //this gets the id number of the button on the copilot box
        return copilotButtons[num];
    }

    public boolean coButtonIsPressed(int button) {
        //this will tell us if a button is pressed on the copilot box and return true
        return copilot.getRawButton(button);
    }

    public double getCopilotAxis(int num) {
        //gets the axis on the copilot box
        return copilot.getRawAxis(num);
    }

    public DTButton getCocopilotButton(int num) {
        //returns the id num of the copilot box
        return cocopilotButtons[num];
    }

    public boolean axisToButtonIsPressed(int axis) {
        //returns true if the axis button is pressed
        return (copilot.getRawAxis(axis) == 1);
    }
    public int getDPadDirection()
    {
        //returns the value of the D Pad in Degrees
        //System.out.println(pilot.getPOV(0));
        return pilot.getPOV(0);
    }
    
    public boolean getDPadRight(int DPadDirection)
    {
        if(getDPadDirection() >= 85 && getDPadDirection() <= 95)
        return true;
        return false;
    }

    public boolean getDPadLeft(int DPadDirection)
    {
        if(getDPadDirection() >= 265 && getDPadDirection() <= 275)
        return true;
        return false;
    }
    
    public boolean getDPadUp(int DPadDirection)
    {
        if(getDPadDirection() >= 355 || getDPadDirection() <= 5 && getDPadDirection() != -1)
        return true;
        return false;
    }

    public boolean getDPadDown(int DPadDirection)
    {
        if(getDPadDirection() >= 175 && getDPadDirection() <= 185)
        return true;
        return false;
    }
    
    public boolean getDPadUpRight(int DPadDirection)
    {
        if(getDPadDirection() >= 40 && getDPadDirection() <= 50)
        return true;
        return false;
    }
    
    public boolean getDPadDownRight(int DPadDirection)
    {
        if(getDPadDirection() >= 130 && getDPadDirection() <= 140)
        return true;
        return false;
    }
    
    public boolean getDPadDownLeft(int DPadDirection)
    {
        if(getDPadDirection() >= 220 && getDPadDirection() <= 230)
        return true;
        return false;
    }
    
    public boolean getDPadUpLeft(int DPadDirection)
    {
        if(getDPadDirection() >= 310 && getDPadDirection() <= 320)
        return true;
        return false;
    }  
    
}