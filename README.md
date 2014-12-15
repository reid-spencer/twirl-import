twirl-import
============

A very simple Twirl example to report a bug to JetBrains on IntelliJ IDEA 14.0.2. The problem is that IntelliJ 
does not recognize valid syntax for @import statements that occur before the @() function definition. In 
particular this means the function declaration will fail because of missing symbols that should have been
introduced by the recognized import. The result is unwarranted syntax errors in IDEA that do not correspond
to syntax errors from the Twirl compiler. The only workaround is to remove the imports.
