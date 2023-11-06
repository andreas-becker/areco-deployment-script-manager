/**
 * Copyright 2014 Antonio Robirosa
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.areco.ecommerce.deploymentscripts.impex;

import org.areco.ecommerce.deploymentscripts.core.ScriptStepResult;

import javax.annotation.Nonnull;
import java.io.File;

/**
 * This service is responsible for importing the impex files of the deployment scripts.
 *
 * @author Antonio Robirosa <mailto:deployment.manager@areko.consulting>
 */
public interface ImpexImportService {
    /**
     * Imports the given file and returns an importResult. It results a step result with an exception if there was an error
     *
     * @param impexFile Required
     * @return Never null.
     */
    @Nonnull
    ScriptStepResult importImpexFile(File impexFile);
}
