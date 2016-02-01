 package gradleDemo;

 import org.apache.commons.validator.routines.*;

 public class Demo {
    static final String cardNum = "4716841076742166";
    
	public static void main(String[] args) {
		CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.AMEX + CreditCardValidator.VISA);
        boolean valid = validator.isValid(cardNum);
        System.out.println("Is the credit card number valid? " + valid);
	}
 }

gedit build.gradle 
 apply plugin: 'java'

 repositories {
    mavenCentral()
 }

 dependencies {
   compile group: 'commons-validator', name: 'commons-validator', version: '1.4.1'
   compile files("C:/Dev/jdk1.8.0_51/lib/tools.jar")
 }
 sourceCompatibility = 1.7
 version = '1.0'
 jar {
    manifest {
        attributes  'Main-Class': 'Test',
                    'Implementation-Title': 'Sample-Gradle',
                    'Implementation-Version': version
    }
 }
gradle jar
ls ~/.gradle/caches/modules-2/files-2.1/commons-validator/...
