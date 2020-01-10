package DM;

import org.opensplice.dds.dcps.Utilities;

public final class Aircraft_ConfigDataReaderHelper
{

    public static DM.Aircraft_ConfigDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataReader) {
            return (DM.Aircraft_ConfigDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.Aircraft_ConfigDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataReader) {
            return (DM.Aircraft_ConfigDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
