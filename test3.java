class Test{
	public void my_method(int num1,int num2){
		int result;
		result=num2/num1;
		System.out.println("Result of Division"+result);
	}
	public static void main(String args[]){
		Test app=new Test();
		app.my_method(0,10);
	}
}