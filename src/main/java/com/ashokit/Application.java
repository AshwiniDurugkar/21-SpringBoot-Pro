package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
        private Map<String,Object> cache = new HashMap<String,Object>()
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

                int a=10;
	}
      //HIS-301 changes 
      public void LocalDataToCache(){
//logic

	}
        //HIS-200 Related Changes
        public void doProcess()
        {
          //logic goes here  
         }


}
