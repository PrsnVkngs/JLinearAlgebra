package JLinearAlgebra.master;

import java.util.ArrayList;


public class Matrix implements MatrixInterface{
	
	private ArrayList<ArrayList<Float>> matrix = new ArrayList<ArrayList<Float>>();
	
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
	public Matrix matrixAddition(Matrix matrixB) {
		
		Matrix temp = new Matrix();
		temp.removeRow(0);
		ArrayList<Float> row;
		
		if ( this.getSize().equals(matrixB.getSize()) ) {
			
			for ( int i = 0; i < this.getRows(); i++ ) {
				row = new ArrayList<Float>();
				for ( int j = 0; j < this.getColumns(); j++ ) {
					
					row.add( matrix.get(i).get(j) + matrixB.getElement(i,j) );
					
				}
				temp.addRow(row);
			}
			return temp;
		}
		else {
			
			return null;
			
		}
		
		
	}

	@Override
	public Matrix matrixSubtraction(Matrix matrixB) {
			
		Matrix temp = new Matrix();
		temp.removeRow(0);
		ArrayList<Float> row;
		
		if ( this.getSize().equals(matrixB.getSize()) ) {
			
			for ( int i = 0; i < this.getRows(); i++ ) {
				row = new ArrayList<Float>();
				for ( int j = 0; j < this.getColumns(); j++ ) {
					
					row.add( matrix.get(i).get(j) - matrixB.getElement(i,j) );
					
				}
				temp.addRow(row);
			}
			return temp;
		}
		else {
			
			return null;
			
		}
		
	}

	@Override
	public Matrix matrixMultiplication(Matrix matrixB) {
		
		
		
		return null;
	}

	@Override
	public Matrix transpose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matrix invert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRow(ArrayList<Float> row) {
		
		matrix.add(row);
		
	}
	
	private ArrayList<Float> zeroRow(int length){
		
		ArrayList<Float> zeroes = new ArrayList<Float>();
		
		for(int i = 0; i < length; i++) {
			
			zeroes.add((float)0);
			
		}
		
		return zeroes;
		
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
		//Object[] floatArray = column.toArray();
		
		try {
			
			for(int i = 0; i < column.size(); i++) {
				
				saveIndex = i;
				matrix.get(i).add(column.get(i));
				
			}
			
		}
		catch (java.lang.IndexOutOfBoundsException outOfBounds) {
			
			System.out.println("Not enough rows, adding more.");
			
			int noColumns = this.getColumns();			
			
			for ( int j = saveIndex; j < column.size(); j++ ) {
				
				this.addRow(zeroRow(noColumns-1));
				matrix.get(j).add(column.get(j));
				
			}
			
		}
		catch (Exception e){
			
			System.out.println(e + "in addColumn");
			
		}
		
	}
	
	//TODO Add out of bounds handling
	@Override
	public void removeRow(int index) {
		
		matrix.remove(index);
		
	}
	
	//TODO Add out of bounds handling	
	@Override
	public void removeColumn(int index) {
		
		for ( int r = 0; r < this.getRows(); r++ ) {
			
			matrix.get(r).remove(index);
			
		}
		
	}
	
	@Override
	public float getElement(int row, int column) {
		
		return matrix.get(row).get(column);
		
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
		
		try {
			
			for (int i = 0; i < matrix.size(); i++ ) {
				
				for( int j = 0; j < matrix.get(i).size(); j++) {
					
					System.out.print ( matrix.get(i).get(j) + "\t" );
					
				}
				
				System.out.println();
				
			}
			
		}
		catch(Exception e) {
			
			System.out.println(e + " in display matrix");
			
		}
			
		}
	
	/**
	 * @param The matrix that you wish to compare. 
	 * @return the function returns a 1 if the matrixes are of the same size, length and width, but will return 0 if they are not. 
	 */
	public int compareSize ( Matrix matrixB )  {
		
		if ( this.getSize().equals( matrixB.getSize() ) ) {
			
			return 1;
			
		}
		else {
			
			return 0;
			
		}
		
		
	}
		
		

}
