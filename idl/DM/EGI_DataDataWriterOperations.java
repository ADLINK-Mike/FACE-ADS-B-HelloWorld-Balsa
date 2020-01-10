package DM;

public interface EGI_DataDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            DM.EGI_Data instance_data);

    long register_instance_w_timestamp(
            DM.EGI_Data instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            DM.EGI_Data instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            DM.EGI_Data instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            DM.EGI_Data instance_data, 
            long handle);

    int write_w_timestamp(
            DM.EGI_Data instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            DM.EGI_Data instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            DM.EGI_Data instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            DM.EGI_Data instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            DM.EGI_Data instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            DM.EGI_DataHolder key_holder, 
            long handle);
    
    long lookup_instance(
            DM.EGI_Data instance_data);

}
