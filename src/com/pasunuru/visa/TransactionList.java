package com.pasunuru.visa;


import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TransactionList {
	public List<Transaction> list;

	public List<Transaction> createNewList(float[] amounts, String[] descs, String[] recepients) {
		this.list = new Vector<Transaction>();
		for (int i = 0; i <= amounts.length; i++) {
			Transaction tr = new Transaction();
			tr.setAmount(amounts[i]);
			tr.setDescription(descs[i]);
			tr.setRecepient(recepients[i]);
			this.list.add(tr);
		}
		return this.list;
	}

	public List<Transaction> createNewList() {
		this.list = new Vector<Transaction>();
		return this.list;
	}

	public void showTransactions() {
		List<Transaction> list = createNewList();
		populate(list);
		show(list);
	}

	public void populate(List<Transaction> list) {
		Transaction tr = new Transaction();
		tr.setAmount(12.4f);
		tr.setDescription("loan");
		tr.setRecepient("hari");
		list.add(tr);
		
		tr.setAmount(34.5f);
		tr.setDescription("emi");
		tr.setRecepient("krishna");
		list.add(tr);
	}

	public void show(List<Transaction> list) {
		Iterator<Transaction> itr = list.iterator();
		Transaction tr;
		while (itr.hasNext()) {
			tr = itr.next();
			System.out.println(tr.getAmount());
			System.out.println(tr.getRecepient());
			System.out.println(tr.getDescription());
		}
	}
	
	public static void main(String args[]) {
		TransactionList trlist = new TransactionList();
		trlist.showTransactions();
		
	}

}
