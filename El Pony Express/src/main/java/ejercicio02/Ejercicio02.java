package ejercicio02;

public class Ejercicio02 {

	public int jinetes(int[] estaciones) {
		
		int cantJinetes = 1;
		int cantMillas = 0;
		
		for(int i = 0; i < estaciones.length; i++) {
			
			cantMillas += estaciones[i];
			
			if(cantMillas > 100) {
				cantJinetes++;
				cantMillas = estaciones[i];
			}
		}
		return cantJinetes;
	}
	
//	public static void main(String[] args) {
//		
//		Ejercicio02 ej02 = new Ejercicio02();
//		
//		System.out.println(ej02.jinetes(new int[] {18, 15}));
//		System.out.println(ej02.jinetes(new int[] {43, 23, 40, 13}));
//		System.out.println(ej02.jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
//		System.out.println(ej02.jinetes(new int[] {51, 51, 51}));
//		System.out.println(ej02.jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
//	}
}
