package DM;

import org.opensplice.dds.dcps.Utilities;

public final class AircraftDataReaderViewHelper
{

    public static DM.AircraftDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftDataReaderView) {
            return (DM.AircraftDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.AircraftDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftDataReaderView) {
            return (DM.AircraftDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
