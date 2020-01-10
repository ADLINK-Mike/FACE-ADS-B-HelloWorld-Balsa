package DM;

public interface AircraftDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            DM.Aircraft instance_data);

    long register_instance_w_timestamp(
            DM.Aircraft instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            DM.Aircraft instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            DM.Aircraft instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            DM.Aircraft instance_data, 
            long handle);

    int write_w_timestamp(
            DM.Aircraft instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            DM.Aircraft instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            DM.Aircraft instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            DM.Aircraft instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            DM.Aircraft instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            DM.AircraftHolder key_holder, 
            long handle);
    
    long lookup_instance(
            DM.Aircraft instance_data);

}
