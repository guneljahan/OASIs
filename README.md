## OASIs

A search-based tool to assess and improve oracles in the form of Java Assertions.


---
## How to run:

Run run.sh file from command line with the following parameters:

1. Java class name

2. Method name

3. Source code location
---
## Examples

Folder "Examples" has a class SimpleMethods with 4 methods. Each of these methods has an assertion. You can run OASIs on this methods following these commands:

```
bash run.sh SimpleMethods /Examples/src/ getMin
bash run.sh SimpleMethods /Examples/src/ abs
bash run.sh SimpleMethods /Examples/src/ addElementToSet
bash run.sh SimpleMethods /Examples/src/ incrementNumberAtIndex

```
## Related Publications

Gunel Jahangirova, David Clark, Mark Harman, and Paolo Tonella "Test oracle assessment and improvement", In Proceedings of the 25th International Symposium on Software Testing and Analysis (ISSTA 2016).

