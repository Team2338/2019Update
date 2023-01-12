// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import static java.lang.Math.PI;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class Climber {
    public static final double VARIABLE_RATE_PISTON_PERIOD = 0.2; // Resolution of the solenoid PWM in seconds
    public static final double GYRO_SENSITIVITY = 0.05;
    public static final double P = 0.0;
    public static final double I = 0.0;
    public static final double D = 0.0;
    public static final double F = 0.0;
    public static final double PISTON_FEED_FORWARD = 0.25;
  }


  public static class Drivetrain {
    // Physical Stuff
    public static final int TICKS_PER_REV = 4096;
    public static final double WHEEL_DIAMETER = 4.97; // 5.05

    public static final double TICKS_TO_INCHES = (1.0 / TICKS_PER_REV) * (WHEEL_DIAMETER*PI);

    public static final double TPS_TO_RPS = (1.0 / TICKS_PER_REV) * (2 * PI);
  }
}
