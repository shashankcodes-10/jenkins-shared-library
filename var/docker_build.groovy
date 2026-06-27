def build(string imgName){
  
    sh "docker build -t "${imgName}" .

}
