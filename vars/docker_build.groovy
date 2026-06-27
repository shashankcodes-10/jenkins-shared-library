def call(String imgName){
  
    sh "docker build -t ${imgName} ."

}
