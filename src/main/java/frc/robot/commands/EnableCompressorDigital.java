// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystem.Compressor;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class EnableCompressorDigital extends CommandBase {

  private AirCompressor m_compressor;

  public EnableCompressorDigital(AirCompressor compressor) {
    m_compressor = compressor;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(compressor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_compressor.enableDigital();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
