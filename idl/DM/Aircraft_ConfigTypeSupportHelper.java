package DM;

import org.opensplice.dds.dcps.Utilities;

public final class Aircraft_ConfigTypeSupportHelper
{

    public static DM.Aircraft_ConfigTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigTypeSupport) {
            return (DM.Aircraft_ConfigTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.Aircraft_ConfigTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigTypeSupport) {
            return (DM.Aircraft_ConfigTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
