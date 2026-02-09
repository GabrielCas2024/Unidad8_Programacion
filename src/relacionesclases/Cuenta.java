package relacionesclases;

public class Cuenta {
	private String numCuenta;
	private double cantidad;
	
	public Cuenta(String numCuenta, double cantidad) {
		this.numCuenta=numCuenta;
		this.cantidad= cantidad;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
}
