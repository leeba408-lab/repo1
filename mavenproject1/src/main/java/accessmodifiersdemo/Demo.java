package accessmodifiersdemo;

public class Demo {
	//private int num=8999;
	public void print() {
		System.out.println("public acess modifier");
		//System.out.println(num);
	}

	public static void main(String[] args) {
		Demo dm=new Demo();
		dm.print();
		//System.out.println(dm.num);
		// TODO Auto-generated method stub

	}

}
