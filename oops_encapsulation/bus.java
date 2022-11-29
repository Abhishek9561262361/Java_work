class bus
{
    String busName;
    String busArea;
    private int  busNumber;
    int distance;
    bus(String bn,String ba,int busn,int dis){
        this.busName=bn;
        this.busArea=ba;
        this.busNumber=busn;
        this.distance=dis;
    }
    public int getbusNumber()
    {
        return busNumber;
    }
    public void setbusNumber(int busn)
    {
        this.busNumber=busn;
    }
    public void display()
    {
        System.out.println("the name of bus is "+busName);
        System.out.println("the area of bus is "+busArea);
        System.out.println("the Number of bus is "+busNumber);
        System.out.println("the distance of bus is "+distance);
    }
}