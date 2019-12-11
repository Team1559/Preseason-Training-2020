package org.usfirst.frc.team1559.robot.widgets;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team1559.robot.Shuffleboard1559;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

public class DriveTrainWidget
{
    private NetworkTableEntry widget;
    private WPI_TalonSRX motor1;
    private WPI_TalonSRX motor2;
    private WPI_TalonSRX motor3;
    private WPI_TalonSRX motor4;

    public DriveTrainWidget(WPI_TalonSRX inputMotor1,WPI_TalonSRX inputMotor2,WPI_TalonSRX inputMotor3,WPI_TalonSRX inputMotor4, Shuffleboard1559 tabInsert)
    {
        motor1 = inputMotor1;
        motor2 = inputMotor2;
        motor3 = inputMotor3;
        motor4 = inputMotor4;
        widget = tabInsert.getTab().add("Drive Train Control",1).withWidget(BuiltInWidgets.kNumberSlider).getEntry();
    }

    public void changeOutput()
    {
        double output = widget.getDouble(1.0);
        motor1.set(ControlMode.PercentOutput,output);
        motor2.set(ControlMode.PercentOutput,output);
        motor3.set(ControlMode.PercentOutput,output);
        motor4.set(ControlMode.PercentOutput,output);
    }
}