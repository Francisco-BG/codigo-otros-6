public class Codigo6{ //cambio a Mayúscula primer caracter del nombre de la clase
	  public static void main(String[] args){ //Método main agregado
	    int[] n = new int[20]; //faltaba palabra reservada new

	    for (int i = 0; i < 20; i++) {//faltaba signo + para el incremento
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//se agregó out
	    }
	    /*faltaba ln en la siguiente línea*/
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());//faltaba cerrar paréntesis

	    int multiplo = (opcion == 1) ? 5 : 7; //inversión de los símbolos : y ?

	    for (int e : n) {  //se quitó each
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
        }
	      else {
	        System.out.print(e + " "); //cambio por system out
	      }
	    }
	  }
	}