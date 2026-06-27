def build(string imgName){
  
    sh "docker build -t ${"imageName"} ."

}
