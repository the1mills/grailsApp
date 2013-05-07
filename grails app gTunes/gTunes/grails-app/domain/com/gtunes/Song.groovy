package com.gtunes

class Song {

	String title
	String artist
	Date datePublished
	Album album
	
    static constraints = {
    	
    	title blank: false
    	artist blank: false
    
    }
}
