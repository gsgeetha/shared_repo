def call(){
    sh '''
    whoami
    groups
    docker ps
    '''
  //sh 'docker build -t hello_war:1.0 .'
}
