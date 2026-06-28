def call(String imgName){
  sh " trivy image --format table -o trivy-image-report.html ${imgName}:latest "
}
