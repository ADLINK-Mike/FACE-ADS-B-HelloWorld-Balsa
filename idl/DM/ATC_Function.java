package DM;

public final class ATC_Function {

    public java.lang.String tailNumber = "";
    public DM.l_WGS84 position = new DM.l_WGS84();
    public double time;
    public int aircraftID;
    public DM.EGI_Data sensor = new DM.EGI_Data();
    public Aircraft aircraft = new Aircraft();

    public ATC_Function() {
    }

    public ATC_Function(
        java.lang.String _tailNumber,
        DM.l_WGS84 _position,
        double _time,
        int _aircraftID,
        DM.EGI_Data _sensor,
        Aircraft _aircraft)
    {
        tailNumber = _tailNumber;
        position = _position;
        time = _time;
        aircraftID = _aircraftID;
        sensor = _sensor;
        aircraft = _aircraft;
    }

}
