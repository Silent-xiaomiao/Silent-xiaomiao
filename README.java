import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;

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
        Silent-xiaomiao/Silent-xiaomiao is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
        You can click the Preview link to take a look at your changes.
        --->""";

        Path path = Paths.get("README.md");
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("README.md 文件创建成功，内容已写入。");
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
