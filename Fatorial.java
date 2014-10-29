public class Fatorial	{
	
	public static void main(String[] args)	{
		System.out.println(CalcularFatorial(5));
		System.out.println("Hello, world!");
	}
	
	public static int CalcularFatorial(int n)	{
		int resultado = 1;

		for (int i = 2; i <= n; i++)	{
			resultado*= i;
		}

		return resultado;
	}

}