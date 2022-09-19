# Android Terminal Template Project

## Template to build apk by using Gradle on terminal, without using any IDE.

Build a simple APK which returns a random city from a list, illustrating a simply button and Kotlin's "random()" function.

Simple template to start and code an android project through text editor of your choice, to gain considerable speed without using existing bloated IDEs. This is ideal on old computers.

It is possible to build without Gradle (i.e. build R.java and convert everything) but this is considerably easier. It is still way faster than using an IDE like Android Studio or IntelliJ, which are incredibly slow on old laptops and take roughly 10 minutes just to start up.

For easier use install sdkman and build with:

```gradle assembleDebug --warning-mode all```

After which the apk will be created in the "build" folder and can be installed with:

```adb install app.apk```

and tested on a real Android device of your choice.
