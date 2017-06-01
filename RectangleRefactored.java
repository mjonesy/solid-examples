class RectangleRefactored {
	
	private Integer length;
	private Integer height;

	public Integer getLength() {
		return this.length;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public RectangleRefactored(Integer length, Integer height) {
		this.length = length;
		this.height = height;
	}
}