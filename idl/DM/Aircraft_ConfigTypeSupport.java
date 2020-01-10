package DM;

public class Aircraft_ConfigTypeSupport extends org.opensplice.dds.dcps.TypeSupportImpl implements DDS.TypeSupportOperations
{
    private static final long serialVersionUID = 1L;

    private long copyCache;

    public Aircraft_ConfigTypeSupport()
    {
        super("DM::Aircraft_Config",
              "",
              "",
              null,
              DM.Aircraft_ConfigMetaHolder.metaDescriptor);
    }

    @Override
    protected DDS.DataWriter create_datawriter ()
    {
        return new Aircraft_ConfigDataWriterImpl(this);
    }

    @Override
    protected DDS.DataReader create_datareader ()
    {
        return new Aircraft_ConfigDataReaderImpl(this);
    }

    @Override
    protected DDS.DataReaderView create_dataview ()
    {
        return new Aircraft_ConfigDataReaderViewImpl(this);
    }
}
