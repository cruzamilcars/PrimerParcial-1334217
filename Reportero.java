public class Reportero {

	int[][] Tabla = new int [2][9];
	con=0;
	char[] games = new char [9];
	
	public void CalcGanador (int a, int b)
	{
		Tabla[1,con]= a;
		Tabla[1,con]= b;
		con= cont++;
	}
	public void CalCampeon() {
		int puntos1 =0;
		int puntos2 =0;
		int ax= puntos2-puntos1;
		for (int i=1; i<10; i++)
		{
		if (i>=6 && (i>=puntos1-puntos2) {
			println("gana1");
			}
		
			
		if(puntos2 >= 6 && (puntos2>= puntos2-puntos1) {
			println("gana2");
		}
		if (puntos1 ==7  && puntos2<puntos1)
		{

			println("gana1");
		}else {
			println("gana2");
		}
		}
	
	}
	}

