package com.pasunuru.bhaskar;


/**
 * PooledObject is the resource pooled
 * @author Bhaskaran_N
 *
 */
public class PooledObject {

	String resource;
	boolean used = false;
	
	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	PooledObject(String resource)
	{
		this.resource = resource;
	}
	
}
