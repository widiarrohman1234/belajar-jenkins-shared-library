package widiarrohman.jenkins;

class Output {

    // tidak bisa, harus pakai println()
    //   static def hello(String name) {
    // echo("Hello ${name}") 
    //   }
  static def hello(steps, String name) {
    steps.echo("Hello ${name}") 
  }

}