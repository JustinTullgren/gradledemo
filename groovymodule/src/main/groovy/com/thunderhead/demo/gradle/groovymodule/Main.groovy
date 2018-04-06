package com.thunderhead.demo.gradle.groovymodule

class Main {

    static void main(String[] args) {
        interpolationDemo()

        DslDemo.make {
            to "world"
            from "JT"
            message "Groovy!"
            members.each {
                println it  // "it" is a given name for a single arg in a closure
            }
            text // when closure contains string, it assumes a getter. Thus its implemented as getText in DslDemo
        }

    }

    static def interpolationDemo = {
        def hello = "hello"
        println "$hello world! Used a variable"

        println "${foo.call()} bar! Used method invocation"
    }

    static def foo = {
        "foo"
    }

}
