package line;

public class LineSub extends Point{

    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY)
    {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub (Point begin, Point end)
    {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString()
    {
        return "Line: (Point: (" + super.getX() + ',' + super.getY() + "), "
                + "Point: (" + this.end.getX() + ',' + this.end.getY() + ')';
    }

    public String getBegin() {
        return super.toString();
    }
    
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public Point getEnd() {
        return end;
    }
    
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX()
    {
        return super.getX();
    }

    public int getBeginY()
    {
        return super.getY();
    }
    
    public void setBeginXY(int x, int y)
    {
        super.setXY(x, y);
    }

    public void setEndXY(int x, int y)
    {
        this.end.setXY(x, y);
    }

    public int getLengthSub()
    {
        final double length = Math.sqrt(Math.pow((end.getX() - super.getX()), 2) + Math.pow((end.getY() - super.getY()), 2));
        return (int)length;
    }

    public double getGradientSub()
    {
        return Math.atan2((end.getY() - super.getY()), (end.getX() - super.getX()));
    }
}
