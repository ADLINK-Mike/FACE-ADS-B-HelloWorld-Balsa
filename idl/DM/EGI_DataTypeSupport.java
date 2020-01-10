package DM;

public class EGI_DataTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private static final long serialVersionUID = 1L;

    private long copyCache;

    public EGI_DataTypeSupport()
    {
        super("DM::EGI_Data",
              "",
              "",
              null,
              DM.EGI_DataMetaHolder.metaDescriptor);
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new EGI_DataDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new EGI_DataDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new EGI_DataDataReaderViewImpl(this);
    }
}
