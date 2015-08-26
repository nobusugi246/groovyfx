/*
 * Copyright 2011-2015 the original author or authors.
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

package groovyx.javafx.factory

import javafx.scene.control.TableCell;

/**
 *
 * @author jimclarke
 */
class TableCellFactory {
    Closure factory;

    public TableCellFactory() {
    }
    public TableCellFactory(Closure factory) {
        this.factory = factory;
    }
    public TableCell run() {
        def result = factory.call();

        return result;
    }

}

