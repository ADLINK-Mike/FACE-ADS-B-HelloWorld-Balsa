package DM;

import org.opensplice.dds.dcps.Utilities;

public final class AircraftDataWriterHelper
{

    public static DM.AircraftDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftDataWriter) {
            return (DM.AircraftDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.AircraftDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftDataWriter) {
            return (DM.AircraftDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
