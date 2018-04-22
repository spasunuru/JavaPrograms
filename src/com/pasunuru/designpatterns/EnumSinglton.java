package com.pasunuru.designpatterns;

public class EnumSinglton {

	public enum Connection {
		Instance;
		private String conn;

		private Connection() {
			this.conn = new String("Sreekanth");
		}

		public String getConnection() {
			return conn;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Connection.Instance.getConnection());

	}
}