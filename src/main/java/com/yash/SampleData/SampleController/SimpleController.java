package com.yash.SampleData.SampleController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.SampleData.Bean.UsersDetails;
import com.yash.SampleData.Dao.DataInsertionDao;

@Controller
public class SimpleController {
	
	@Autowired
	DataInsertionDao repo;
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Welcome!!!! This is home Page");
		return "Hello";
	}
	
	@RequestMapping("/addUserDetails")
	public String Addusers(UsersDetails users)
	{
		repo.save(users);
		return "Hello";
	}
	
	@RequestMapping("/getUserDetails")
	public ModelAndView getusers(@RequestParam int id)
	{
		System.out.println("Inside The get"+id);
		ModelAndView mv=new ModelAndView("ShowUserDetails");
		UsersDetails userdata=repo.findById(id).orElse(new UsersDetails());
		System.out.println(userdata);
		mv.addObject(userdata);
		return mv;
	}
	

}
