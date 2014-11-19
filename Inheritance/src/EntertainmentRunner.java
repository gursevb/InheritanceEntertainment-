
public class EntertainmentRunner {

	public static void main(String[] args) {
		entertainment entertainment = new entertainment();
		Movie movie = new Movie();
		Play play = new Play();
		Aladdin aladdin = new Aladdin();
		Footloose footloose = new Footloose();
		
		entertainment.cost();
		entertainment.numberOfpeople();
		
		
		aladdin.cost();
		aladdin.numberOfpeople();
		
		footloose.cost();
		footloose.numberOfpeople();
	}

}
