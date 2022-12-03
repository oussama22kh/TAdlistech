
public class Liste {
	private Element Info;
	private Liste Suiv;
	private Liste Nouv;
	public int length = 0;

	public static Liste liste_vide() {
		Liste L = new Liste();
		L.Info = null;
		L.Suiv = null;
		return L;
	}

	public Liste position(int p) {
		Liste lp = this;
		for (int i = 0; i < p - 1; i++) {
			lp = lp.Suiv;
		}
		return lp;
	}

	public Liste inserer( int p, Element e) {
		Liste pt;
		Nouv = new Liste();
		Nouv.Info = e;
		if (p == 0) {
			this.Info = e;
		} else {
			pt = this;
			for (int i = 0; i < p - 1; i++) {
				pt = pt.Suiv;
			}
			pt.Suiv = Nouv;
		}
		length++;
		return this;

	}

	public Liste supprimer(int p) {
		Liste node, node2;
		node = this;
		node2 = this.Suiv;
		if (this.position(p) == this) {
			return this.Suiv;
		} else {
			while (node2 != this.position(p)) {
				node = node.Suiv;
				node2 = node2.Suiv;
			}
			node.Suiv = node2.Suiv;
			length--;
			return this;
		}

	}

	public Liste Suivant() {
		return this.Suiv;
	}

	public Element acces(int p) {
		Liste pt = this;
		if (p != 0) {
			for (int i = 0; i <= p; i++) {
				pt = pt.Suiv;
			}
		}

		return pt.Info;
	}

	public boolean egale(Liste l2) {
		Liste l1 = this;
		if (l1.length != l2.length)
			return false;
		while (l1.Suiv != null || l2.Suiv != null) {
			if (l1.Info != l2.Info) {
				return false;
			} else {
				l1 = l1.Suiv;
				l2 = l2.Suiv;
			}
		}
		return true;
	}

	public boolean est_vide() {

		return this == null;
	}
}