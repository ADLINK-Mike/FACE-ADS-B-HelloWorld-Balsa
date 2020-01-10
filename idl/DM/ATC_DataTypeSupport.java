package DM;

public class ATC_DataTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private static final long serialVersionUID = 1L;

    private long copyCache;

    public ATC_DataTypeSupport()
    {
        super("DM::ATC_Data",
              "",
              "",
              null,
              DM.ATC_DataMetaHolder.metaDescriptor);
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new ATC_DataDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new ATC_DataDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new ATC_DataDataReaderViewImpl(this);
    }
}
