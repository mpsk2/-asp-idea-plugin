/*
 * Copyright 2018-2018 Michał Piotr Stankiewicz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.mpsk2.aspplugin.parser;

public class TheoryPassASPParserTest extends ASPParserTestBase {
    public TheoryPassASPParserTest() {
        super("program/good/theory");
    }


    public void testAtomDefinition() {
        doTest();
    }

    public void testDummy() {
        doTest();
    }

    public void testHeadTheory() {
        doTest();
    }

    public void testThermDefinition() {
        doTest();
    }
}