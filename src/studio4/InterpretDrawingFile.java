package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		String shapeType = in.next();
		if (shapeType.equals ("ellipse"))
		{
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			StdDraw.setPenColor(R,G,B);
			
			boolean isFilled = in.nextBoolean();
			
			if (isFilled)
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
				
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else 
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
				
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
		
		else if (shapeType.equals ("rectangle"))
		{
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			StdDraw.setPenColor(R,G,B);
			
			boolean isFilled = in.nextBoolean();
			
			if (isFilled)
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
				
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else 
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
				
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		else 
		{
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			StdDraw.setPenColor(R,G,B);
			
			boolean isFilled = in.nextBoolean();
			
			if (isFilled)
			{
		
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				
				double [] x = {a,b,c};
				
				double d = in.nextDouble();
				double e = in.nextDouble();
				double g = in.nextDouble();
				
				double [] y = {d,e,g};
				
				StdDraw.filledPolygon(x, y);
			}
			else 
			{
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				
				double [] x = {a,b,c};
				
				double d = in.nextDouble();
				double e = in.nextDouble();
				double g = in.nextDouble();
				
				double [] y = {d,e,g};
				
				StdDraw.polygon(x, y);
		}
	}
}
}