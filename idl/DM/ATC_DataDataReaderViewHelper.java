package DM;

import org.opensplice.dds.dcps.Utilities;

public final class ATC_DataDataReaderViewHelper
{

    public static DM.ATC_DataDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataDataReaderView) {
            return (DM.ATC_DataDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.ATC_DataDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.ATC_DataDataReaderView) {
            return (DM.ATC_DataDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
