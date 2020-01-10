package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_FunctionDataWriterHelper
{

    public static DM.ATC_FunctionDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataWriter) {
            return (DM.ATC_FunctionDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_FunctionDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataWriter) {
            return (DM.ATC_FunctionDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
