package com.yh.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 前台控制层
 * @author YH
 *
 */

@Controller
@RequestMapping(value="/PortalController")
public class PortalController {
	
	@RequestMapping(value="/toIndex")
	public String toIndex(){
		
		return "Index";
	}
}
