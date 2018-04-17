/**
 * 
 */
package com.spring.core.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author Prasad
 *
 */
public class CustomEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6220347124647585969L;

	public CustomEvent(Object source) {
		super(source);

	}

	public String toString() {
		return "My Custom Event";
	}

}
