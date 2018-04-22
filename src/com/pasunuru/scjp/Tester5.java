package com.pasunuru.scjp;

	class Ab {
	void foo() throws Exception {
		throw new Exception();
	}
	}

	class SubB2 extends Ab {
		void foo() {
			System.out.println("B ");
		}
	}

	public class Tester5 {
		
	}
}
