package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigst = varer[0];
		for (int i = 1; i < varer.length; i++) {
			if (varer[i].getPris() < billigst.getPris()) {
				billigst = varer[i];
			}
		}
		return billigst;
	}
	
	public static double totalPris(Vare[] varer) {		
		double sum = 0;
		for (int i = 0; i < varer.length; i++) {
			sum += varer[i].getPris();
		}
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] varenr = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			varenr[i] = varer[i].getVarenr();
		}
		return varenr;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] differanser = new double[varer.length - 1];
		for (int i = 0; i < differanser.length; i++) {
			differanser[i] = varer[i + 1].getPris() - varer[i].getPris();
		}
		return differanser;
	}
}
