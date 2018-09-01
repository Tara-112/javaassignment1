package lab;

public interface IntStack {
abstract void push(int item);
abstract int pop();
}
class Stack implements IntStack
{
 int stck[];
  int top;
  Stack(int size){
	  stck=new int[size];
      top=-1;
  }
  @Override
  public void push(int item){
	  if(top==stck.length-1){
		  System.out.println("STACK IS FULL");
	  }
	  else 
		  stck[++top]=item;
  }
  @Override
	public int pop(){  
  if(top<0)
	  {
		  System.out.println("STACK UNDERFLOW");
		  return 0;
	  }
	  else
		  return stck[top--];
  }

}
class If{
	public static void main(String args[]){
		Stack mystack1=new Stack(5);
		Stack mystack2=new Stack(3);
		
	for(int i=0;i<5;i++)
			{
		mystack1.push(i);
			}
	for(int i=0;i<3;i++){
		mystack2.push(i);
	}
	System.out.println("ELEMENTS IN STACK1:");
	for(int i=0;i<5;i++){
		System.out.println(mystack1.pop());
	}
	System.out.println("ELEMENTS IN STACK2:");
	for(int i=0;i<3;i++){
	System.out.println(mystack2.pop());
	}
	
}
}