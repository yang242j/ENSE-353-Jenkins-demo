package chapter7_part1;

/**
 * 
 * @author Yangjing Kang
 *
 *Calculates the number of occurrence of a character in an array of characters.
 */
public class CharacterArray {
	
	private Character[] charArray;

	public CharacterArray(Character[] charArray) {
		this.charArray = charArray;
	}
	
	// Method that return count of the given character within the character array
	public int countOccurrenceOf(Character c) {
		int count = 0;
		for (Character character : charArray) {
			// checking character in array 
            if (character == c) 
            	count++; 
		}
		return count;
	}

}
