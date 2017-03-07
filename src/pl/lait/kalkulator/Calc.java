package pl.lait.kalkulator;

import java.util.Scanner;
import pl.lait.kalkulator.Dzialania;

public class Calc {
	static Scanner wczytywanieZklawiatury = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dzialania przyklad2 = new Dzialania();
		
		System.out.print("Podaj pierwsz� liczb�: ");
		int a = 0;
		try{
		a = Integer.parseInt(wczytajZklawiatury());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("co� nie teges, podstawiam zero na wszelki");
			a = 0;
		}
		System.out.print("Podaj drug� liczb�: ");
		int b = 0;
		try {
			b = Integer.parseInt(wczytajZklawiatury());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("co� nie teges, podstawiam zero na wszelki");
			b = 0;
		}
		
		System.out.print("wybierz dzia�anie:\n" 
				+ "1 - dodawanie\n" 
				+ "2 - odejmowanie\n" 
				+ "3 - mno�enie\n"
				+ "4 - dzielenie\n"
				+ "Ka�da inna cyfra - koniec\n" 
				+ "wyb�r: ");
		
		int wybor;
		try {
			wybor = Integer.parseInt(wczytajZklawiatury());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			wybor = 0;
		}
		
		switch (wybor){
		case 1:
			System.out.println("Wybra�e� dodawanie (1), wynik: " + przyklad2.dodawanie(a, b));
			break;
		case 2:
			System.out.println("Wybra�e� odejmowanie (2), wynik: " + przyklad2.odejmowanie(a, b));
			break;
		case 3:
			System.out.println("Wybra�e� mno�enie (3), wynik: " + przyklad2.mnozenie(a, b));
			break;
		case 4:
			System.out.println("Wybra�e� dzielenie (4), wynik: " + przyklad2.dzielenie(a, b));
			break;
		default:
			System.out.println("Koniec");
		}
		
		
		
		
	}
	
	public static String wczytajZklawiatury() {
		return wczytywanieZklawiatury.nextLine().trim();
	}

}
