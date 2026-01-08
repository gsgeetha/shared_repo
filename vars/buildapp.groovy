def call(goal) {
  echo "Building Project with maven"
  sh 'mvn clean $goal'
}
