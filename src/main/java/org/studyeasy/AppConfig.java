package org.studyeasy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*  This class will specify spring that 
 * we are willing to create a component based
 * prgramming and we need to scan a certain project
 */
@Configuration // in order to mark this class as an config class
@ComponentScan("org.studyeasy") // in order to tell the spring which package it needs to scan
public class AppConfig {

}
