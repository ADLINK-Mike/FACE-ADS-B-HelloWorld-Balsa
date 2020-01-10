package DM;

import org.opensplice.dds.dcps.Utilities;

public final class EGI_DataTypeSupportHelper
{

    public static DM.EGI_DataTypeSupport narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataTypeSupport) {
            return (DM.EGI_DataTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static DM.EGI_DataTypeSupport unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof DM.EGI_DataTypeSupport) {
            return (DM.EGI_DataTypeSupport)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
