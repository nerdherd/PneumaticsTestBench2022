/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.AirCompressor;
import frc.robot.subsystems.Piston;
import frc.robot.subsystems.Piston.ExtendPiston;
import frc.robot.subsystems.Piston.RetractPiston;

/**
 * Add your docs here.
 */
public class OI {

    public OI() {
        SmartDashboard.putData("extend piston", new ExtendPiston(Robot.piston));
        SmartDashboard.putData("retract piston", new RetractPiston(Robot.piston));
    }
}