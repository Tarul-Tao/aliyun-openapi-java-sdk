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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutAdmintenantiditerationtemplateResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long created;

		private Boolean deleted;

		private String description;

		private Boolean enable;

		private String fabricBizType;

		private String id;

		private Boolean independentComplete;

		private Long lastModified;

		private String modifier;

		private String name;

		private Boolean needProject;

		private Boolean needWorkItem;

		private String templateGroup;

		private String tenant;

		private String type;

		private Boolean xflushCheckEnable;

		private List<String> preSetStageTemplateIds;

		private List<String> stageTemplates;

		private List<String> tasks;

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getFabricBizType() {
			return this.fabricBizType;
		}

		public void setFabricBizType(String fabricBizType) {
			this.fabricBizType = fabricBizType;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIndependentComplete() {
			return this.independentComplete;
		}

		public void setIndependentComplete(Boolean independentComplete) {
			this.independentComplete = independentComplete;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getNeedProject() {
			return this.needProject;
		}

		public void setNeedProject(Boolean needProject) {
			this.needProject = needProject;
		}

		public Boolean getNeedWorkItem() {
			return this.needWorkItem;
		}

		public void setNeedWorkItem(Boolean needWorkItem) {
			this.needWorkItem = needWorkItem;
		}

		public String getTemplateGroup() {
			return this.templateGroup;
		}

		public void setTemplateGroup(String templateGroup) {
			this.templateGroup = templateGroup;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getXflushCheckEnable() {
			return this.xflushCheckEnable;
		}

		public void setXflushCheckEnable(Boolean xflushCheckEnable) {
			this.xflushCheckEnable = xflushCheckEnable;
		}

		public List<String> getPreSetStageTemplateIds() {
			return this.preSetStageTemplateIds;
		}

		public void setPreSetStageTemplateIds(List<String> preSetStageTemplateIds) {
			this.preSetStageTemplateIds = preSetStageTemplateIds;
		}

		public List<String> getStageTemplates() {
			return this.stageTemplates;
		}

		public void setStageTemplates(List<String> stageTemplates) {
			this.stageTemplates = stageTemplates;
		}

		public List<String> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<String> tasks) {
			this.tasks = tasks;
		}
	}

	@Override
	public AddLinkeBahamutAdmintenantiditerationtemplateResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeBahamutAdmintenantiditerationtemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
