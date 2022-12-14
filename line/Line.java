package line;

public class Line
{
    private Point begin;
    private Point end; 
    
    
    public Line(Point begin, Point end)
    {
        this.begin = begin;
        this.end = end;
    } 
    
    public Line(int beginX, int beginY, int endX, int endY)
    {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    
    public String toString()
    {
        return "Line: (Point: (" + getBegin().getX() + ',' + getBegin().getY() + "), "
                + "Point: (" + getEnd().getX() + ',' + getEnd().getY() + ')';
    }

    public Point getBegin() {
        return begin;
    }
    
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }
    
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX()
    {
        return this.begin.getX();
    }

    public int getBeginY()
    {
        return this.begin.getY();
    }
    
    public void setBeginXY(int x, int y)
    {
        this.begin.setXY(x, y);
    }

    public void setEndXY(int x, int y)
    {
        this.end.setXY(x, y);
    }

    public int getLength()
    {
        final double length = Math.sqrt(Math.pow((end.getX() - begin.getX()), 2) + Math.pow((end.getY() - begin.getY()), 2));
        return (int)length;
    }

    public double getGradient()
    {
        return Math.atan2((end.getY() - begin.getY()), (end.getX() - begin.getX()));
    }
}