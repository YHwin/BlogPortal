package com.yh.blog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.blog.Model.TfNoticeManager;
import com.yh.blog.Service.PortalService;
/**
 * 前台控制层
 * @author YH
 *
 */

@Controller
@RequestMapping(value="/PortalController")
public class PortalController {
	
	@Autowired
	private PortalService service;
	
	@RequestMapping(value="/toIndex")
	public String toIndex(Model model){
		List<TfNoticeManager> noticeManagers = service.mybatiesTest();
		model.addAttribute("noticeManagers",noticeManagers);
		return "index";
	}
	
	
}
