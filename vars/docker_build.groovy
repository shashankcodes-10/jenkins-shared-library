def call(string imgName){
  
    sh "docker build -t "${imgName}" .

}
