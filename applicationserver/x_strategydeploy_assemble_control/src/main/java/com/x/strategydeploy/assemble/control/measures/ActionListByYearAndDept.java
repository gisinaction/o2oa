package com.x.strategydeploy.assemble.control.measures;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.strategydeploy.assemble.control.service.MeasuresInfoQueryService;
import com.x.strategydeploy.core.entity.MeasuresInfo;

public class ActionListByYearAndDept extends BaseAction {
	private static  Logger logger = LoggerFactory.getLogger(ActionListByYearAndDept.class);

	protected ActionResult<List<Wo>> execute(HttpServletRequest request, EffectivePerson effectivePerson, String year, String dept) throws Exception {
		ActionResult<List<Wo>> result = new ActionResult<List<Wo>>();
		MeasuresInfoQueryService measuresInfoQueryService = new MeasuresInfoQueryService();
		List<MeasuresInfo> measuresinfoList = new ArrayList<MeasuresInfo>();
		List<Wo> wrapOutList = new ArrayList<Wo>();
		measuresinfoList = measuresInfoQueryService.getListByYearAndDept(year, dept);
		wrapOutList = Wo.copier.copy(measuresinfoList);
		result.setData(wrapOutList);
		return result;
	}
}
