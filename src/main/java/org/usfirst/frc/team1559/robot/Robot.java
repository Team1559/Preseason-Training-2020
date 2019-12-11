/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1559.robot;

import org.usfirst.frc.team1559.robot.widgets.*;
import edu.wpi.first.wpilibj.TimedRobot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team1559.robot.OperatorInterface;


public class Robot extends TimedRobot
{
	WPI_TalonSRX motorFL;
	WPI_TalonSRX motorFR;
	WPI_TalonSRX motorBL;
	WPI_TalonSRX motorBR;
	Shuffleboard1559 tab;
	MotorWidget widgetFL;
	//instantiate variables and other things 

	@Override
	public void robotInit()
	{
		// Sub-System Instantiations
		motorFL = new WPI_TalonSRX(1);
		motorFR = new WPI_TalonSRX(2);
		motorBL = new WPI_TalonSRX(3);
		motorBR = new WPI_TalonSRX(4);
		tab = new Shuffleboard1559();
		widgetFL = new MotorWidget(motorFL, "FL Motor", tab);
		}

	@Override
	public void robotPeriodic()
	{

	}

	@Override
	public void autonomousInit()
	{
		
		
	}

	@Override
	public void autonomousPeriodic() {
		
	}

	@Override
	public void teleopInit()
	{
		

	}


	@Override
	public void teleopPeriodic()
	{
	
	}

	@Override
	public void disabledInit()
	{
	
	}

	@Override
	public void disabledPeriodic()
	{
	
	}

	@Override
	public void testInit()
	{
		motorFL.set(ControlMode.PercentOutput, 0);
		
	}

	@Override
	public void testPeriodic()
	{
		widgetFL.changeOutput();
	}
}
