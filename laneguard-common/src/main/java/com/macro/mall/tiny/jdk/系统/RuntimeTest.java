package com.macro.mall.tiny.jdk.系统;

/**
 * @ClassName RuntimeTest
 * @Author WB-918966
 * @Date 2022/11/2 17:54
 * @Version 1.0
 * public class Runtime
 *    extends Object
 **/
public class RuntimeTest {
    /**
     * 获取处理器数量，执行运行环境命令，终止虚拟机，获取内存余量，执行gc
     *
     * 1	void addShutdownHook(Thread hook)
     * 此方法注册一个新的虚拟机关闭挂钩。
     * 2	int availableProcessors()
     * 此方法返回可用处理器的Java虚拟机的数量。
     * 3	Process exec(String command)
     * 此方法在一个单独的进程中执行指定的字符串命令。
     * 4	Process exec(String[] cmdarray)
     * 此方法在一个单独的进程中执行指定的命令和参数。
     * 5	Process exec(String[] cmdarray, String[] envp)
     * 此方法指定环境独立进程中执行指定的命令和参数。
     * 6	Process exec(String[] cmdarray, String[] envp, File dir)
     * 此方法指定环境和工作目录的独立进程中执行指定的命令和参数。
     * 7	Process exec(String command, String[] envp)
     * 此方法在指定环境的独立进程中执行指定的字符串命令。
     * 8	Process exec(String command, String[] envp, File dir)
     * 此方法在指定环境和工作目录的独立进程中执行指定的字符串命令。
     * 9	void exit(int status)
     * 此方法通过发起关闭序列，终止当前正在运行的Java虚拟机。
     * 10	long freeMemory()
     * 此方法返回可用内存在Java虚拟机的数量。
     * 11	void gc()
     * 这种方法运行垃圾回收器。
     * 12	static Runtime getRuntime()
     * 此方法返回与当前Java应用程序相关的运行时对象。
     * 13	void halt(int status)
     * 此方法强行终止当前正在运行的Java虚拟机。
     * 14	void load(String filename)
     * 此方法加载指定的文件名作为一个动态库。
     * 15	void loadLibrary(String libname)
     * 此方法加载指定的库名的动态库。
     * 16	long maxMemory()
     * 此方法返回内存，Java虚拟机将尝试使用的最大数。
     * 17	boolean removeShutdownHook(Thread hook)
     * 此方法去注册一个以前注册的虚拟机关闭挂钩。
     * 18	void runFinalization()
     * 这种方法运行最后审定的任何对象最后确定方法。
     * 19	long totalMemory()
     * 此方法返回存储器中的Java虚拟机的总量。
     * 20	void traceInstructions(boolean on)
     * 此方法允许/禁止跟踪指令。
     * 21	void traceMethodCalls(boolean on)
     * 此方法允许/禁止的方法调用跟踪。
     */
}
