package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	private static void mother() {
		   StdDraw.clear();
		   StdDraw.setPenColor(252, 3, 169);
		   StdDraw.filledRectangle(22, 16, 22, 16);
		   StdDraw.setPenColor(186, 3, 252);
		   StdDraw.filledEllipse(11, 8, 3, 3);
		}

		public static void norway() {
		   StdDraw.setXscale(0, 22);
		   StdDraw.setYscale(0, 16);
		   mother();
		}
	public static void main(String[] args) 
	{
	
		norway();
	}
}