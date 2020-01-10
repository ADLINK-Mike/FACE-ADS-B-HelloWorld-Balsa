package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_FunctionDataReaderViewHelper
{

    public static DM.ATC_FunctionDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataReaderView) {
            return (DM.ATC_FunctionDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_FunctionDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_FunctionDataReaderView) {
            return (DM.ATC_FunctionDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
