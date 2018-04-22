package com.pasunuru.bhaskar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Provides a pool of resources 
 */
public class ResourceProvider {
	
	static int maxCount = 50;
	static int incrementBy = 5;
	static int initialCapacity = 10;
	
	static ResourceProvider resourceProvider;
	List<PooledObject> pooledResourceList;
	static int usedCount;
	
	private ResourceProvider()
	{
		pooledResourceList = new ArrayList<PooledObject>(initialCapacity);
		for (int i = 0; i < initialCapacity; i++) {
			PooledObject pooledObject = new PooledObject("PooledObject_"+ i);
			pooledResourceList.add(i, pooledObject);
		}
	}
	
	public static synchronized ResourceProvider getResourceProvider()
	{
		if (null != resourceProvider)
			return resourceProvider;
		else
			resourceProvider = new ResourceProvider();
			return resourceProvider;
		
	}
	
	public synchronized PooledObject getResource() throws ResourceNotAvailableException
	{
		PooledObject pooledObject;
		for (Iterator<PooledObject> poolIterator = pooledResourceList.iterator(); poolIterator.hasNext();) {
			pooledObject = (PooledObject) poolIterator.next();
			if(!pooledObject.isUsed())
			{
				pooledObject.setUsed(true);
				usedCount++;
				return pooledObject;
			}
		}
		if(pooledResourceList.size() <= maxCount)
		{
			List<PooledObject> newPooledResourceList = new ArrayList<PooledObject>(pooledResourceList.size() + incrementBy);
			newPooledResourceList.addAll(pooledResourceList);
			for (int i = pooledResourceList.size(); i < pooledResourceList.size() + incrementBy; i++) {
				pooledObject = new PooledObject("PooledObject_"+ i);
				newPooledResourceList.add(i, pooledObject);
			}
			pooledObject = newPooledResourceList.get(pooledResourceList.size());
			pooledObject.setUsed(true);
			usedCount= pooledResourceList.size() + 1;
			pooledResourceList = newPooledResourceList;
			return pooledObject;
		}
		throw new ResourceNotAvailableException("Resource not available");
	}
	
	public synchronized void releaseResource(PooledObject pooledObject)
	{
		pooledObject.setUsed(false);
		usedCount--;
	}
	
	public synchronized int getUsedCount()
	{
		return usedCount;
	}
}
