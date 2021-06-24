package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javainuse.model.Employee;
import com.javainuse.model.Num;
import com.javainuse.LongRunning;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		try{
		Thread.sleep(200000);
		//LongRunning T1 = new LongRunning();
      	//T1.start();
      	}catch (InterruptedException e) {
			         System.out.println("Thread  interrupted.");
      	}

		return emp;
	}

	@RequestMapping(value = "/math", method = RequestMethod.POST)
	 @ResponseBody
		public Num add(@RequestBody Num number) {

	Num numA=new Num();
	numA.setNum1(number.getNum1()+number.getNum2());
	numA.setNum2(number.getNum1()-number.getNum2());

			return numA;
	}

}