package DM;

public final class ATC_FunctionMetaHolder
{

    public static java.lang.String metaDescriptor[] = { "<MetaData version=\"1.0.0\"><TypeDef name=\"Tail_Number\"><String/></TypeDef><TypeDef name=\"Duration\"><Double/></TypeDef><TypeDef name=\"AircraftID\"><ULong/></TypeDef><Struct name=\"Aircraft\"><Member name=\"tailNumber\"><Type name=\"Tail_Number\"/></Member><Member name=\"aircraftID\"><Type name=\"AircraftID\"/></Member></Struct><Module name=\"DM\"><Struct name=\"l_WGS84\"><Member name=\"Altitude\"><Double/></Member><Member name=\"Latitude\"><Double/></Member><Member name=\"Longitude\"><Double/></Member></Struct><Struct name=\"EGI_Data\"><Member name=\"position\"><Type name=\"l_WGS84\"/></Member><Member name=\"time\"><Type name=\"::Duration\"/></Member></Struct><Struct name=\"ATC_Function\"><Member name=\"tailNumber\"><Type name=\"::Tail_Number\"/></Member><Member name=\"position\"><Type name=\"l_WGS84\"/></Member><Member name=\"time\"><Type name=\"::Duration\"/></Member><Member name=\"aircraftID\"><Type name=\"::AircraftID\"/></Member><Member name=\"sensor\"><Type name=\"EGI_Data\"/></Member><Member name=\"aircraft\"><Type name=\"::Aircraft\"/></Member></Struct></Module></MetaData>" };

    public ATC_FunctionMetaHolder()
    {
    }

}
