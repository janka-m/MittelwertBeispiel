package mittelwertBeispiel;

import java.util.List;

public class GeometrischesMittel implements Rechner {

	@Override
	public double rechnen(List<Double> werte) {
		double erg = 1.0;

		for (int i = 0; i < werte.size(); i++) {
			erg *= werte.get(i);
		}

		erg = Math.pow(erg, 1.0 / werte.size());
		return erg;
	}

}
