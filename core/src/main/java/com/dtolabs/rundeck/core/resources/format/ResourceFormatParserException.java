/*
 * Copyright 2016 SimplifyOps, Inc. (http://simplifyops.com)
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

/*
* ResourceFormatParserException.java
* 
* User: Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
* Created: 8/4/11 9:56 AM
* 
*/
package com.dtolabs.rundeck.core.resources.format;

/**
 * ResourceFormatParserException is ...
 *
 * @author Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
 */
public class ResourceFormatParserException extends Exception {
    public ResourceFormatParserException() {
        super();
    }

    public ResourceFormatParserException(String msg) {
        super(msg);
    }

    public ResourceFormatParserException(Exception cause) {
        super(cause);
    }

    public ResourceFormatParserException(String msg, Exception cause) {
        super(msg, cause);
    }
}
