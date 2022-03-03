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

		
		
		System.out.println("\n"+matrixA.getSize());
		matrixA.displayMatrix();
		
		
	}

}
