package com.pasunuru.algorithems;

class StackX
   {
   private int maxSize;        
   private int[] stackArray;
   private int top;            

   public StackX(int s) {
      maxSize = s;     
      stackArray = new int[maxSize];  
      top = -1;                
      }

   public void push(int j) {
	  if (top +1 < maxSize){
		  top ++;
		  stackArray[top] = j;
	  }
   }

   public void pop() {
	   if (top > 0) {
		   top --;
		   stackArray[top] = -1;
	   }
      }

   public long peek() {
      return stackArray[top];
      }

   public boolean isEmpty() {
      return (top == -1);
      }

   public boolean isFull() {
      return (top == maxSize-1);
      }
   }  


class MyStack {
	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

			}
}
