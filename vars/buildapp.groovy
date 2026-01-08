def call(goal) {
  sh 'echo "Building Project with maven"'
  sh 'mvn clean $goal'
}
