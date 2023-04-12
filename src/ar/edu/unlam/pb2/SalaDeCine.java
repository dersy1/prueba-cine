package ar.edu.unlam.pb2;

public class SalaDeCine {
	private boolean[][] asientos;
	private Integer filas=10;
	private Integer columnas=5;
	
	public SalaDeCine() {
		asientos=new boolean[filas][columnas];
	}
	
	

	public void ocuparButaca(Integer numeroFila, Integer numeroColumna) {
		if(asientos[numeroFila][numeroColumna]==false) {
		asientos[numeroFila][numeroColumna]=true;
		} else {System.out.print("EL ASIENTO YA ESTA OCUPADO");}
	}
	
	public Integer totalButacasOcupadas() {
		int total=0;
		for(int i=0; i<filas;i++) {
			for(int j=0; j<columnas;j++) {
				if(butacaOcupada(i,j)) {
				total+=1;	
				}}}
		return total;}
	
	public boolean butacaOcupada(Integer numeroFila, Integer numeroColumna) {
		return asientos[numeroFila][numeroColumna];
		
	}
	
	
	public boolean salaVacia() {
		Boolean vacio=true;
		for(int i=0; i<filas;i++) {
			for(int j=0; j<columnas;j++) {
				if(butacaOcupada(i,j)) {
				vacio=false;
				}}}
		return vacio;
		
	}
	
	public boolean salaLlena() {
		boolean lleno=false;
		for(int i=0; i<filas;i++) {
			for(int j=0; j<columnas;j++) {
				if(asientos[i][j]) {
				lleno=true;
				}else{lleno=false;}}}
		return lleno;
		
	}
	
	
	public boolean hayEspacioPara(Integer cantidadDePersonas) {
		boolean hayEspacio=false;
		int contador=0;
			for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
		        if (asientos[i][j]==false) { 
		            contador++;
		            if (contador == cantidadDePersonas) {
		                hayEspacio= true; 
		            }
		        } else {
		            contador = 0;}}}
		        
		
		return hayEspacio;
	}

}