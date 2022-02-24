package JLinearAlgebra.master;

import java.util.ArrayList;
import java.util.List;

public interface MatrixInterface {
	
	//must include a matrix object, 2d list object.
	
	public void addRow(ArrayList<Float> row);
	public void addColumn(ArrayList<Float> column, boolean truncate);
	
	public int getRows();
	public int getColumns();
	
	//should return the size in a string such as "3x3"
	public String getSize();
	
	public void displayMatrix();
	
	public List<List<Float>> matrixAddition(List<List<Float>> maxtrixB);
	
	public List<List<Float>> maxtrixSubtraction(List<List<Float>> matrixB);
	
	public List<List<Float>> matrixMultiplication(List<List<Float>> matrixB);
	
	public List<List<Float>> matrixDivision(List<List<Float>> matrixB);
	
	public List<List<Float>> transpose();
	public List<List<Float>> invert();
	
	
}
