mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="src/test/java/features/runFeature --glue checkingScript --glue hooks --glue steps --glue domain --threads 4"  
