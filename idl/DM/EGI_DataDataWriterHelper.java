package DM;

import org.opensplice.dds.dcps.Utilities;

public final class EGI_DataDataWriterHelper
{

    public static DM.EGI_DataDataWriter narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataWriter) {
            return (DM.EGI_DataDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.EGI_DataDataWriter unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataWriter) {
            return (DM.EGI_DataDataWriter)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
