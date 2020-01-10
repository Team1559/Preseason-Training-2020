package org.usfirst.frc.team1559.robot.widgets;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team1559.robot.Shuffleboard1559;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

public class DriveTrainWidget
/*
* Used to control all the wheels of the drive train at eqauls output and in the same direction.
* Designed for testing purposes only! Not intended for actually driving the robot! - Jack Vander Linden
*/
{
    private NetworkTableEntry widget;
    private WPI_TalonSRX[] motors;

    public DriveTrainWidget(WPI_TalonSRX[] inputMotors, Shuffleboard1559 tabInsert)
    {
        motors = inputMotors;
        widget = tabInsert.getTab().add("Drive Train Control",1).withWidget(BuiltInWidgets.kNumberSlider).getEntry();
    }

    public void changeOutput()
    {
        double output = widget.getDouble(1.0);
        for(int i = 0; i < motors.length; i++)
        {
            motors[i].set(ControlMode.PercentOutput, output);
        }
    }
}