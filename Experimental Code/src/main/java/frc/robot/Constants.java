// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class ShiftConstants {
        public static final int kSolenoidModule = 0;
        public static final int[] kSolenoidPorts = new int[] {0, 1, 2, 3};
         
     }

    public static final class DriveConstants {

        public static final int kFrontLeftDrive = 1;
        public static final int kBackLeftDrive = 2;
        public static final int kFrontRightDrive = 3;
        public static final int kBackRightDrive = 4;

        public static final int kFrontLeftSteer = 5;
        public static final int kBackLeftSteer = 6;
        public static final int kFrontRightSteer = 7;
        public static final int kBackRightSteer = 8;

        public static final int[] kFrontLeftEncoderPorts = new int[] {0, 1};
        public static final int[] kRearLeftEncoderPorts = new int[] {2, 3};
        public static final int[] kFrontRightEncoderPorts = new int[] {4, 5};
        public static final int[] kRearRightEncoderPorts = new int[] {6, 7};

        public static boolean kFrontLeftEncoderReversed = false;
        public static boolean kFrontRightEncoderReversed = true;
        public static boolean kRearLeftEncoderReversed = false;
        public static boolean kRearRightEncoderReversed = true;
    }
}
