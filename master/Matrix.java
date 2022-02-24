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

	@Override
	public void addRow(ArrayList<Float> row) {
		
		matrix.add(row);
		
	}

	/***
	 * The size of the parameter column must not exceed the size of the number of rows. 
	 * The function will truncate the given list automatically to fit the number of rows. 
	 * If the function is provided with the true value, it will add additional rows to compensate for the size of the given list. 
	 * This will create new rows with zeros in them.  
	 */
	@Override
	public void addColumn(ArrayList<Float> column, boolean addRows) {
		
		int saveIndex = 0;
		Object[] floatArray = column.toArray();
		
		try {
			
			for(int i = 0; i < column.size(); i++) {
				
				saveIndex = i;
				matrix.get(i).add(column.get(i));
				
			}
			
		}
		catch (java.lang.IndexOutOfBoundsException outOfBounds) {
			
			//System.out.println(column.get(4));
			
			
			ArrayList<Float> zeros = new ArrayList<Float>();
			
			for(int n = 0; n < this.getColumns()-1; n++ ) {
				
				zeros.add((float)0);
				
			}
			
			for ( int j = saveIndex; j < column.size(); j++ ) {
				
				System.out.println("index " + j);
				this.addRow(zeros);
				matrix.get(j).;
				
				System.out.println(floatArray[j]);
				
				
			}
			
		}
		catch (Exception e){
			
			System.out.println(e);
			
		}
		
		
		
		
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return matrix.size();
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return matrix.get(0).size();
	}

	@Override
	public String getSize() {
		
		return getRows() + "x" + getColumns();
		
	}

	@Override
	public void displayMatrix() {
		
		for (int i = 0; i < matrix.size(); i++ ) {
			
			for( int j = 0; j < this.getColumns(); j++) {
				
				System.out.print ( matrix.get(i).get(j) + "\t" );
				
			}
			
			System.out.println();
			
		}
		
	}

}
