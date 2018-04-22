package com.pasunuru.designpatterns;

public class VolatileSinglton{

private static volatile VolatileSinglton instance; //volatile variable 

private VolatileSinglton(){
	
}

public static VolatileSinglton getInstance(){
   if(instance == null){
       synchronized(VolatileSinglton.class){
            if(instance == null)
            	 instance = new VolatileSinglton();
            }

   }
   return instance;
}

public static void main(String[] args) {
	System.out.println(VolatileSinglton.getInstance());

}

}

