package niha;
class ConstructorOverloading{
	private double length;
	private double width;
	private double depth;
	
	public ConstructorOverloading(){
		length = 1.0;
		width = 1.0;
		depth = 1.0;
	}
	public ConstructorOverloading(double side) {
		length = side;
		width = side;
		depth = side;
	}
	
	public ConstructorOverloading(double length,double width,double depth) {
		this.length =length;
		this.width = width;
		this.depth = depth;
		}
	
	public double volume() {
		return length * width * depth;
	}
	
	public static void main(String args[]) {
		ConstructorOverloading box1 = new ConstructorOverloading();
		ConstructorOverloading box2 = new ConstructorOverloading(6.0);
		ConstructorOverloading box3 = new ConstructorOverloading(6.0,4.0,9.0);
		
		
		System.out.println("Volume of the unit box:" + box1.volume());
		System.out.println("Volume of the box with each side of 5 unit is: " + box2.volume());
		System.out.println("Volume of the box with given height, width and depth is " + box3.volume());
	}
}
