class RectangleDisplayer {
	
	public void displayArea(RectangleRefactored rectangle) {
		RectangleGeometry calculator = new RectangleGeometry();
		Integer area = calculator.area(rectangle);

		System.out.println("This rectangle has an area of " + area.toString());

	}
}