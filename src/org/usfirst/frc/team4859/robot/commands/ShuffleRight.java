package org.usfirst.frc.team4859.robot.commands;

import org.usfirst.frc.team4859.robot.autonomous.DriveBackwards;
import org.usfirst.frc.team4859.robot.autonomous.DriveLeftBackwards;
import org.usfirst.frc.team4859.robot.autonomous.DriveLeftCenter;
import org.usfirst.frc.team4859.robot.autonomous.DriveLeftForwards;
import org.usfirst.frc.team4859.robot.autonomous.DriveRightBackwards;
import org.usfirst.frc.team4859.robot.autonomous.DriveRightCenter;
import org.usfirst.frc.team4859.robot.autonomous.DriveStop;
import org.usfirst.frc.team4859.robot.autonomous.DriveStraight;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShuffleRight extends CommandGroup {
	
    public  ShuffleRight() {
    	
        //addSequential(new DriveRightBackwards(0.6,1));
        //addSequential(new DriveLeftCenter(0.6,.3925));
        //addSequential(new DriveStraight(0.6,0.515));
    	
    	addSequential(new DriveLeftBackwards(0.5,0.1));
    	addSequential(new DriveLeftBackwards(1,.25));
    	addSequential(new DriveStop(.1));
    	addSequential(new DriveRightCenter(.5, 0.22));
        addSequential(new DriveRightCenter(1,.01));
        addSequential(new DriveStraight(1,0.21));
    	addSequential(new DriveStop(0));
    }
}  