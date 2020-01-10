package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_FunctionTypeSupportHelper
{

    public static DM.ATC_FunctionTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionTypeSupport) {
            return (DM.ATC_FunctionTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_FunctionTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionTypeSupport) {
            return (DM.ATC_FunctionTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
