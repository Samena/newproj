package com.sam.zoopackage;

	
	public class Enclosure {
		
	
	public enum EnclosureType {
			FISHTANK, CATCAVE, REPTILEWORLD, THEBIRDCAGE, SPIDERSANCTURY, AMPHIBIANMUSEUM; 
	
	}
		protected EnclosureType enclosure;

		public Enclosure(EnclosureType enclosureType) {
			enclosure = enclosureType;
		}

		public EnclosureType getEnclosureType() {
			return enclosure;
		}

		public void setEnclosureType(EnclosureType enclosureType) {
			this.enclosure = enclosureType;
		}
}
	


