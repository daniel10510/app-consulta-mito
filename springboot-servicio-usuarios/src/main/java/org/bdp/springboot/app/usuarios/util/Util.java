package org.bdp.springboot.app.usuarios.util;

public class Util {
	
	public static String randomCodVerif() {
		int min = 100000;
	    int max = 999999;
		int codVerif = (int)(Math.random() * (max - min + 1) + min);
		return String.valueOf(codVerif);
	}
}
