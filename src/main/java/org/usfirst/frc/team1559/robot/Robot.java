/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1559.robot;


import edu.wpi.first.wpilibj.TimedRobot;
import org.usfirst.frc.team1559.robot.Shuffleboard1559;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team1559.robot.OperatorInterface;


public class Robot extends TimedRobot
{
	WPI_TalonSRX motorFL;
	//instantiate variables and other things 

	@Override
	public void robotInit()
	{
		// Sub-System Instantiations
		motorFL = new WPI_TalonSRX(1);
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
	Shuffleboard1559 widgetFL = new Shuffleboard1559(motorFL,"FL Motor");
	
	}

	@Override
	public void disabledInit()
	{
	
	}

	@Override
	public void disabledPeriodic()
	{
	
	}
}
