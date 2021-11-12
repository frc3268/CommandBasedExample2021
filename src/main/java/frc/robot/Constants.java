// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // New and improved RobotMap Class :D

    // Drive
    // All motor constants are declared here. Each motor has a certain "number" attached to it depending 
    // on the wiring. (Electrical people should figure this out and label the motors)
    public static class DRIVE {
        // Example line of code below initializes a new motor controller Spark with the port 1. Each
        // motor is labeled with where it is powering so we can see here that the Spark motor is powering
        // the front left wheels.
        public static final int SPARK_driveLeftFront = 1;
    }

    // OI (Operator Interface)
    // Constants for OI behaviors are declared here 
    public static class JOYSTICKS {
        // Logitech joystick is initialized here in specific port
        public static final Joystick drive = new Joystick(0);
    } 

    public static class BUTTONS {
        // Button from controller is assigned to command. Here, the shooter command is assigned to button 7.
        // TO figure out which integer is connected which button on joystick, use Driver Station
        // (Elaborate this later)
        // Actually button constants might be declared in robot class
        public static final int SHOOTER = 7;
    }

}
