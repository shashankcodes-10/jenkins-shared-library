def call(){
     sh " trivy fs --format table -o trivy-file-report-html --skip-dirs mysql-data . "
}
