def call(String owaspInstallation) {
    dependencyCheck additionalArguments: '--scan ./', odcInstallation: owaspInstallation
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
