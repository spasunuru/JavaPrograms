package com.pasunuru.scjp;

public class Tester6 {

	private static Ab a;

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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		a = new SubB2();
	}

}
