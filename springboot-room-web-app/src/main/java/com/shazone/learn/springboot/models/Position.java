package com.shazone.learn.springboot.models;

public enum Position {
	HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;
	
	public String toString() {
		switch (this) {
			case CONCIERGE:
				return "Concierge";
			case HOUSEKEEPING:
				return "House Keeping";
			case FRONT_DESK:
				return "Front Desk";
			case SECURITY:
				return "Security";
		}
		return "";
	}

}
