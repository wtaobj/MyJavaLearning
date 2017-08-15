package chapter03;

public class Triangle {
	double area;
	int height;
	int length;
	
	public static void main(String [] args){
		Triangle [] tri = new Triangle[4]; //clear an array,
		int x = 0;
		while(x<4){
			tri [x] = new Triangle();
			tri [x].height = (x + 1) * 2;
			tri [x].length = x + 4;
			tri [x].setArea();            // set means just do it, not to get it to a variable.
			System.out.print("triangle" +x+",area");
			System.out.println(" = " +tri[x].area);
			x=x+1;
		}
		int  y=x; //
		x= 27;
		Triangle t5 = tri[2];
		tri[2].area =343;
		System.out.print("y = " +y);
		System.out.println(", t5 area = "+ t5.area);
		
	}
	void setArea(){
		area = (height * length) / 2; // invoke instance variables directly.
	}
}
