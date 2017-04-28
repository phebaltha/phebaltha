import com.senac.SimpleJava.Console;

public class Temperatura {
	double celsius, farenheit, temperaturaDobule;
	static String temperatura, copiaTemp;
	public void run() {
		
		temperatura = Console.readLine("Digite a temperatura: ");
		copiaTemp = temperatura;
		replaceTemp();
		temperaturaDobule = Double.parseDouble(temperatura);
		temperatura = copiaTemp;
		
		
		if ( achaTemperatura(temperatura) == 'F' || achaTemperatura(temperatura) == 'f' ) {
			double convertida = converteCelsius(temperaturaDobule);
			Console.println("Temperaturas: ", temperaturaDobule, "F ", convertida, "C ");
			}
		
		
		if ( achaTemperatura(temperatura) == 'C' || achaTemperatura(temperatura) == 'c' ) {
			double convertida = converteFarenheit(temperaturaDobule);
			Console.println("Temperaturas: ", temperaturaDobule, "C ", convertida, "F ");			
			}
		
	}
	
	
	
	private void replaceTemp() {		
		temperatura = temperatura.replace(",", ".");
		temperatura = temperatura.replace("C", "");
		temperatura = temperatura.replace("c", "");
		temperatura = temperatura.replace("F", "");
		temperatura = temperatura.replace("f", "");
		}
	
	private double converteCelsius(double temp) {
		return (temp - 32) / 1.8;
		}
	
	private double converteFarenheit(double temp) {
		return ( temp * 1.8) + 32;
		}
	
	private char achaTemperatura(String temp) {
		int tamanho = temp.length();
		return temp.charAt(tamanho-1);
		}
	}

