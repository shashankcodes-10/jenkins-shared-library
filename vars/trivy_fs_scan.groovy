def call(){
     sh " trivy sh --format table -o trivy-file-html . "
}
