/*
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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForModifyResponse;
import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForModifyResponse.FailuresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCheckCreateOrderForModifyResponseUnmarshaller {

	public static PreCheckCreateOrderForModifyResponse unmarshall(PreCheckCreateOrderForModifyResponse preCheckCreateOrderForModifyResponse, UnmarshallerContext _ctx) {
		
		preCheckCreateOrderForModifyResponse.setRequestId(_ctx.stringValue("PreCheckCreateOrderForModifyResponse.RequestId"));
		preCheckCreateOrderForModifyResponse.setPreCheckResult(_ctx.booleanValue("PreCheckCreateOrderForModifyResponse.PreCheckResult"));

		List<FailuresItem> failures = new ArrayList<FailuresItem>();
		for (int i = 0; i < _ctx.lengthValue("PreCheckCreateOrderForModifyResponse.Failures.Length"); i++) {
			FailuresItem failuresItem = new FailuresItem();
			failuresItem.setCode(_ctx.stringValue("PreCheckCreateOrderForModifyResponse.Failures["+ i +"].Code"));
			failuresItem.setMessage(_ctx.stringValue("PreCheckCreateOrderForModifyResponse.Failures["+ i +"].Message"));

			failures.add(failuresItem);
		}
		preCheckCreateOrderForModifyResponse.setFailures(failures);
	 
	 	return preCheckCreateOrderForModifyResponse;
	}
}