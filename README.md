# cs-topic-generator
New ideas are tough. This makes it easy and automatic.


This is a Java wrapper for the great [CS Research Topic Generator](https://www.cs.purdue.edu/homes/dec/essay.topic.generator.html).

> Computer Science is facing a major roadblock to further research. The problem is most evident with students, but afflicts many researchers as well: people simply have a tough time inventing research topics that sound sufficiently profound and exciting. Many PhD students waste needless years simply coming up with a thesis topic. And researchers often resort to reading documents from government grant agencies so they will know what to work on for the next proposal!
>
> Good news for the CS community: the problem has at last been solved.



## Usage

In your build.gradle file:

    dependencies {
        compile 'com.anonsage:cs-topic-generator:1.1.0'
    }

In your Java or Android file:

    CsTopicGenerator generator = new CsTopicGenerator();
    String topic = generator.getTopic(); // Generates a random topic each call.



## Contributing
Pull-requests welcomed. This is great project to get experience contributing to open source.

The library is contained in a single file: [CsTopicGenerator.java](https://github.com/danialgoodwin/cs-topic-generator/blob/master/cs-topic-generator/cs-topic-generator/src/main/java/com/anonsage/CsTopicGenerator.java)



## License
MIT
