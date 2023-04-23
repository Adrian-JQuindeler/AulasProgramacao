package Entidades;

public class Calculadora {
	public static double calculoMedia(double nota1, double nota2, double nota3) {
		double media = (nota1 + nota2 +nota3) / 3;
		return media;
	}
	public static double areaTrapesio(int B, int b, int h) {
		double area = (B + b)/2 * h;
		return area;
	}
	public static double areaRetangulo(int b, int h) {
		double area = b * h;
		return area;
	}
	public static double perimetroRetangulo(int b, int h) {
		double perimetro = b * 2 + h * 2;
		return perimetro;
	}
}