/* blacken - a library for Roguelike games
 * Copyright © 2012 Steven Black <yam655@gmail.com>
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

package com.googlecode.blacken.colors;

/**
 * This will probably exist in Version 2.0 to help support the unification of
 * AwtPalette with ColorPalette which is requires to unify the TerminalInterface
 * with the AwtTerminalInterface.
 *
 * @since 2.0
 * @author Steven W. Black
 */
interface CachedColorTransformerV2<T> {
    public T transform(int argb);
}
