自动提交表单小助手，采用自动化测试框架selenium来提交表单
使用的是谷歌浏览器，需要下载ChromeDriver驱动程序
由于登录页有验证码，需要读取验证码，所以采用java对验证码去除部分干扰项之后通过Tesseract-OCR该软件进行图片识别，该软件的识别率不高，特别是有干扰项的时候

右下角小图标采用utf-8会出现乱码问题，需要在启动程序中增加参数-Dfile.encoding=GB18030

使用Java应用定制工厂可以将jar拷贝到app文件夹下、jre拷贝到jre目录，并生成exe的可执行引导文件，使用Inno Setup可以将生成的可执行文件创建出安装exe程序
