package net.gageot.puzzler;

import java.io.*;

/**
 * What’s My Class, Take 2.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec11
 */
public final class Puzzle021 {
	private Puzzle021() {
	}

	public static void bug() {
		Utils.print(Puzzle021.class.getName().replaceAll("\\.", File.separator) + ".class");
	}

	public static void fixed() {
		Utils.print(Puzzle021.class.getName().replace('.', File.separatorChar) + ".class");
	}
}
