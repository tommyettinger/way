/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.github.tommyettinger.way;

/** Environment class holding references to the {@link Logger} instance. The reference
 * in held in a static field which allows static access to all sub systems.
 * <p>
 * Currently the Logger is always an {@link StdoutLogger} unless reassigned with {@link #setLogger(Logger)}.
 * You can set the logger to a new {@link NullLogger} to disable logging entirely.
 * <p>
 * This class cannot be instantiated and all usage is static. This is the way.
 * 
 * @author davebaol */
public final class TheWay {

	private TheWay () {
	}
	public static final long TIME_TOLERANCE = 100L;

	private static Logger logger = new StdoutLogger();

	/** Returns the logger service. */
	public static Logger getLogger () {
		return logger;
	}

	/** Sets the logger service. */
	public static void setLogger (Logger logger) {
		TheWay.logger = logger;
	}

}
