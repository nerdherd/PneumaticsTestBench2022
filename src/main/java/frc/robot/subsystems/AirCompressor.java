/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * Add your docs here.
 */
public class AirCompressor extends SubsystemBase {

    private Compressor m_compressor;

    public AirCompressor(int port, PneumaticsModuleType moduleType) {
        m_compressor = new Compressor(port, moduleType);
    }

    public enableDigital() {
        m_compressor.enableDigital();
    }
}
