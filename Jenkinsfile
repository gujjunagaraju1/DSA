pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'insertionLinkedlist', url: 'https://github.com/gujjunagaraju1/DSA.git'
            }
        }

        stage('Compile & Run') {
            steps {
                bat """
                    javac src\\Recursion\\AllSubSET.java
                    java -cp src Recursion.AllSubSET
                """
            }
        }
    }
}
