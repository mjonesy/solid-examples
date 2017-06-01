class runner {

	public static void main(String[] args) {
		RectangleRefactored rectangle = new RectangleRefactored(2, 3);
		RectangleDisplayer displayer = new RectangleDisplayer();

		displayer.displayArea(rectangle);
	}

}