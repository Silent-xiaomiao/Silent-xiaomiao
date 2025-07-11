import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;

public class WriteReadme {
    public static void main(String[] args) {
        String content = """
        - 👋 我是@Silent-xiaomiao
        - 🌑 是SilentStudio的成员
        > 🏅 一群有志青年聚集在这里🙃
        > 🏵️ [当然，如果有点中年人士也没关系。但不包括我😁]
        - 💻 我对Java，Python，C, c#, c++，VB,HTML…
        - 🌱 我目前正在学习Python应用程序开发
        - 💰 我正在寻找合作…
        - 📡 怎么联系我？电子邮件:Silent_xiaomiao@outlook.com
        - ✏️ 简称(外号)：小喵
        - 🈲 趣事：…
-------------------——🇨🇳——-----------------——🇨🇳——------------------——🇨🇳——------------------      
        - 👋 Hi, I’m @Silent-xiaomiao
        - 🪐 I belong to SilentStudio.
        > 🗣️ A large number of young people with aspirations gather here.🙃        
        > 👥 [Of course, it doesn't matter if a bit middle-aged.😁]
        - 👀 I’m interested in Java,Python,C,C#,C++,VB,HTML…
        - 🌱 I’m currently learning Python Application development
        - 💞️ I’m looking to collaborate on ...
        - 📫 How to reach me? Email:Silent_xiaomiao@outlook.com
        - 😄 Pronouns: XiaoMiao
        - ⚡ Fun fact: …

        <!---
        Silent-xiaomiao/Silent-xiaomiao is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
        You can click the Preview link to take a look at your changes.
        --->""";

        Path path = Paths.get("README.md");
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("README.md The file was created successfully.");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException cause) {
        super(cause);
    }
}
