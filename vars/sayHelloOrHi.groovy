def call(String sayWhat="nothing"){
  if(sayWhat=="hi"){
    script{
      bat """
        echo Hi
      """
    }
  }
}
