package DM;

public interface ATC_FunctionDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            DM.ATC_Function instance_data);

    long register_instance_w_timestamp(
            DM.ATC_Function instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            DM.ATC_Function instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            DM.ATC_Function instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            DM.ATC_Function instance_data, 
            long handle);

    int write_w_timestamp(
            DM.ATC_Function instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            DM.ATC_Function instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            DM.ATC_Function instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            DM.ATC_Function instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            DM.ATC_Function instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            DM.ATC_FunctionHolder key_holder, 
            long handle);
    
    long lookup_instance(
            DM.ATC_Function instance_data);

}
