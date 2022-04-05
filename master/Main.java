package JLinearAlgebra.master;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Float> temp = new ArrayList<Float>();
		temp.add((float) 5);
		temp.add((float) 5);
		temp.add((float) 5);
		temp.add((float) 5);
		temp.add((float) 5);
		
		Matrix matrixA = new Matrix(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 10);
		temp.add((float) 10);
		temp.add((float) 10);
		temp.add((float) 10);
		temp.add((float) 10);
		
		matrixA.addRow(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 1);
		temp.add((float) 2);
		temp.add((float) 3);
		temp.add((float) 4);
		temp.add((float) 5);
		temp.add((float) 6);
	
		
		matrixA.addColumn(temp, true);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 0);
		temp.add((float) 0);
		temp.add((float) 0);
		temp.add((float) 0);
		temp.add((float) 0);
		temp.add((float) 0);
			
		Matrix matrixB = new Matrix(temp);
		
		matrixB.addRow(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 1);
		temp.add((float) 2);
		temp.add((float) 3);
		temp.add((float) 4);
		temp.add((float) 5);
		temp.add((float) 0);

		matrixB.addRow(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 6);
		temp.add((float) 7);
		temp.add((float) 8);
		temp.add((float) 9);
		temp.add((float) 10);
		temp.add((float) 0);
		
		matrixB.addRow(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 11);
		temp.add((float) 12);
		temp.add((float) 13);
		temp.add((float) 14);
		temp.add((float) 15);
		temp.add((float) 0);
		
		matrixB.addRow(temp);
		
		temp = new ArrayList<Float>();
		
		temp.add((float) 16);
		temp.add((float) 17);
		temp.add((float) 18);
		temp.add((float) 19);
		temp.add((float) 20);
		temp.add((float) 0);
		
		matrixB.addRow(temp);
		
		System.out.println(matrixA.getSize());
		matrixA.displayMatrix();
		
		System.out.println("\n"+matrixB.getSize());
		matrixB.displayMatrix();
		
		System.out.println("Displaying the result of A-B");
		matrixA.matrixSubtraction(matrixB).displayMatrix();
		
	}

}
