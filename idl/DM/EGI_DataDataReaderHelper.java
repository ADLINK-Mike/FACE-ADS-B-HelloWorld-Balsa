package DM;

import org.opensplice.dds.dcps.Utilities;

public final class EGI_DataDataReaderHelper
{

    public static DM.EGI_DataDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataReader) {
            return (DM.EGI_DataDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.EGI_DataDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataReader) {
            return (DM.EGI_DataDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
