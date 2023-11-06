def call() {
  sh 'echo Hi From DevOps Team'
  sh 'mvn clean install'
}
