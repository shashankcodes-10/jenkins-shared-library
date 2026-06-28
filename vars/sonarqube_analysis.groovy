def call(String sonarInstallation, String projectName, String projectKey) {
    withSonarQubeEnv(sonarInstallation) {
        sh """
        $SONAR_HOME/bin/sonar-scanner \
        -Dsonar.projectName=${projectName} \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.exclusions=trivy-fs-report.html,trivy-image-report.html,dependency-check-report.xml,mysql-data/**
        """
    }
}
