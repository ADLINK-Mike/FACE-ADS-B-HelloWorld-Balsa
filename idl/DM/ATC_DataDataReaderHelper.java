package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_DataDataReaderHelper
{

    public static DM.ATC_DataDataReader narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataDataReader) {
            return (DM.ATC_DataDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_DataDataReader unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataDataReader) {
            return (DM.ATC_DataDataReader)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
