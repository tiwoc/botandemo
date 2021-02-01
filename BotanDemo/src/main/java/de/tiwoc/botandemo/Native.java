package de.tiwoc.botandemo;

public class Native {
	static {
		System.loadLibrary("stlport_shared");
		//System.loadLibrary("gnustl_shared");
		System.loadLibrary("botan");
		System.loadLibrary("botandemo");
	}
	
	public static native String pbkdf2Demo(int iterations);
}
