/**
 * Copyright (C) 2015 Baifendian Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bfd.harpc.test.avro;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.avro.Protocol;

/**
 * <p>
 * 
 * @author : dsfan
 * @date : 2015-6-12
 */
public class Utils {
    public static Protocol getProtocol() {
        Protocol protocol = null;
        try {
            URL url = Utils.class.getClassLoader().getResource("message.avpr");
            protocol = Protocol.parse(new File(url.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return protocol;
    }
}
