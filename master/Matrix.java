package JLinearAlgebra.master;

import java.util.ArrayList;
import java.util.List;


public class Matrix implements MatrixInterface{
	
	private List<ArrayList<Float>> matrix = new ArrayList<ArrayList<Float>>();
	
	/* Notes
	 * currently, to get the class up and running, the constructors are pretty basic and only takes in already finished array list variables 
	 * to add to the matrix
	 * 
	 */
	
	
	/***
	 * The default constructor makes a zero matrix of size 1x1, just for the sake of not running into collisions with uninstantiated arrays.
	 */
	public Matrix() {
		
		ArrayList<Float> tempZero = new ArrayList<Float>();
		
		tempZero.add((float) 0.0);
		
		matrix.add( tempZero );
		
	}
	
	/***
	 * This single variable constructor, will take the given {@link ArrayList}, and add it to the class's matrix variable. This is for development purposes,
	 * as at the moment, it is assuming that the user (the developer) knows how their own function operates. Later on, a more convenient 
	 * constructor will be written. At the moment this also only allows for one row to be added. 
	 * @param matrixBody is of type ArrayList<Float>, and one should be passed in. 
	 */
	public Matrix( ArrayList<Float> matrixBody ) {
		
		matrix.add(matrixBody);
		
	}

	/***
	 * This function, as its name implies, will perform matrix addition on the two matrices, where the reference object will be on the left side
	 * of the addition, and the parameter object will be on the right side. It will not alter the {@link Matrix} in anyway, however, will return the result.
	 */
	@Override
	public List<List<Float>> matrixAddition(List<List<Float>> maxtrixB) {
		
		
		
		return null;
	}

	@Override
	public List<List<Float>> maxtrixSubtraction(List<List<Float>> matrixB) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<Float>> matrixMultiplication(List<List<Float>> matrixB) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<Float>> matrixDivision(List<List<Float>> matrixB) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<Float>> transpose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<Float>> invert() {
		// TODO Auto-generated method stub
		return null;
	}

}
