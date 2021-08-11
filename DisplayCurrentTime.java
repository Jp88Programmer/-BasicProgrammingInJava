package com.example;

public class DisplayCurrentTime {
 public static void main(String args[]){
   //Its assign time in milliseconds from 1970 (GMT) to current time 
   long milliSecond = System.currentTimeMillis();
    //converting totel second 
	long totelSecond = milliSecond /1000;
	//compute currentSecond 
	long currentSecond = totelSecond % 60;
	//Compute totelMinute
	long totelMinute = totelSecond / 60;
	//Compute currentMinute
	long currentMinute = totelMinute % 60;
	//Compute totelHour
	long totelHour = totelMinute / 60;
	//Compute CurrentHour
	long currentHour = totelHour % 24;
	System.out.println("the Current Time is : "+currentHour + ":" + currentMinute + ":" + currentSecond);
 }
}
