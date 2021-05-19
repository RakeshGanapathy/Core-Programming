# Serial Version UID

* The JVM associates a version (long) number with each serializable class. It is used to verify that the saved and loaded objects have the same attributes 
and thus are compatible on serialization.

* This number can be generated automatically by most IDEs and is based on the class name, its attributes and associated access modifiers.
Any changes result in a different number and can cause an InvalidClassException.

* If a serializable class doesn't declare a serialVersionUID, the JVM will generate one automatically at run-time. However, 
it is highly recommended that each class declares its serialVersionUID as the generated one is compiler dependent and thus may result in unexpected InvalidClassExceptions.
