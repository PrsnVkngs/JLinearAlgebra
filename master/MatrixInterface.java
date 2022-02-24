package JLinearAlgebra.master;

import java.util.List;

public interface MatrixInterface {
	
	//must include a matrix object, 2d list object.
	
	public List<List<Float>> matrixAddition(List<List<Float>> maxtrixB);
	
	public List<List<Float>> maxtrixSubtraction(List<List<Float>> matrixB);
	
	public List<List<Float>> matrixMultiplication(List<List<Float>> matrixB);
	
	public List<List<Float>> matrixDivision(List<List<Float>> matrixB);
	
	public List<List<Float>> transpose();
	public List<List<Float>> invert();
	
	
}
