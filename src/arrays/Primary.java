package arrays;

class Primary{
	public static void main (String args[]) {
		Responsibility r = new Responsibility() {
			@Override
			void bussiness() {
				System.out.println("Handle the bussiness");
			}
			void personallife() {
				System.out.println("personallife is also important");
			}
		};
		r.family();
		r.bussiness();
		r.Entertainment();
		r.personallife();
	}
}

