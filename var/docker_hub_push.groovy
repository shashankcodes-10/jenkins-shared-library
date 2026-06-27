def push( string credId , string imgName){
  withCredentials([usernamePassword(
                    credentialsId:"${credId}",
                    usernameVariable:"dockerHubuser",
                    passwordVariable:"dockerHubpass"
                    )]){
                          sh '''
                           echo "$dockerHubpass" | docker login -u "$dockerHubuser" --password-stdin
                           '''

                        sh "docker image tag ${imgName} ${env.dockerHubuser}/${imgName}"
                        sh "docker push ${env.dockerHubuser}/${imgName}:latest"
                }
}
