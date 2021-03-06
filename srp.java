
/* 
	This class is pre-refactor, with calculating and displaying the area all in one class
	Attributes are made public, to not take up distracting space with getters and setters
**/

class Rectangle {
	public Integer length;
	public Integer height;
	
	public Integer area(Integer length, Integer height) {
		return length * height;
	}

	public void render(Rectangle rectangle) {
		Integer l = rectangle.length;
		Integer h = rectangle.height;
		Integer area = rectangle.area(l, h);
		
		System.out.println("This rectangle has an area of " + area.toString());

	}
}

class Runner {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.length = 2;
		rec1.height = 3;

		rec1.render(rec1);
	}
}