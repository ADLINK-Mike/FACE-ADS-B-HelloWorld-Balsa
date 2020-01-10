package DM;

import org.opensplice.dds.dcps.Utilities;

public final class Aircraft_ConfigDataWriterHelper
{

    public static DM.Aircraft_ConfigDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataWriter) {
            return (DM.Aircraft_ConfigDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.Aircraft_ConfigDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.Aircraft_ConfigDataWriter) {
            return (DM.Aircraft_ConfigDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
