package com.example.utils

class StringUtils {
    static String reverse(String str) {
        return str.reverse()
    }
}

def build() {
    echo 'Building the application'
    sh 'mvn clean package'
}

def test() {
    echo 'Running tests'
    sh 'mvn test'
}

