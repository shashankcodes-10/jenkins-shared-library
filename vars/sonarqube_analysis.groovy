def call(String sonarInstallation , String projectName , string projectKey){
  withsonarQubeEnv(sonarInstallaton){
          sh " $SONARHOME/bin/sonar-server -Dsonar.projectName:${projectName} -Dsonar.projectKey:${projectKey}
  }
}
