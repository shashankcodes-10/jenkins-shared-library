def call(String sonarInstallation, String projectName, String projectKey) {
    withSonarQubeEnv(sonarInstallation) {
        sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey}"
    }
}
