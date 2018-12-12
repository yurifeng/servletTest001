package com.seaven.tcas.util;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yurifeng
 * @create 2018-12-10 13:49
 * @package_name com.seaven.tcas.util
 * @project_name servletTest001
 */
public class GzipResponse extends HttpServletResponseWrapper {

    private ByteArrayOutputStream baos;

    private PrintWriter pw;


    /**
     * 必须的构造方法
     *
     * @param response
     */
    public GzipResponse(HttpServletResponse response) {
        super(response);
        baos = new ByteArrayOutputStream();
    }

    /**
     * 重写getWriter方法
     *
     * @return
     */
    @Override
    public PrintWriter getWriter() {
        pw = new PrintWriter(baos, true);
        return pw;
    }

    /**
     * 获取ByteArrayOutputStream
     *
     * @return
     */
    public ByteArrayOutputStream getBaos() {
        if (pw != null) {
            pw.flush();
        }
        return baos;
    }


    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        return super.getOutputStream();
    }
}
