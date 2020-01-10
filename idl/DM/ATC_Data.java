package DM;

public final class ATC_Data {

    public int aircraftID;
    public java.lang.String tailNumber = "";
    public DM.l_WGS84 position = new DM.l_WGS84();
    public double time;

    public ATC_Data() {
    }

    public ATC_Data(
        int _aircraftID,
        java.lang.String _tailNumber,
        DM.l_WGS84 _position,
        double _time)
    {
        aircraftID = _aircraftID;
        tailNumber = _tailNumber;
        position = _position;
        time = _time;
    }

}
