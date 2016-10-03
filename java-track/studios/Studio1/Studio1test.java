package Studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Studio1test {

	@Test
	public void testPlayedGame() {
		BaseballPlayer bp = new BaseballPlayer("Shane", "Right-Handed", 12, 5, 5, 5);
		assertTrue(bp.getGames() == 5 && bp.getRbis() == 5 && bp.getRuns() == 5);
		bp.playedGame(3, 1);
		assertTrue(bp.getGames() == 6 && bp.getRbis() == 8 && bp.getRuns() == 6);
	}

	@Test
	public void testIsSquareFalse(){
		Rectangle r = new Rectangle(5, 12);
		assertTrue(r.isSquare() == false);
	}
	
	@Test
	public void testIsSquareTrue(){
		Rectangle r = new Rectangle(5, 5);
		assertTrue(r.isSquare() == true);
	}
	
	@Test
	public void testGetArea(){
		Rectangle r = new Rectangle(5, 12);
		assertTrue(r.getArea() == 60);
	}
	
	@Test
	public void testGetPerimeter(){
		Rectangle r = new Rectangle(5, 12);
		assertTrue(r.getPerimeter() == 34);
	}
	
	@Test
	public void testReciprocal(){
		Fraction f = new Fraction(4, 12);
		f.reciprocal();
		assertTrue("Problem with reciprocal()", f.getNumerator() == 12 && f.getDenominator() == 4);
	}
	
	@Test
	public void testSimplify(){
		Fraction f = new Fraction(4, 12);
		f.simplify();
		assertTrue("Problem with simplify()", f.getNumerator() == 1 && f.getDenominator() == 3);
	}
	
	@Test
	public void testAdd(){
		Fraction f = new Fraction(4, 5);
		Fraction f2 = new Fraction(4, 6);
		f.add(f2);
		assertTrue("Problem with add()", f.getNumerator() == 44 && f.getDenominator() == 30);
	}
	
	@Test
	public void testMultiply(){
		Fraction f = new Fraction(4, 5);
		Fraction f2 = new Fraction(4, 6);
		f.multiply(f2);
		assertTrue("Problem with reciprocal()", f.getNumerator() == 16 && f.getDenominator() == 30);
	}
}
