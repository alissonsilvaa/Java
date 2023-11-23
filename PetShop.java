public class PetShop {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro(); 
			
			cachorro.nome = "Bidu";
			cachorro.idade = 1;
			cachorro.sexo = 'M';
			cachorro.raca = "Boxer";

	System.out.println("Nome: " + cachorro.nome);
	System.out.println("Idade: " + cachorro.idade);
	System.out.println("Sexo: " + cachorro.sexo);
	System.out.println("Raca: " + cachorro.raca);

		Cachorro cachorroDois = new Cachorro();

			
			cachorroDois.nome = "Lulu";
			cachorroDois.idade = 2;
			cachorroDois.sexo = 'F';
			cachorroDois.raca = "Poodle";		
		

	
	System.out.println("Nome: " + cachorroDois.nome);
	System.out.println("Idade: " + cachorroDois.idade);
	System.out.println("Sexo: " + cachorroDois.sexo);
	System.out.println("Raca: " + cachorroDois.raca);


	}



}