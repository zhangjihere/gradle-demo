package greeter

import spock.lang.Specification

class GreetingFormatterSpec extends Specification {
    
    def 'Create a greeting'() {
        expect: 'The greeting to be correctly capitalized'
        GreetingFormatter.greeting('gradlephant') == 'Hello, Gradlephant'
    }
}


