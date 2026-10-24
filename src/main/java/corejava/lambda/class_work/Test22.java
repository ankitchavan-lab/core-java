package corejava.lambda.class_work;

interface pranav {
	void disp();

	void disp2();

	void disp3();

}

class Ankit {
	public pranav getPranav1() {
		// encapsulation

		return new pranav() {
			@Override
			public void disp() {
				// TODO Auto-generated method stub

			}

			@Override
			public void disp3() {
				// TODO Auto-generated method stub

			}

			@Override
			public void disp2() {
				// TODO Auto-generated method stub

			}

		};
	}

	public pranav getPranav2() {
		return new pranav() {

			@Override
			public void disp() {
				// TODO Auto-generated method stub

			}

			@Override
			public void disp2() {
				// TODO Auto-generated method stub

			}

			@Override
			public void disp3() {
				// TODO Auto-generated method stub

			}

		};

	}
}

public class Test22 {

	public static void main(String[] args) {
		Ankit a = new Ankit();
		pranav ref = a.getPranav1();// encapsulation
		ref.disp();
		ref.disp2();
		pranav ref3 = a.getPranav2();

	}

}
