package com.liuhuan.backend.core.saver;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;

/**
 * @author L_H
 * @since 2026-01-20 14:11:13
 */
public abstract class CodeFileSaverTemplate<T> {

    // 文件保存根目录
    private static final String FILE_SAVE_ROOT_DIR = System.getProperty("user.dir") + "/tmp/code_output";

    public final File saveCode(T result){
        //1.获取类型(调用子类方法)
        String codeGenType = getCodeGenType();
        //2.构建唯一目录
        String baseDirPath = buildUniqueDir(codeGenType);
        //3.保存文件（由子类实现）
        saveFiles(result,baseDirPath);
        //4.返回目录文件对象
        return new File(baseDirPath);
    }

    /**
     * 构建唯一目录路径
     *
     * @param bizType
     * @return 目录路径
     */
    protected final String buildUniqueDir(String bizType) {
        String uniqueDirName = StrUtil.format("{}_{}", bizType, IdUtil.getSnowflakeNextIdStr());
        String dirPath = FILE_SAVE_ROOT_DIR + File.separator + uniqueDirName;
        FileUtil.mkdir(dirPath);
        return dirPath;
    }


    /**
     * 写入单个文件
     */
    protected final void writeToFile(String dirPath, String filename, String content) {
        boolean b = StrUtil.isBlank(filename);
        if (!StrUtil.isBlank(filename)) {
            String filePath = dirPath + File.separator + filename;
            FileUtil.writeString(content, filePath, StandardCharsets.UTF_8);
        }

    }

    /**
     * 获取代码类型(由子类实现)
     *
     * @return代码生成类型
     */
    protected abstract String getCodeGenType();

    /**
     * 保存文件的具体实现()
     *
     * @param result
     * @param baseDirPath
     */
    protected abstract void saveFiles(T result, String baseDirPath);
}
