package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_FunctionDataReaderHelper
{

    public static DM.ATC_FunctionDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataReader) {
            return (DM.ATC_FunctionDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_FunctionDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataReader) {
            return (DM.ATC_FunctionDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
