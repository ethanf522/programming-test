package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Victor;

public class Shooter extends IO{
	
	private Victor shooter;
	private Victor conveyor;
	private Victor agitator;
	private Victor vibrator;
	private Victor snorfler;
	
	public Shooter(Victor shooter, Victor conveyor, Victor agitator, Victor vibrator, Victor snorfler) {
		this.shooter = shooter;
		this.conveyor = conveyor;
		this.agitator = agitator;
		this.vibrator = vibrator;
		this.snorfler = snorfler;
	}
	
	public void shooterInit() {
		shooter.set(0);
		conveyor.set(0);
		agitator.set(0);
		vibrator.set(0);
		snorfler.set(0);
	}
	
	public void update() {
		if(coJoy.getRawButton(1) == true) {
			shooter.set(0.65);
			conveyor.set(1);
		}
		else if(coJoy.getRawButton(1) && coJoy.getRawButton(3) == true) {
			shooter.set(0.65);
			conveyor.set(1);
			agitator.set(-0.30);
			vibrator.set(0.50);
		}
		else if(coJoy.getRawButton(1) && coJoy.getRawButton(3) == false) {
			shooter.set(0);
			conveyor.set(0);
			agitator.set(0);
			vibrator.set(0);
		}
		if(coJoy.getRawButton(5) == true) {
			snorfler.set(0.25);
		}
		else if(coJoy.getRawButton(5) == false){
			snorfler.set(0);
		}
	}
}
