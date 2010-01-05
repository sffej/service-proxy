package com.predic8.membrane.core.rules;

import java.util.ArrayList;
import java.util.List;

import com.predic8.membrane.core.config.AbstractXMLElement;
import com.predic8.membrane.core.interceptor.Interceptor;

public abstract class AbstractRule extends AbstractXMLElement implements Rule {

	protected String name = "";
	
	protected RuleKey ruleKey;
	
	protected boolean blockRequest;
	protected boolean blockResponse;
	
	protected List<Interceptor> interceptors = new ArrayList<Interceptor>();
	
	public AbstractRule() {
		
	}
	
	public AbstractRule(RuleKey ruleKey) {
		this.ruleKey = ruleKey;
	}
	
	public List<Interceptor> getInterceptors() {
		return interceptors;
	}

	public void setInterceptors(List<Interceptor> interceptors) {
		this.interceptors = interceptors;
	}

	public String getName() {
		return name;
	}

	public RuleKey getRuleKey() {
		return ruleKey;
	}

	public boolean isBlockRequest() {
		return blockRequest;
	}

	public boolean isBlockResponse() {
		return blockResponse;
	}

	public void setName(String name) {
		if (name == null)
			return;
		this.name = name;

	}

	public void setRuleKey(RuleKey ruleKey) {
		this.ruleKey = ruleKey;
	}
	
	@Override
	public String toString() {
		if (!"".equals(name))
			return name;
		return "" + getRuleKey().toString();
	}
	
	public void setBlockRequest(boolean blockStatus) {
		
	}
	
	public void setBlockResponse(boolean blockStatus) {
		
	}

}
