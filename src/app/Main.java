package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		
		int nElems = 96;
		String toFormat = ".jackbox-talks .Slideshow .photo-core-four-%d-thumb, .jackbox-talks .Draw.photo-core-four-%d-thumb canvas.sketchpad, "
				+ ".jackbox-talks .Awards .photo.photo-core-four-%d-thumb, .jackbox-talks .photo.photo-core-four-%d-thumb .choice-button "
				+ "{\r\n"
				+ "    background-image: url(\"chrome-extension://lieidallnclgkeocpebckoifdignomgf/assets/Core_Four_%d.jpg\");\r\n"
				+ "}";
		String newLine = "\n\n";
		String formatted;
		
		try( //TRY STATEMENT
				FileWriter fw = new FileWriter("output.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)
		){ //TRY EXECUTION BLOCK
			
			for(int i=1; i<=96; i++) {
				formatted = String.format(toFormat, i,i,i,i,i);
				System.out.println(formatted);
				 out.write(formatted);
				 out.write(newLine);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
