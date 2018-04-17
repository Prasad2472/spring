/**
 * 
 */
package com.spring.core.listener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author Prasad
 *
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publish() {
		CustomEvent event = new CustomEvent(this);
		applicationEventPublisher.publishEvent(event);
	}
}
