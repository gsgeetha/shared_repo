def buildmaven(goal) {
  echo "Building Project with maven"
  sh 'mvn clean $goal'
}

def checkoutcode() {
  echo "Checkout the source code"
  checkout scm
}

def setupmaven() {
  sh 'sudo apt install maven -y'
}
