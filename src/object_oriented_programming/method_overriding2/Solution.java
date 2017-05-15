package object_oriented_programming.method_overriding2;

// https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword?h_r=next-challenge&h_v=zen
public class Solution {
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	public MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}