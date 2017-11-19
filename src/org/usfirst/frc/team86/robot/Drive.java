package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Drive extends IO{
	
	public RobotDrive robotDrive;
	private int state = 1;
	private double prevTime = 0;
	
	public Drive(Victor leftFront, Victor leftRear, Victor rightFront, Victor rightRear) {
		robotDrive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
	}
	
	public void driveInit() {
		leftFront.set(0);
		leftRear.set(0);
		rightFront.set(0);
		rightRear.set(0);
	}
	public void autoUpdate() {
		leftFront.set(0);
		leftRear.set(0);
		rightFront.set(0);
		rightRear.set(0);
		switch(state) {
		case 1:
			prevTime = System.currentTimeMillis();
			state++;
			break;
		case 2:
			while(System.currentTimeMillis() - prevTime > 3000) {
				leftFront.set(0.50);
				leftRear.set(0.50);
				rightFront.set(0.50);
				rightRear.set(0.50);
			}
			state++;
			break;
		case 3:
			while(System.currentTimeMillis() - prevTime > 2500) {
				leftFront.set(0.25);
				leftRear.set(0.25);
				rightFront.set(-0.25);
				rightRear.set(-0.25);
			}
			state++;
			break;
		case 4:
			while(System.currentTimeMillis() - prevTime > 3000) {
				leftFront.set(-0.50);
				leftRear.set(-0.50);
				rightFront.set(-0.50);
				rightRear.set(-0.50);
			}
			break;
		}
	}
	public void teleopUpdate() {
		robotDrive.tankDrive(leftJoy.getY(), rightJoy.getY());
	}
}
