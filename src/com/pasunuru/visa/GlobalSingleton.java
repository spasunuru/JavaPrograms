package com.pasunuru.visa;


import java.util.List;

public class GlobalSingleton {
	static TransactionList tlist = null;
	public static synchronized TransactionList getList () {
		if (tlist != null) return tlist;
		tlist = new TransactionList();
		return tlist;
	}
}
