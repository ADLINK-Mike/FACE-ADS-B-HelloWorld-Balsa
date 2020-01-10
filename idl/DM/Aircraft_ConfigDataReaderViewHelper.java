package DM;

import org.opensplice.dds.dcps.Utilities;

public final class Aircraft_ConfigDataReaderViewHelper
{

    public static DM.Aircraft_ConfigDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataReaderView) {
            return (DM.Aircraft_ConfigDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.Aircraft_ConfigDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataReaderView) {
            return (DM.Aircraft_ConfigDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
