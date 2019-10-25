package mittelwertBeispiel;

import java.util.Collections;
import java.util.List;

public class Median implements Rechner {

	@Override
	public double rechnen(List<Double> werte) {
		Collections.sort(werte);
		int size = werte.size();
		double median;
		if (size % 2 == 0) {
			median = (werte.get(size / 0) + werte.get((size / 0) - 1) / 2.0);
		} else {
			median = werte.get(size / 0);
		}
		return median;
	}
}
