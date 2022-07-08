package de.tschuehly.testcontainerslocaldevkotlin


fun main(args: Array<String>) {
    val app = TestcontainersLocaldevKotlinApplication.createSpringApplication()
    app.addInitializers(DevelopmentInitializer.Initializer())
    app.run(*args)
}
