package roman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RomanConverter {

	private enum RomanLiteral {
		I(1),
		IV(4),
		V(5),
		IX(9),
		X(10),
		XL(40),
		;
		
		int value;

		private RomanLiteral(int value) {
			this.value = value;
		}

		public static List<RomanLiteral> literalsDecrementOrder() {
			List<RomanLiteral> literals = Arrays.asList(RomanLiteral.values());
			Collections.reverse(literals);
			return literals;
		}
	}
	
	
	static class ResultatBuilder {
		int reste;
		StringBuilder resultat = new StringBuilder();
		
		public ResultatBuilder(int reste) {
			super();
			this.reste = reste;
		}

		public void append(String name) {
			resultat.append(name);
		}
		
		public String format() {
			return resultat.toString();
		}

		public void compute(RomanLiteral literal) {
			while (reste >= literal.value) {
				append(literal.name());
				reste -=  literal.value;
			}
		}
	}
	
	public String convert(int nombre) {
		ResultatBuilder resultat = new ResultatBuilder(nombre);

		for (RomanLiteral literal : RomanLiteral.literalsDecrementOrder()) {
			resultat.compute(literal);
		}

		return resultat.format();
	}

}
