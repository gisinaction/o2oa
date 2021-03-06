package com.x.cms.assemble.control.jaxrs.data.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionDataItemUpdate extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionDataItemUpdate( Throwable e, String appDictId, String ...path ) {
		super("应用数据字典属性配置信息更新时发生异常。AppDictId:" + appDictId + ", path:" + path, e );
	}
}
