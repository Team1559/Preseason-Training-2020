package org.usfirst.frc.team1559.robot.widgets;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

import java.util.Map;

import org.usfirst.frc.team1559.robot.Shuffleboard1559;

public class BatteryWidget
{
    private NetworkTableEntry widgetVoltage;
    private NetworkTableEntry widgetVoltageHistory;
    private double voltage;

    public BatteryWidget(Shuffleboard1559 tabThing)
    {
        widgetVoltage = tabThing.getTab().add("Battery Voltage",1).withWidget(BuiltInWidgets.kVoltageView).withProperties(Map.of("min", 0.0, "max", 15.0,"center", 7.5,"orientation", "HORIZONTAL","Number of tick marks", 15)).getEntry();
        widgetVoltageHistory = tabThing.getTab().add("Voltage History",1).withWidget(BuiltInWidgets.kGraph).withProperties(Map.of("visible time", 600)).getEntry();
    }

    public void updateVoltage()
    {
        voltage = widgetVoltage.getDouble(1.0);
        widgetVoltageHistory.setDouble(voltage);

    }
}