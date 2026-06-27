def notifySuccess(){
  
                    emailext(
                    from: "u10shashank@gmail.com",
                    to : "u10shashank@gmail.com",
                    body: "Build successfull for ci",
                    subject : "Build successfull for ci"
                   )   
}
