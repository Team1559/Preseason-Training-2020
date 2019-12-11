package org.usfirst.frc.team1559.robot.widgets;

import java.util.Map;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team1559.robot.Shuffleboard1559;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

public class MotorWidget
{
    private NetworkTableEntry widget;
    private WPI_TalonSRX motor;
    public MotorWidget(WPI_TalonSRX inputMotor, String widgetName, Shuffleboard1559 tabThing)
    {
        motor = inputMotor;
        widget = tabThing.getTab().add(widgetName,1).withWidget(BuiltInWidgets.kNumberSlider).getEntry(); //Creates a slider widget with a name, input motor, and the tab it goes in.
    }

    //public Shuffleboard1559(WPI_TalonSRX inputMotor1, 
    //Work on TalonSRX Array List
    public void setOutput()
    {
        double output = motor.getMotorOutputPercent();
        widget.setDouble(output);
    }
    public void changeOutput() //Changes the output based on the slider.
    {
        double output = widget.getDouble(1.0);
        motor.set(ControlMode.PercentOutput, output);
    }   
}