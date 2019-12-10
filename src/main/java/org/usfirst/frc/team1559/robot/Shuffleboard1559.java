package org.usfirst.frc.team1559.robot;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class Shuffleboard1559
{
    private ShuffleboardTab tab;

    public Shuffleboard1559()
    {
        tab = Shuffleboard.getTab("Robot Test");
    }

    public ShuffleboardTab getTab()
    {
        return tab;
    }
}