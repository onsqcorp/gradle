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

package org.gradle.api.internal.tasks;

import org.gradle.api.Action;
import org.gradle.api.Task;

public interface ClassLoaderAwareTaskAction extends Action<Task> {
    /**
     * Returns the classloader used to load the action. This can be the classloader
     * of the implementing class, or the classloader of some delegate action.
     */
    ClassLoader getClassLoader();

    /**
     * Returns the type of the action. This can be the
     * implementing class itself, or the type of some delegate action.
     */
    Class<?> getActionType();
}
