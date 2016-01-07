# README #

# Netflix Eureka discovery (micro-)service deployed as a unikernel#

This is a small example project that creates a Netflix Eureka microservice deployed on an OSv unikernel on VirtualBox.

# Disclaimers!

1. The **OSv/capstan** stuff is highly experimental, expect things to break!
2. Tested this on OSX/Homebrew, with other stacks your mileage may vary.
3. Thou hast been warned! ;)

# Prerequisites
1. Install a JSE8 JDK: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Install homebrew: http://brew.sh/
3. Install capstan: http://osv.io/run-locally/
4. Install QEMU: **brew install qemu**
5. Install Oracle VirtualBox: https://www.virtualbox.org/wiki/Downloads

# Building and running from source

1. Run **gradle build**
2. Run **capstan build**
3. Run **capstan run -f "8761:8761"**
4. Open a browser and go to http://localhost:8761
5. Great success!

# Troubleshooting:

Q: *capstan can't find gradle executable.*
A: Install gradle via homebrew (**brew install gradle**), capstan doesnt' appear to respect PATH settings.

Q: *capstan is throwing various errors when trying to start the VM.*
A: Delete the ~/.capstan folder and delete the VMs from VirtualBox and try again.

Q: *I found an issue, have a feature request or a question that's not answered here.*
A: Please register your issue, request or question here: https://github.com/NLxAROSA/unikernel-spring-cloud-netflix/issues

# Additional information

OSv: http://osv.io/
Spring Boot: http://projects.spring.io/spring-boot/
Spring Cloud: http://projects.spring.io/spring-cloud/ 
Spring Cloud Netflix: http://cloud.spring.io/spring-cloud-netflix/