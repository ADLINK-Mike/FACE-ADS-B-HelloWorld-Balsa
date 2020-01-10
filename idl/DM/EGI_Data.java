package DM;

public final class EGI_Data {

    public DM.l_WGS84 position = new DM.l_WGS84();
    public double time;

    public EGI_Data() {
    }

    public EGI_Data(
        DM.l_WGS84 _position,
        double _time)
    {
        position = _position;
        time = _time;
    }

}
