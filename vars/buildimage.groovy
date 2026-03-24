def buildimage(){
  sh 'docker build -t hello_war:1.0 .'
}
