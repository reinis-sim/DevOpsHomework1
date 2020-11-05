import static org.junit.jupiter.api.Assertions.*;

class TestOne {

	@org.junit.jupiter.api.Test
	void test() {
		KilometersToMiles test = new KilometersToMiles();
		float output = test.mileUzKil(12);
		assertEquals(19.312164f, output);
	}

}
