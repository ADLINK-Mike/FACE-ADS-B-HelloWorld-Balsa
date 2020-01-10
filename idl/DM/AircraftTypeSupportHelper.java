package DM;

import org.opensplice.dds.dcps.Utilities;

public final class AircraftTypeSupportHelper
{

    public static DM.AircraftTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftTypeSupport) {
            return (DM.AircraftTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.AircraftTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.AircraftTypeSupport) {
            return (DM.AircraftTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
