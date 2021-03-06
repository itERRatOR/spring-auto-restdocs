/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package capital.scalable.restdocs.util;

import static org.apache.commons.lang3.StringUtils.uncapitalize;

public final class FieldUtil {
    private FieldUtil() {
        // utils
    }

    public static String fromGetter(String javaMethodName) {
        int cut = javaMethodName.startsWith("get") ? "get".length() : "is".length();
        return uncapitalize(javaMethodName.substring(cut, javaMethodName.length()));
    }

    public static boolean isGetter(String javaFieldName) {
        return javaFieldName.startsWith("get") || javaFieldName.startsWith("is");
    }
}
