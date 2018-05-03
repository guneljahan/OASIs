import java.util.Arrays;
import java.util.HashSet;

public class SimpleMethods {
	
  /** Compute the minimum of two values
   * @param a first value
   * @param b second value
   * @return a if a is lesser or equal to b, b otherwise
   */	
   public int getMin(int a, int b) {
		int min;
		
		if (a <= b) {
			min = a;
		} else {
			min = b;
		}
		
		assert (min < a);
		
		return min;
	}
	
   /**
    * Absolute value.
    * @param x number from which absolute value is requested
    * @return abs(x)
    */
	public int abs(final int x) {
        final int i = x >>> 31;
        int result = (x ^ (~i + 1)) + i;
        
        assert (Util.imply(x > 0, result == x));
        
        return result;
    }
	
	/** Add element to non-null set
	 * @param intSet set of integers
	 * @param element integer value to add to set
	 */
	public void addElementToSet(HashSet<Integer> intSet, int element) {
		if (intSet != null) {
			//instrumentation
			HashSet<Integer> old_intSet = new HashSet<Integer>(intSet);
			//instrumentation
			int old_element = element;
			
			intSet.add(element);
	
			assert (intSet.size() == old_intSet.size() + 1 && old_element == element);
		}
	}
	
	/** Increment the value of element in a non-null array at a given index
	 * @param intArray array of integers
	 * @param ind index at which the element will be incremented
	 */
	public void incrementNumberAtIndex(int[] intArray, int ind) {
		if (intArray != null && (ind >= 0 && ind < intArray.length)) {
			//instrumentation
			int[] old_array = Arrays.copyOf(intArray, intArray.length);
	
			intArray[ind] = intArray[ind] + 1;
			
			assert (!Arrays.equals(old_array, intArray));
		}
	}
}
