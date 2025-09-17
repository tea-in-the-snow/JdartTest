#!/bin/bash

# 创建 build 目录（如果不存在）
mkdir -p build

# 检查是否有 Java 文件需要编译
JAVA_FILES=$(find src -name "*.java")
if [ -z "$JAVA_FILES" ]; then
	echo "没有找到需要编译的 Java 文件"
	exit 0
fi

echo "开始编译以下 Java 文件:"
echo "$JAVA_FILES" | sed 's/^/  - /'
echo

# 编译 Java 源文件，递归编译 src 目录下的所有 .java 文件
# 指定 classpath 包含 lib 目录中的 jar 包和外部依赖
javac -cp "lib/*:/home/shaoran/jdart/commons-lang-3.18.0/target/commons-lang3-3.18.0.jar" \
	-d build \
	$JAVA_FILES

if [ $? -eq 0 ]; then
	echo "✅ 编译完成！编译后的 .class 文件在 build/ 目录中"
	echo
	echo "生成的 .class 文件:"
	find build -name "*.class" | sed 's/^/  - /'
else
	echo "❌ 编译失败！请检查代码错误"
	exit 1
fi

echo "📦 打包所有类到 bin/app.jar..."
jar cf bin/app.jar -C build .

if [ $? -eq 0 ]; then
	echo "✅ 打包完成: bin/app.jar"
	echo
	echo "运行方式 (手动指定 main 类):"
	echo "  java -cp bin/app.jar:<依赖JAR路径> com.example.YourMainClass"
	echo
	echo "例如:"
	echo "  java -cp \"bin/app.jar:lib/*:/home/shaoran/jdart/commons-lang-3.18.0/target/commons-lang3-3.18.0.jar\" com.example.Main"
else
	echo "❌ JAR 打包失败"
	exit 1
fi
