/**
 * 
 */
package com.spring.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author Prasad
 *
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received-->" + event);
	}
}