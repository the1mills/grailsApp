package com.gtunes

class Album {

	String title

	static hasMany = [songs:Song]
	
	 String toString(){
	
		 return title;	
	}
	
    static constraints = {
    
    }
}

