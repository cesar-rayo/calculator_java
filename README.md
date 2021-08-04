# Common commands

List all gradle tasks
```
$ ./gradlew tasks --all
```

Compile the project
```
$ ./gradlew classes --console=verbose 
```

Create executable scripts in build folder
```
$ ./gradlew installDist 
```

Running the app
```
$ ./app/build/install/app/bin/app -o add -v1 1 -v2 2
```