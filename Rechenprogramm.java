package mittelwertBeispiel;

import java.util.List;



public class Rechenprogramm {
	Rechner rechner;
	List<Double> werte;

	public Rechenprogramm(List<Double> werte) {
		this.werte = werte;
		rechner = new Median();
	}

	public void setRechner(Rechner rechner) {
		this.rechner = rechner;
	}

	public void tuWas() {
		System.out.println(rechner.rechnen(werte));

	}

}
