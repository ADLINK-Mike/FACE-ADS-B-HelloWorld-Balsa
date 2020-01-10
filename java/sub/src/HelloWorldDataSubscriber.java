/*
 *                         Vortex OpenSplice
 *
 *   This software and documentation are Copyright 2006 to 2019 ADLINK
 *   Technology Limited, its affiliated companies and licensors. All rights
 *   reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

import FACE.TS;

import FACE.CONNECTION_DIRECTION_TYPE;
import FACE.CONNECTION_DIRECTION_TYPEHolder;
import FACE.MESSAGING_PATTERN_TYPE;
import FACE.RETURN_CODE_TYPE;
import FACE.RETURN_CODE_TYPEHolder;
import HelloWorldData.MsgHolder;

public class HelloWorldDataSubscriber {

    public static void main(String[] args) {
        RETURN_CODE_TYPEHolder  return_code = new RETURN_CODE_TYPEHolder(FACE.RETURN_CODE_TYPE.NO_ERROR);

        String configuration = "dds_face_config.xml";
        TS.Initialize(configuration, return_code);
        if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
            System.out.println("Error: " + return_code.value.value());
        } else {
            String connection_name = "HelloWorldSub";
            MESSAGING_PATTERN_TYPE pattern = MESSAGING_PATTERN_TYPE.PUB_SUB;
            us.opengroup.FACE.LongHolder connection_id = new us.opengroup.FACE.LongHolder(1);
            CONNECTION_DIRECTION_TYPEHolder connection_direction = new CONNECTION_DIRECTION_TYPEHolder(CONNECTION_DIRECTION_TYPE.DESTINATION);
            us.opengroup.FACE.IntHolder max_message_size = new us.opengroup.FACE.IntHolder(0);
            long timeout = 0;
            TS.Create_Connection(connection_name, pattern, connection_id, connection_direction, max_message_size, timeout, return_code);
            if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
                System.out.println("Create_Connection Error: " + return_code.value.value());
            } else {
                MsgHolder message = new MsgHolder();
                us.opengroup.FACE.LongHolder transaction_id = new us.opengroup.FACE.LongHolder(0);
                us.opengroup.FACE.LongHolder message_type_id = new us.opengroup.FACE.LongHolder(0);
                int message_size = 0;
                timeout = 30000000000L;

                do {
                    TS.Receive_Message(connection_id.value, timeout, transaction_id, message, message_size, return_code);
                    if (return_code.value == RETURN_CODE_TYPE.NO_ERROR) {
                        System.out.println(" ________________________________________________________________");
                        System.out.println("|");
                        System.out.println("| Received message : " + message.value.userID + ", " + message.value.message);
                        System.out.println("|________________________________________________________________");
                        System.out.println("");
                    } else {
                        System.out.println("Receive_Message Error: " + return_code.value.value());
                    }
                } while (return_code.value == RETURN_CODE_TYPE.NO_ERROR && message.value.userID < 4);

                TS.Destroy_Connection(connection_id.value, return_code);
                if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
                    System.out.println("Destroy_Connection Error: " + return_code.value.value());
                }
            }
        }
    }
}
