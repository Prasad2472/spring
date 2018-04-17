/**
 * 
 */
package com.spring.core.listener;

import org.springframework.context.ApplicationListener;

/**
 * @author Prasad
 *
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent arg0) {
		System.out.println("Event is Received...!!!"+arg0);
	}

}
