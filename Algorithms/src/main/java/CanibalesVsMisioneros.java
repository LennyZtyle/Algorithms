
class Node {
	int ci, mi, cd, md, numHijo;
	boolean boteLado;
	Node hijo1, hijo2, hijo3, hijo4, hijo5, padre;

	public Node(int cI, int mI, int cD, int mD, boolean bote, Node p, int numHijoC) {
		ci = cI;
		mi = mI;
		cd = cD;
		md = mD;
		boteLado = bote;
		padre = p;
		numHijo = numHijoC;
	}

	public boolean verificarCaminos() {
		System.out.println(this);
		if (ci == 0 && mi == 0 && cd == 3 && md == 3) {
			Node p = this;
			while(p.padre!=null){
				System.out.println(p.numHijo);
				p=this.padre;
			}
			System.out.println("finish");
			return true;
		}

		// two c's on the boat
		if (this.numHijo != 1) {
			if (boteLado && cd >= 2) {
				scenarioOne(boteLado);
			} else if (!boteLado && ci >= 2) {
				scenarioOne(boteLado);
			}
		}
		// two m's on the boat
		if (this.numHijo != 2) {
			if (boteLado && md >= 2) {
				scenarioTwo(boteLado);
			} else if (!boteLado && mi >= 2) {
				scenarioTwo(boteLado);
			}
		}
		// one c on the boat
		if (this.numHijo != 3) {
			if (boteLado && cd >= 1) {
				scenarioThree(boteLado);
			} else if (!boteLado && ci >= 1) {
				scenarioThree(boteLado);
			}
		}
		return false;
	}

	private boolean validateMvsC() {
		if(mi<ci||md<cd){
			return false;
		}else return true;
		
	}

	private void scenarioThree(boolean lado) {
		if (lado) {
			cd--;
			ci++;
		} else {
			cd++;
			ci--;
		}
		if (validateMvsC()) {
			hijo3 = new Node(ci, mi, cd, md, !lado, this, 3);
			hijo3.verificarCaminos();
		}
	}

	private void scenarioTwo(boolean lado) {
		System.out.println("CASO 2");

		if (!lado) {
			mi = mi - 2;
			md = md + 2;
		} else if (lado) {
			mi = mi + 2;
			md = md - 2;
		}
		if (validateMvsC()) {
			hijo2 = new Node(ci, mi, cd, md, !lado, this, 2);
			hijo2.verificarCaminos();
		}
	}

	private void scenarioOne(boolean lado) {
		System.out.println("CASO UNO");
		if (!lado) {
			ci = ci - 2;
			cd = cd + 2;
		} else if (lado) {
			ci = ci + 2;
			cd = cd - 2;
		}
		if (validateMvsC()) {
			hijo1 = new Node(ci, mi, cd, md, !lado, this, 1);
			hijo1.verificarCaminos();
		}
	}

	public String toString() {
		String result = ci + "" + mi + "" + cd + "" + md + "" + boteLado + " numero:" + numHijo;
		return result;
	}
}

public class CanibalesVsMisioneros {

	public static void main(String[] args) {
		Node root = new Node(3, 3, 0, 0, false, null, 0);
		root.verificarCaminos();

	}

}
