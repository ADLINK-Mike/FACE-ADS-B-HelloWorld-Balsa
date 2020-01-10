package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_DataTypeSupportHelper
{

    public static DM.ATC_DataTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataTypeSupport) {
            return (DM.ATC_DataTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_DataTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataTypeSupport) {
            return (DM.ATC_DataTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
