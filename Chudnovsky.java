public class CaChudnovsky {
	
	public int factorial(int a){
		if (a==1) {
			return a;
		}else
			return a * factorial(a-1);
	}

	public int sumatoria(int numero) {
		if (numero == 1) { 
		return numero;
		}
		else 
			{
			 return numero + sumatoria(numero-1);
			}
	}
	public int Formula(int k)
	{
		if (k == 1) {
		return(factorial(6*k)*(545140134+13591409))/factorial(3*k)*factorial(k)*((-262537412640768000)(k*k));
			
		}else { 
			return ((factorial(6*k)*(545140134+13591409))/factorial(3*k)*factorial(k)^3*(-262537412640768000)^k) + Formula (k-1);
	}
	}        
    
}