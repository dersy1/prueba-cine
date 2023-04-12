package ar.edu.unlam.pb2;

public class Cines {

	public static void main(String[] args) {
		SalaDeCine Hoyts = new SalaDeCine();
		System.out.println(Hoyts.salaVacia());
		Hoyts.ocuparButaca(2, 2);
		System.out.println(Hoyts.salaVacia());
		Hoyts.ocuparButaca(2, 3);
		Hoyts.ocuparButaca(2, 4);
		System.out.println(Hoyts.butacaOcupada(2, 2));
		Hoyts.ocuparButaca(2, 4);

		System.out.println(Hoyts.totalButacasOcupadas());

		System.out.println(Hoyts.salaLlena());
		Hoyts.ocuparButaca(2, 0);

		System.out.println(Hoyts.hayEspacioPara(3));
		System.out.println(Hoyts.hayEspacioPara(50));

//		Hoyts.ocuparButaca(1, 1);
//		Hoyts.ocuparButaca(1, 2);
//		Hoyts.ocuparButaca(2, 1);
//		Hoyts.ocuparButaca(2, 2);
//		
//		System.out.println(Hoyts.salaLlena());

	}

}
