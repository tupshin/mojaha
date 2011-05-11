/*
 * Copyright (C) 2011 Karl Ostendorf
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

package mongrel2;

import java.io.IOException;

/**
 * 
 * HandlerListeners extend the handler.
 * 
 * @see HttpHandler#addHandlerListener(HandlerListener)
 * @see HttpHandler#removeHandlerListener(HandlerListener)
 * 
 * @author Karl Ostendorf
 * 
 */
public interface HandlerListener {

	/**
	 * Called by the handler before sending a response.
	 * 
	 * @param rsp
	 *            the response to be sent
	 * 
	 * @throws IOException
	 * 
	 */
	void beforeSendResponse(Response rsp) throws IOException;

}
