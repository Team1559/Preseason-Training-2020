package org.usfirst.frc.team1559.robot;

import java.util.Map;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class Shuffleboard1559
{
    private ShuffleboardTab tab = Shuffleboard.getTab("Motor Test");
    private NetworkTableEntry widget;
    private WPI_TalonSRX motor;
    public Shuffleboard1559(WPI_TalonSRX inputMotor, String widgetName)
    {
        motor = inputMotor;
        widget = tab.add(widgetName,1).withWidget(BuiltInWidgets.kTextView).getEntry();
        
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