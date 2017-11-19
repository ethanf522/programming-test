package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class IO {
	
	public static Victor shooter = new Victor(0);
	public static Victor conveyor = new Victor(1);
	public static Victor agitator = new Victor(2);
	public static Victor vibrator = new Victor(3);
	public static Victor snorfler = new Victor(4);
	public static Victor leftFront = new Victor(5);
	public static Victor leftRear = new Victor(6);
	public static Victor rightFront = new Victor(7);
	public static Victor rightRear = new Victor(8);
	
	public static Joystick leftJoy = new Joystick(0);
	public static Joystick rightJoy = new Joystick(1);
	public static Joystick coJoy = new Joystick(2);
}
