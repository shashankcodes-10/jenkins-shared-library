def call( String credId , String imgName){
  withCredentials([usernamePassword(
                    credentialsId:credId,
                    usernameVariable:"dockerHubuser",
                    passwordVariable:"dockerHubpass"
                    )]){
                          sh '''
                           echo "$dockerHubpass" | docker login -u "$dockerHubuser" --password-stdin
                           '''

                        sh "docker  tag ${imgName}:latest ${dockerHubuser}/${imgName}:latest"
                        sh "docker push ${dockerHubuser}/${imgName}:latest"
                }
}
