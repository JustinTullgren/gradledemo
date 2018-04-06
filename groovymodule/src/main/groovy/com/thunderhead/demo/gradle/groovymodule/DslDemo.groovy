package com.thunderhead.demo.gradle.groovymodule


class DslDemo {
    def toText = ""
    def fromText = ""
    def messageText = ""
    List<String> membersInGroup = ["foo", "bar", "baz"]

    def static make(closure) {
        DslDemo demo = new DslDemo()
        closure.delegate = demo
        closure()
    }

    def to(who) {
        toText = who
    }

    def from(who) {
        fromText = who
    }

    def message(body) {
        messageText = body
    }

    def getMembers() { membersInGroup }

    def getText() {
        println "Hello $toText. Message from $fromText: $messageText"
    }

}
