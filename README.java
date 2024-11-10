import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteReadme {
    public static void main(String[] args) {
        String content = """
        - 👋 Hi, I’m @Silent-xiaomiao
        - 👀 I’m interested in ...
        - 🌱 I’m currently learning ...
        - 💞️ I’m looking to collaborate on ...
        - 📫 How to reach me ...
        - 😄 Pronouns: ...
        - ⚡ Fun fact: ...

        <!---
        Silent-xiaomiao/Silent-xiaomiao is a ✨ special ✨ repository because its `README.java` (this file) appears on your GitHub profile.
        You can click the Preview link to take a look at your changes.
        --->""";

        try {
            // 指定文件路径
            String filePath = "README.java";
            // 将字符串内容写入文件
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("README.java 文件创建成功，内容已写入。");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("写入文件时发生错误。");
        }
    }
}
