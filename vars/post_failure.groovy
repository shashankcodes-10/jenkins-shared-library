def failure(){
                    emailext(
                    from: "u10shashank@gmail.com",
                    to : "u10shashank@gmail.com",
                    body: "Build failed for ci",
                    subject : "Build failed for ci"
                )              
}
