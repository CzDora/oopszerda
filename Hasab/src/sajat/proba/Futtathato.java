package sajat.proba;

import sajat.*;

public class Futtathato {

	public static void main(String[] args) {
		
		Henger henger1 = new Henger(1, 2);
		//Hasab henger2 = new Henger(3, 4);
		
		System.out.println(henger1);
		System.out.println(henger1.getTerfogat());
		
		Teglatest teglatest1 = new Teglatest(5, 6, 7);
		System.out.println(teglatest1);
		System.out.println(teglatest1.getTerfogat());
		if (henger1.NagyobbTerfogatue(teglatest1)) {
			System.out.println("henger1 nagyobb terfogatu");
		} else {
			System.out.println("a teglatest1 nagyobb terfogatu vagy egyenloek");

		}

	}

}
