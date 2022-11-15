package constans;

import java.util.Map;

public class QuestType {


    public  static Map<String,Integer> typeMap;


    public final static int
            connect = 0X001,


    //启动
    launchRequest = 0x002,


    //关闭
    disconnectRequest = 0x003,


    //函数断点??
    setFunctionBreakPointsRequest = 0x004,


    //设置断点
    setBreakPointsRequest = 0x005,


    /**
     * 本地断点？
     */
    breakpointLocationsRequest = 0x006,

    /**
     * 请求显示异常?
     */
    exceptionInfoRequest = 0x007,


    /**
     * 设置异常点??
     */
    setExceptionBreakPointsRequest = 0x008,

    /**
     * 线程请求
     */
    threadsRequest = 0x009,

    /**
     * 请求堆栈数据
     */
    stackTraceRequest = 0x00A,


    /**
     * 请求作用域内所有的调试数据?
     */
    scopesRequest = 0x00B,


    /**
     * 内存写入
     */
    writeMemoryRequest = 0X00C,

    /**
     *
     */
    readMemoryRequest = 0x00D,


    /**
     * 变量请求
     */
    variablesRequest = 0x00E,

    /**
     *
     */
    setVariableRequest = 0x00F,

    /**
     *
     */
    sendDataToProxy = 0x010,


    /**
     *
     */
    continueRequest = 0x011,

    /**
     *
     */

    reverseContinueRequest = 0x012,

    /**
     *
     */
    nextRequest = 0x013,

    stepBackRequest = 0x014,
            stepInTargetsRequest = 0x015,
    /**
     * 单步进入?
     */
    stepInRequest = 0x016,


    /**
     * 单步出？
     */
    stepOutRequest = 0X017,

    evaluateRequest = 0x018,
    /**
     * 设置表达式，根据参数来?
     */
    setExpressionRequest = 0x019,


    /**
     * 断点信息？
     */
    dataBreakpointInfoRequest = 0x01A,

    /**
     * 数据断点??
     */
    setDataBreakpointsRequest = 0x01B,

    /**
     * 这啥？谢特
     */
    completionsRequest = 0x01C,

    cancelRequest = 0X01D,
            disassembleRequest = 0x01E,
    //指令断点
    setInstructionBreakpointsRequest = 0x01F,
    //自定义请求?
    customRequest = 0x20;

}
