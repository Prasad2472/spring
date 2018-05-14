/**
 * 
 */
package com.example.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prasad
 *
 */
@RestController
//@RequestMapping("/hello")
public class AcuratorController {

	@RequestMapping("/hello")
	public String getAcuratorController() {
		return "Hello AcuratorController..";
	}

	@RequestMapping("/Hello")
	public String getNewAcuratorController() {
		return "Hello New AcuratorController..";
	}

}
