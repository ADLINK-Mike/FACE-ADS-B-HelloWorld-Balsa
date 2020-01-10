package DM;

public class ATC_FunctionTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private static final long serialVersionUID = 1L;

    private long copyCache;

    public ATC_FunctionTypeSupport()
    {
        super("DM::ATC_Function",
              "",
              "",
              null,
              DM.ATC_FunctionMetaHolder.metaDescriptor);
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new ATC_FunctionDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new ATC_FunctionDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new ATC_FunctionDataReaderViewImpl(this);
    }
}
