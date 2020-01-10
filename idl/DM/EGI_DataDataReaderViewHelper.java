package DM;

import org.opensplice.dds.dcps.Utilities;

public final class EGI_DataDataReaderViewHelper
{

    public static DM.EGI_DataDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataReaderView) {
            return (DM.EGI_DataDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.EGI_DataDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataDataReaderView) {
            return (DM.EGI_DataDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
