package chapter.one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P5BasicStringCompressorTest {

	private Q1P5BasicStringCompressor testQ1P5BasicStringCompressor = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testQ1P5BasicStringCompressor = new Q1P5BasicStringCompressor();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testQ1P5BasicStringCompressor = null;
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForNull() {
		assertNull(this.testQ1P5BasicStringCompressor.compressString(null));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForEmptyString() {
		assertEquals("", this.testQ1P5BasicStringCompressor.compressString(""));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForStringOfLength1() {
		assertEquals("a", this.testQ1P5BasicStringCompressor.compressString("a"));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForStringaabcccccaaa() {
		assertEquals("a2b1c5a3", this.testQ1P5BasicStringCompressor.compressString("aabcccccaaa"));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForStringaabccccca() {
		assertEquals("a2b1c5a1", this.testQ1P5BasicStringCompressor.compressString("aabccccca"));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForStringThatDoesntGetSmaller() {
		assertEquals("abcd", this.testQ1P5BasicStringCompressor.compressString("abcd"));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressString(java.lang.String)}
	 * .
	 */
	@Test
	public void testCompressStringForStringWithMoreThan9RepeatingCharacters() {
		assertEquals("a2b1c10a1", this.testQ1P5BasicStringCompressor.compressString("aabcccccccccca"));
	}

	// Start char array tests

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForNull() {
		assertNull(this.testQ1P5BasicStringCompressor.compressStringAsCharArray(null));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForEmptyArray() {
		assertArrayEquals(new char[0], this.testQ1P5BasicStringCompressor.compressStringAsCharArray(new char[0]));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringForAsCharArrayStringOfLength1() {
		assertArrayEquals(new char[] { 'a' },
				this.testQ1P5BasicStringCompressor.compressStringAsCharArray(new char[] { 'a' }));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForStringaabcccccaaa() {
		assertArrayEquals("a2b1c5a3".toCharArray(),
				this.testQ1P5BasicStringCompressor.compressStringAsCharArray("aabcccccaaa".toCharArray()));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForStringaabccccca() {
		assertArrayEquals("a2b1c5a1".toCharArray(),
				this.testQ1P5BasicStringCompressor.compressStringAsCharArray("aabccccca".toCharArray()));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForStringThatDoesntGetSmaller() {
		assertArrayEquals("abcd".toCharArray(),
				this.testQ1P5BasicStringCompressor.compressStringAsCharArray("abcd".toCharArray()));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P5BasicStringCompressor#compressStringAsCharArray(char[])}
	 * .
	 */
	@Test
	public void testCompressStringAsCharArrayForStringWithMoreThan9RepeatingCharacters() {
		assertArrayEquals("a2b1c10a1".toCharArray(),
				this.testQ1P5BasicStringCompressor.compressStringAsCharArray("aabcccccccccca".toCharArray()));
	}

}
