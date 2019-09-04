package TestGame;
public class Line {
	Point start;
	Point  end;
	/**
	 * @param start
	 * @param end
	 */
	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	/**
	 * @return the start
	 */
	public Point getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Point start) {
		this.start = start;
	}
	/**
	 * @return the end
	 */
	public Point getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(Point end) {
		this.end = end;
	}
	

}
