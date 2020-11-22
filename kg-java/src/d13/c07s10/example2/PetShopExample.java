package d13.c07s10.example2;

public class PetShopExample {

	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal tiger = new Tiger();

		Animal[] animals = new Animal[3];
		animals[0] = baduk;
		animals[1] = nabi;
		animals[2] = tiger;

		for(Animal a : animals) {
			a.eat();

		}
		System.out.println();

		IPet[] pets = new IPet[3];
		pets[0] = (IPet)baduk;
		pets[1] = (IPet)nabi;
		pets[2] = new GoldFish();

		for(IPet p : pets) {
			p.play();

		}
		System.out.println();

		PetShop shop = new PetShop();
		shop.carePet((IPet)baduk);
		shop.carePet((Cat)nabi);
		shop.carePet(pets[2]);

	}

}
