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
    public MotorWidget(WPI_TalonSRX inputMotor, String widgetType, String widgetName, Shuffleboard1559 tabThing)
    {
        motor = inputMotor;
        if(widgetType.equals("Slider"))
        {
            widget = tabThing.getTab().add(widgetName,1).withWidget(BuiltInWidgets.kNumberSlider).getEntry();
        }
        else if(widgetType.equals("Text Box"))
        {
            widget = tabThing.getTab().add(widgetName,1).withWidget(BuiltInWidgets.kTextView).getEntry();
        }
        else if(widgetType.equals("Graph"))
        {
            widget = tabThing.getTab().add(widgetName,1).withWidget(BuiltInWidgets.kGraph).getEntry();
        }
        
    }

    //public Shuffleboard1559(WPI_TalonSRX inputMotor1, 
    //Work on TalonSRX Array List
    public void setOutput()
    {
        double output = motor.getMotorOutputPercent();
        widget.setDouble(output);
    }
    public void changeOutput()
    {
        double output = widget.getDouble(1.0);
        motor.set(ControlMode.PercentOutput, output);
    }   
}