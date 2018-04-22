package com.pasunuru.bhaskar;


public class Consumer {
	
	public void useMyResource()
	{
		ResourceProvider myResourceProvider = ResourceProvider.getResourceProvider();
		try {
			PooledObject myPooledObject = myResourceProvider.getResource();
			System.out.println(myPooledObject.resource);
			System.out.println(myResourceProvider.usedCount);
			
			myResourceProvider.releaseResource(myPooledObject);
			
		} catch (ResourceNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
