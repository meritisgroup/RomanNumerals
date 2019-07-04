package roman;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanConverterShould {
	
	@Test
	public void convert_1_into_I() {
		// GIVEN
		int input = 1;
		String expected = "I";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_2_into_II() {
		// GIVEN
		int input = 2;
		String expected = "II";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_3_into_III() {
		// GIVEN
		int input = 3;
		String expected = "III";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_10_into_X() {
		// GIVEN
		int input = 10;
		String expected = "X";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void convert_20_into_XX() {
		// GIVEN
		int input = 20;
		String expected = "XX";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_30_into_XXX() {
		// GIVEN
		int input = 30;
		String expected = "XXX";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void convert_11_into_XI() {
		// GIVEN
		int input = 11;
		String expected = "XI";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void convert_5_into_V() {
		// GIVEN
		int input = 5;
		String expected = "V";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_4_into_IV() {
		// GIVEN
		int input = 4;
		String expected = "IV";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_9_into_IX() {
		// GIVEN
		int input = 9;
		String expected = "IX";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void convert_40_into_XL() {
		// GIVEN
		int input = 40;
		String expected = "XL";
		RomanConverter converter = new RomanConverter();		
		
		// WHEN
		String result = converter.convert(input);
		
		// THEN
		assertThat(result).isEqualTo(expected);
	}
	
	
	
}
