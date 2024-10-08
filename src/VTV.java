import javax.swing.JOptionPane;

public class VTV {
	private String nombre;
	private String auto;
	private String modelo;
	private String patente;
	private String frenos;
	private String motor;
	private String suspension;
	String lista;
	
	
	
	public VTV(String nombre,String auto,String modelo, String patente , String lista){
	this.nombre=nombre;
	this.auto=auto;
	this.modelo=modelo;
	this.patente=patente;
	this.lista=lista;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		while (nombre.isEmpty()) {
			nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre y apellido del titular del vehiculo:");
		}
		lista="Conclusiones de VTV: \n" + "Titular: " + nombre + "\n";
		this.nombre=nombre;
	}
	
	
	public String getAuto() {
		return auto;
	}
	
	public void setAuto (String auto) {
		while (auto.isEmpty()) {
			auto=JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
		}
		lista= lista + "Especificaciones del vehiculo: \n" + "Marca: " + auto + "\n";
		this.auto=auto;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		while (modelo.isEmpty()) {
			modelo=JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
		}
		lista=lista + "Modelo: "+ modelo + "\n";
		this.modelo=modelo;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente (String patente) {
		while (patente.isEmpty()) {
			patente=JOptionPane.showInputDialog("Ingrese la patente del vehiculo");
		}
		lista=lista + "Patente: " + patente + "\n"; 
		this.patente=patente;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor (String motor) {
		String numero[]={
				"1","2","3","4","5","6","7","8","9","10"
		};
		
		motor=(String)JOptionPane.showInputDialog(null, "Del 1 al 10 en que estado esta el motor:", motor, 0, null, numero, numero[0]);
		lista= lista + "Puntaje: \n" + "Motor: "+motor+"/10 \n";
		this.motor=motor;
	}
	
	public String getFrenos() {
		return motor;
	}
	
	public void setFrenos (String frenos) {
		String numero[]={
				"1","2","3","4","5","6","7","8","9","10"
		};
		
		frenos=(String)JOptionPane.showInputDialog(null, "Del 1 al 10 en que estado estan los frenos:", frenos, 0, null, numero, numero[0]);
		lista= lista + "Frenos: "+frenos+"/10 \n";

	this.frenos=frenos;	
	}
	
	public void setSuspension (String suspension) {
		String numero[]={
				"1","2","3","4","5","6","7","8","9","10"
		};
		
		suspension=(String)JOptionPane.showInputDialog(null, "Del 1 al 10 en que estado esta la suspension:", suspension, 0, null, numero, numero[0]);
		lista= lista + "Suspension: "+suspension+"/10 \n";

	this.suspension=suspension;	
	}
	
	
	
}



