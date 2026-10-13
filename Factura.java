import java.util.Scanner;

public class Factura {

	static final double IVA = 0.21;
	static final String PROPIETARIO = "IZialexI";

	// Funciones: calcularDescuento, aplicarIVA, pedirDecimal
	static double calcularDescuento (double total, boolean socio) {
		double num = 0;
		if (total > 100) {
			num = total * 0.10;
		}
		if (socio) {
			num += total * 0.05;
		}
		return num;
	}
	static double aplicarIVA (double total, double IVA) {
		total *= (1 + IVA);
		return total;
	}
	static double pedirDecimal (String message, Scanner sc) {
		System.out.print(message);
		double num = sc.nextDouble();
		return num;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("=== FACTURA de " + PROPIETARIO + " ===");
	System.out.print("Producto: ");
	String producto = sc.nextLine();
	
	// Función pedirDecimal para pedir precio
	double precio = pedirDecimal("Precio unitario: ", sc);

	// Uso pedirDecimal, pero en producción, no es recomendable casteo aquí
	int cantidad = (int) pedirDecimal("Cantidad: ", sc);
	System.out.print("Es cliente socio (s/n): ");

	// Prefiero char a String para trabajar con un solo caracter y pasar a boolean
	char esSocio = sc.next().charAt(0);
	boolean socio = false;
	if (esSocio == 's') {
		socio = true;
	}
	double total = precio * cantidad;

	System.out.println("Producto: " + producto);
	System.out.printf("Base: %.2f euros%n", total);

	// Función calcularDescuento para calcular el descuento
	double descuento = calcularDescuento(total, socio);
	total -= descuento;

	// Función aplicarIVA para aplicar IVA
	total = aplicarIVA(total, IVA);
	System.out.printf("Descuento: %.2f euros%n", descuento);
	System.out.printf("Total con IVA: %.2f euros%n", total);
	}
}
