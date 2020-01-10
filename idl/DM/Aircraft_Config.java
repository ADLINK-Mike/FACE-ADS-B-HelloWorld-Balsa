package DM;

public final class Aircraft_Config {

    public int aircraftID;
    public java.lang.String tailNumber = "";

    public Aircraft_Config() {
    }

    public Aircraft_Config(
        int _aircraftID,
        java.lang.String _tailNumber)
    {
        aircraftID = _aircraftID;
        tailNumber = _tailNumber;
    }

}
