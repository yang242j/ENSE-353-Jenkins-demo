package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharacterArrayTest {

	private static CharacterArray charArrayClass;
	private static int count;

/* 
 * 	100% node coverage
 * 	TP:{[1, 2, 3, 5, 7, 2, 4!],	char[] = {'a'}; countOf('a') = 1;
 * 		[1, 2, 3, 6, 7, 2, 4!]}	char[] = {'a'}; countOf('b') = 0;
 */
	@DisplayName("100% node coverage Test_1")
	@Test
	void nodeCoverageTest1() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(1, count);
	}
	
	@DisplayName("100% node coverage Test_2")
	@Test
	void nodeCoverageTest2() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
/* 
 * 	100% edge coverage
 * 	TP:{[1, 2, 3, 5, 7, 2, 4!], char[] = {'a'}; countOf('a') = 1;
 * 	 	[1, 2, 3, 6, 7, 2, 4!], char[] = {'a'}; countOf('b') = 0;
 * 		[1, 2, 4!]} char[] = {}; countOf('a') = 0;
 */
	@DisplayName("100% edge coverage Test_1")
	@Test
	void edgeCoverageTest1() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(1, count);
	}
	
	@DisplayName("100% edge coverage Test_2")
	@Test
	void edgeCoverageTest2() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@DisplayName("100% edge coverage Test_3")
	@Test
	void edgeCoverageTest3() {
		charArrayClass = new CharacterArray(new Character[] {});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
		
/*
 *  100% edge-pair coverage
 *  TP:{[1, 2, 3, 5, 7, 2, 4!], char[] = {'a'}; countOf('a') = 1;
 *  	[1, 2, 3, 6, 7, 2, 4!], char[] = {'a'}; countOf('b') = 0;
 *  	[1, 2, 4!]} char[] = {}; countOf('a') = 0;
 */
	@DisplayName("100% edge-pair coverage Test_1")
	@Test
	void edgePairCoverageTest1() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(1, count);
	}
	
	@DisplayName("100% edge-pair coverage Test_2")
	@Test
	void edgePairCoverageTest2() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@DisplayName("100% edge-pair coverage Test_3")
	@Test
	void edgePairCoverageTest3() {
		charArrayClass = new CharacterArray(new Character[] {});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
/*
 *  all prime paths
 *  TP:{[1, 2, 4!], char[] = {}; countOf('a') = 0;
 *  	[2, 3, 5, 7, 2*], loop1: char[] = {'a', 'a'}; countOf('a') = 2;
 *  	[2, 3, 6, 7, 2*], loop2: char[] = {'a', 'a'}; countOf('b') = 0;
 *  	[3, 5, 7, 2, 3*], loop1: char[] = {'a', 'a'}; countOf('a') = 2;
 *  	[3, 5, 7, 2, 4!], char[] = {'a'}; countOf('a') = 1;
 *  	[3, 6, 7, 2, 3*], loop2: char[] = {'a', 'a'}; countOf('b') = 0;
 *  	[3, 6, 7, 2, 4!], char[] = {'a'}; countOf('b') = 0;
 *  	[5, 7, 2, 3, 5*], loop1: char[] = {'a', 'a'}; countOf('a') = 2;
 *  	[6, 7, 2, 3, 6*], loop2: char[] = {'a', 'a'}; countOf('b') = 0;
 *  	[7, 2, 3, 5, 7*], loop1: char[] = {'a', 'a'}; countOf('a') = 2;
 *  	[7, 2, 3, 6, 7*]} loop2: char[] = {'a', 'a'}; countOf('b') = 0;
 */
	@DisplayName("all prime paths Test_1")
	@Test
	void primePathsTest1() {
		charArrayClass = new CharacterArray(new Character[] {});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@DisplayName("all prime paths Test_2: loop1")
	@Test
	void primePathsTest2() {
		charArrayClass = new CharacterArray(new Character[] {'a', 'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(2, count);
	}
	
	@DisplayName("all prime paths Test_3: loop2")
	@Test
	void primePathsTest3() {
		charArrayClass = new CharacterArray(new Character[] {'a', 'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@DisplayName("all prime paths Test_4")
	@Test
	void primePathsTest4() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(1, count);
	}
	
	@DisplayName("all prime paths Test_5")
	@Test
	void primePathsTest5() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
/*
 *  Cyclomatic Complexity
 *  C = Edges-Nodes+2 = 8-7+2 = 3
 *  TP:{[1, 2, 3, 5, 7, 2, 4!], char[] = {'a'}; countOf('a') = 1; Baseline path
 *  	[1, 2, 4!], char[] = {}; countOf('a') = 0; 2nd path with change 1st decision node
 *  	[1, 2, 3, 6, 7, 2, 4!]} char[] = {'a'}; countOf('b') = 0; 3rd path with change 2nd decision node
 */
	@DisplayName("Cyclomatic Complexity Test_1")
	@Test
	void cyclomaticComplexityTest1() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(1, count);
	}
	
	@DisplayName("Cyclomatic Complexity Test_2")
	@Test
	void cyclomaticComplexityTest2() {
		charArrayClass = new CharacterArray(new Character[] {});
		char c = 'a';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@DisplayName("Cyclomatic Complexity Test_3")
	@Test
	void cyclomaticComplexityTest3() {
		charArrayClass = new CharacterArray(new Character[] {'a'});
		char c = 'b';
		count = charArrayClass.countOccurrenceOf(c);
		assertEquals(0, count);
	}
	
	@AfterEach
	public void printCount(){
		System.out.println(count);
    }
}
