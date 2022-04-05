package JLinearAlgebra.master;

import java.util.ArrayList;

public interface MatrixInterface {
	
	//must include a matrix object, 2d list object.
	
	public void addRow(ArrayList<Float> row);
	public void addColumn(ArrayList<Float> column, boolean truncate);
	
	public void removeRow(int index);
	public void removeColumn(int index);
	
	public int getRows();
	public int getColumns();
	
	//should return the size in a string such as "3x3"
	public String getSize();
	
	public Matrix matrixAddition(Matrix matrixB);
	
	public Matrix matrixSubtraction(Matrix matrixB);
	
	public Matrix matrixMultiplication(Matrix matrixB);
	
	public Matrix transpose();
	public Matrix invert();
	
	public float getElement(int row, int column);	
	
	public void displayMatrix();
	
	public int compareSize(Matrix matrixB);
	
}
