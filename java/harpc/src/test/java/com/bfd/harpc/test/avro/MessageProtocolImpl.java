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

import org.apache.avro.AvroRemoteException;

import com.bfd.harpc.test.gen.MessageProtocol;

/**
 * <p>
 * 
 * @author : dsfan
 * @date : 2015-6-15
 */
public class MessageProtocolImpl implements MessageProtocol {

    @Override
    public CharSequence sendMessage(CharSequence message) throws AvroRemoteException {
        return "hello " + message;
    }
}
