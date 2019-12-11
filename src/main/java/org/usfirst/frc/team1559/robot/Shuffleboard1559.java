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
        tab = Shuffleboard.getTab("Robot Test"); //This creates the tab that the info will go into
    }

    public ShuffleboardTab getTab() //Provides the tab to anywhere that requires it.
    {
        return tab;
    }
}