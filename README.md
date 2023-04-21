# T1
    1.1
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question1/Util.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question1/StringTest.java
        commit ID：0129faf5e4acbf751c579370ceadfb52692fc1fc
    description：通过从字符串尾部遍历的形式赋值给新字符传，并返回。    
    1.2
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question1/Util.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question1/StringTest.java
        commit ID：aed6930b7b481ab531a2f1dc61518fd907ccc9c0
    description：通过使用Map集合，以字符作为Key，字符出现的次数作为Value，字符每出现一次，Value+1实现统计次数功能。
    1.3
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question1/Util.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question1/StringTest.java
        commit ID：fe490dd102f95548ae147053f4ca742c2a5d653a
    description：通过1.2中的统计次数可得到所有字符的出现次数，采用冒泡排序法找到Value最大的Key以及Value，并放入Map集合中返回。
    1.4
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question1/Util.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question1/StringTest.java
        commit ID：8822bd0ddd880bdeb234bcc4ea24b46bad666a8a
    description：采用滑动窗口方法，记录滑动窗口的开始值以及最长子串的开始值，遇到重复的字符开始值+1，遍历每个字符的最长字串，得到最长子串，记录起始位置以及结束位置并输出。
# T2
    2.1
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question2/StudentProperty.java
                src/main/java/com/ksyun/whgc/chenjianghao/Question2/StudentsUtil.java
                src/main/java/com/ksyun/whgc/chenjianghao/Question2/Student.java
                src/main/java/com/ksyun/whgc/chenjianghao/Question2/App.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question2/StudentTest.java
        commit ID：e0182bc3be4ea5c4db151f8d220f860dae54a162
    2.2
        实现路径：src\main\java\com\ksyun\whgc\qinfen\T2\AnnotationUtils.java
                src\main\java\com\ksyun\whgc\qinfen\T2\MyAnnotation.java
                src\main\java\com\ksyun\whgc\qinfen\T2\Student.java
                src\main\java\com\ksyun\whgc\qinfen\T2\data.csv
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question2/StudentTest.java
        commit ID：e0182bc3be4ea5c4db151f8d220f860dae54a162
# T3
    3
        实现路径：src/main/java/com/ksyun/whgc/chenjianghao/Question3/ThreadOutput.java
        测试方法路径：src/test/java/com/ksyun/whgc/chenjianghao/Question3/ThreadTest.java
        commit ID：39ff3a59468d3445db7e653a2965ff0c34e8700b
    description：1、采用Lambda表达式创建线程，记录输出次数，采用synchronized锁控制输出，使用死循环保证虚假唤醒其他线程后可以继续阻塞。
                 2、测试方法有bug，在测试方法中的用户线程在测试方法执行完后就被杀死了，不在测试方法中执行可以正确执行。