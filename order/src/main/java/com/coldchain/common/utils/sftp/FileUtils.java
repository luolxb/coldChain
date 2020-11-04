package com.coldchain.common.utils.sftp;

import com.coldchain.common.utils.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * 文件操作工具类
 * 2019年12月17日
 */
public class FileUtils {

    /**
     * 解压tar.gz文件
     *
     * @param targetPath 要解压的tar.gz文件
     * @throws IOException 异常
     */
    public static boolean unTarGz(String targetPath) throws IOException {
        return unTarGz(targetPath, getFilePath(targetPath));
    }

    /**
     * 解压tar.gz文件
     *
     * @param targetPath 要解压的tar.gz文件
     * @param outputDir  要解压到某个指定的目录下
     * @throws IOException 异常
     */
    public static boolean unTarGz(String targetPath, String outputDir) throws IOException {
        boolean flag = false;
        if (!getExtension(targetPath).equalsIgnoreCase("gz")) {
            throw new IOException("解压文件不是tar.gz格式");
        }
        createDirectory(outputDir, null);  // 创建输出目录
        try {
            GZIPInputStream in = null;
            try {

                in = new GZIPInputStream(new FileInputStream(targetPath));
            } catch (FileNotFoundException ex) {
                flag = false;
                throw new IOException("未找到文件.", ex);
            }

            String outFilePath = outputDir + getFileName(targetPath);
            System.out.println(outFilePath);
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(outFilePath);
            } catch (FileNotFoundException ex) {
                flag = false;
                throw new IOException("无法写入文件.", ex);
            }

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();
            flag = true;
        } catch (IOException ex) {
            flag = false;
            throw new IOException("解压归档文件出现异常", ex);
        }
        return flag;
    }

    /**
     * 读取.txt文件（逐行读取）
     *
     * @param targetPath 指定的目录
     * @return 结果
     */
    public static List<List<String>> readTxt(String targetPath) throws IOException {
        List<List<String>> list = new ArrayList<>();
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(new File(targetPath)));
            //设置编码类型
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            String line = "";
            String everyLine = "";
            while ((line = br.readLine()) != null) {
                everyLine = line;
                //将str转为为list
                list.add(Arrays.asList(everyLine.split(",", 20)));
            }
        } catch (IOException ex) {
            throw new IOException("读取.txt文件出现异常", ex);
        }
        return list;
    }

    /**
     * 构建目录
     *
     * @param outputDir 指定目录
     * @param subDir    子目录
     */
    public static void createDirectory(String outputDir, String subDir) {
        File file = new File(outputDir);
        if (!(subDir == null || subDir.trim().equals(""))) {//子目录不为空
            file = new File(outputDir + "/" + subDir);
        }
        if (!file.exists()) {
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            file.mkdirs();
        }
    }

    /**
     * 删除目录下单所有文件
     *
     * @param filePath 删除文件的目录
     * @return 结果
     */
    public static boolean removeDirectory(String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            return false;
        }
        File file = new File(filePath);
        if (StringUtils.isNull(file)) {
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        File[] filePaths = file.listFiles();
        for (File f : filePaths) {
            if (f.isFile()) {
                f.delete();
            }
            if (f.isDirectory()) {
                String fpath = f.getPath();
                removeDirectory(fpath);
                f.delete();
            }
        }
        return true;
    }

    /**
     * 删除文件
     *
     * @param filePath 文件
     * @return
     */
    public static boolean deleteFile(String filePath) {
        boolean flag = false;
        File file = new File(filePath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

    /**
     * 目录下所有文件列表
     *
     * @param dir 目标目录
     * @return 结果
     */
    public static void fileList(File dir, List<String> fileNameList) {
        // 判断是否存在目录
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }
        // 读取目录下的所有目录文件信息
        String[] files = dir.list();
        // 循环，添加文件名或回调自身
        for (int i = 0; i < files.length; i++) {
            File file = new File(dir, files[i]);
            if (file.isFile()) { //如果是文件
                fileNameList.add(file.getPath());
            } else { //如果是目录
                // 回调自身继续查询
                fileList(file, fileNameList);
            }
        }
    }

    /**
     * 用于提取和返回给定文件的扩展名
     *
     * @param str 文件的扩展名
     * @return 得到扩展名
     */
    public static String getExtension(String str) {
        String ext = "";
        int i = str.lastIndexOf(".");

        if (i > 0 && i < str.length() - 1) {
            ext = str.substring(i + 1);
        }
        return ext;
    }

    /**
     * 用于提取文件的路径。
     *
     * @param str 传入文件以获取文件名
     * @return 表示没有扩展名的文件名
     */
    public static String getFilePath(String str) {
        String fname = "";
        int i = str.lastIndexOf('/');

        if (i > 0 && i < str.length() - 1) {
            fname = str.substring(0, i);
        }
        return fname;
    }

    /**
     * 用于提取没有扩展名的文件名称。
     *
     * @param str 传入文件以获取文件名
     * @return 表示没有扩展名的文件名
     */
    public static String getFileName(String str) {
        String fname = "";
        int i = str.lastIndexOf('/');
        int j = str.lastIndexOf('.');

        if (i > 0 && j > 0) {
            fname = str.substring(i, j);
        }
        return fname;
    }

    /**
     * 用于提取带扩展名的文件名称。
     *
     * @param str 传入文件以获取文件名
     * @return 表示没有扩展名的文件名
     */
    public static String getFileNameSuffix(String str) {
        String fname = "";
        int i = str.lastIndexOf('/');

        if (i > 0) {
            fname = str.substring(i);
        }
        return fname;
    }

    public static void main(String[] args) {
        String targetPath = "/Users/desom/Downloads/agg";
        List<String> fileNameList = new ArrayList<>();
        FileUtils.fileList(new File(targetPath), fileNameList);
        for (String value : fileNameList) {
            System.out.println(value);
            String utcTime = FileUtils.getFileName(value).substring(7, 21);
            System.out.println(utcTime);
        }
    }
}
