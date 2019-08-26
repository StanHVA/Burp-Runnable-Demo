# Java Runnable Demo

This repository was created for this [ticket](https://support.portswigger.net/customer/en/portal/questions/17628759-plugin-s-java-runnable-processes-keep-running-even-after-fully-removing-the-plugin-?new=17628759) for Burp Suite. It contains the neccecary code to keep a process running forever, even if the plug-in is turned off.

Steps to reproduce:

1. Either compile Jar with gradle fatjar, or use the provided jar in the release tab.
2. Take the jar and enter it as an extension for Burp Suite.
3. Check the system.out, you will see a Running, time: {time} pop up every 5 seconds.
4. Disable the plug-in, or remove it in Burp Suite (or both?)
5. Check the system.out again. You will notice that the messages Running, time: {time} keep popping up intil you've fully killed Burp Suite.

Output:

```sh
Plugin Starts...
Running, time: 2019-08-26T10:27:58.942907
Running, time: 2019-08-26T10:28:03.941300
Running, time: 2019-08-26T10:28:08.942337
Running, time: 2019-08-26T10:28:13.941375
Running, time: 2019-08-26T10:28:18.946405
Running, time: 2019-08-26T10:28:23.945852
Running, time: 2019-08-26T10:28:28.946035
Running, time: 2019-08-26T10:28:33.945656
Running, time: 2019-08-26T10:28:38.946318
Running, time: 2019-08-26T10:28:43.944520
```