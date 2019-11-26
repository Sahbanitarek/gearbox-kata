package electrics.industries;

public class Gearbox {

	private int s = 0;
	private int e = 0;

	public void doit(int i) {
		if (s < 0) {
			// do nothing!
			e = i;
		} else if (s >= 0 && s < 1) {
			s++;
		}

		else if ((s >= 1) && (s <= 5)) {

			if (i > 2000)
				s++;
			else
				s--;
		}
		e = i;
	}
}
// Pour le code soit lisible il faut que la méthode soit petite (max 50 lignes)
// les conditions sont comprehensibles
// le code doit etre homogène (regles de nomages et decoupage des packages)
// Le code doit respecter le principe SOLID (Single responsibility principle, Open close principle, Liskov principle, Interface segregation principle, Dependency inversion principle)
