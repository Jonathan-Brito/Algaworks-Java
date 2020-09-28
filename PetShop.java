public class PetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro ( );
		
		//Cachorro meuCachorro = new Cachorro ( );
		
		cachorro.nome = "Bidu";
		cachorro.idade = 1;
		cachorro.raca = "Boxer";
		cachorro.sexo = 'M';
		
		//meuCachorro.nome = "Cachorro Louco";
		//meuCachorro.idade = 3;
		//meuCachorro.raca = "Hotwailler";
		//meuCachorro.sexo = 'M';
		
		System.out.println ("Nome: " + cachorro.nome);
		System.out.println ("Idade: " + cachorro.idade);
		System.out.println ("Raça: " + cachorro.raca);
		System.out.println ("Sexo: " + cachorro.sexo);
		
		
		//System.out.println ("Nome: " + meuCachorro.nome);
		//System.out.println ("Idade: " + meuCachorro.idade);
		//System.out.println ("Raça: " + meuCachorro.raca);
		//System.out.println ("Sexo: " + meuCachorro.sexo);
		
		

	}

}
