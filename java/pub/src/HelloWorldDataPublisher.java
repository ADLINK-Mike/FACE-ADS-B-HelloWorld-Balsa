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
import HelloWorldData.Msg;
import HelloWorldData.MsgHolder;

public class HelloWorldDataPublisher {

    public static void main(String[] args) {
        RETURN_CODE_TYPEHolder  return_code = new RETURN_CODE_TYPEHolder(FACE.RETURN_CODE_TYPE.NO_ERROR);

        String configuration = "dds_face_config.xml";
        TS.Initialize(configuration, return_code);
        if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
            System.out.println("Error: " + return_code.value.value());
        } else {
            String connection_name = "HelloWorldPub";
            MESSAGING_PATTERN_TYPE pattern = MESSAGING_PATTERN_TYPE.PUB_SUB;
            us.opengroup.FACE.LongHolder connection_id = new us.opengroup.FACE.LongHolder(1);
            CONNECTION_DIRECTION_TYPEHolder connection_direction = new CONNECTION_DIRECTION_TYPEHolder(CONNECTION_DIRECTION_TYPE.SOURCE);
            us.opengroup.FACE.IntHolder max_message_size = new us.opengroup.FACE.IntHolder(0);
            long timeout = 0;
            TS.Create_Connection(connection_name, pattern, connection_id, connection_direction, max_message_size, timeout, return_code);
            if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
                System.out.println("Create_Connection Error: " + return_code.value.value());
            } else {
                Msg msg = new Msg(0, "Hello World");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    // nothing
                }
                for (; msg.userID < 5 && return_code.value == RETURN_CODE_TYPE.NO_ERROR; msg.userID++) {
                    System.out.println(" ________________________________________________________________");
                    System.out.println("|");
                    System.out.println("| Publish message : " + msg.userID + ", " + msg.message);
                    System.out.println("|________________________________________________________________");
                    System.out.println("");

                    us.opengroup.FACE.LongHolder transaction_id = new us.opengroup.FACE.LongHolder(0);
                    MsgHolder message = new MsgHolder(msg);
                    us.opengroup.FACE.IntHolder message_size = new us.opengroup.FACE.IntHolder(0);
                    TS.Send_Message(connection_id.value, timeout, transaction_id, message, message_size, return_code);
                    if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
                        System.out.println("Send_Message Error: " + return_code.value.value());
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e1) {
                        // nothing
                    }
                }

                try {
                    // Wait to ensure data is received before we delete writer
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    // nothing
                }

                TS.Destroy_Connection(connection_id.value, return_code);
                if (return_code.value != RETURN_CODE_TYPE.NO_ERROR) {
                    System.out.println("Destroy_Connection Error: " + return_code.value.value());
                }
            }
        }
    }
}
