package org.farrukh.examples.codenarc

/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'Farrukhjon' at '10/9/15 4:58 PM' with Gradle 2.5
 *
 * @author Farrukhjon, @date 10/9/15 4:58 PM
 */
@SuppressWarnings('JUnitPublicNonTestMethod')
import spock.lang.Specification

/**
 * Unit level test.
 */
class LibraryTest extends Specification {

    def 'some library method returns true'() {
        setup:
        def lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }

}
