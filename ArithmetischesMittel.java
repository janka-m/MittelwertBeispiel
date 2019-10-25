package mittelwertBeispiel;

import java.util.List;

public class ArithmetischesMittel implements Rechner {

	@Override
	public double rechnen(List<Double> werte) {
		double erg = 0.0;

		for (int i = 0; i < werte.size(); i++) {
			erg += werte.get(i);

		}
		
		return erg / werte.size();
	}

}
