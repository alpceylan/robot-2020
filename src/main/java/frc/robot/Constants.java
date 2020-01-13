/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants
    {

        public static final int kLeftFrontMotorPort = 12;
        public static final int kLeftRearMotorPort = 14;
        public static final int kRightFrontMotorPort = 13;
        public static final int kRightRearMotorPort = 15;

        public static final boolean kGyroReversed = false;

        public static final double kTurnP = 0.8; // 0.8
        public static final double kTurnI = 0;
        public static final double kTurnD = 0.045; // 0.045
    
        public static final double kMaxTurnRateDegPerS = 120; // 200
        public static final double kMaxTurnAccelerationDegPerSSquared = 300;

        public static final double kTurnToleranceDeg = 2;
        public static final double kTurnRateToleranceDegPerS = 8; // 10

    }
    public static final class OIConstants
    {
        public static final int kDriverControllerPort = 0;
    }
}