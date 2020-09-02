cd \Users\jakub\IdeaProjects\kodilla-course\build\libs
del /s *.jar
cd ../..
call gradlew build
cd build\libs
if exist *.jar (
    copy *.jar project
) else (
    echo blad kompiliacji
)