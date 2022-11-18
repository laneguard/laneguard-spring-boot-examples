#基本的linux命令

ssh narad@192.168.50.2 远程登陆主机

使用文件传输协议连接服务器
ftp 192.168.50.2
sftp 192.168.50.2
```shell
上传或者下载文件
# ftp > mput *.txt
# ftp > mget *.txt
```
free 查看内存

top 查看进程

tar 解压缩
tar -cvf archive-name.tar /home
tar -xvf archive-name.tar

find 查找文件
find / -name tecmint
/var/spool/mail/tecmint
/home/tecmint
/root/home/tecmint

cd 进入某个目录

pwd 显示当前目录路径

ls(ll) 列出当前目录的文件 ll就是ls -l，列出详细信息

touch 新建一个文件

rm 删除要给文件，加上-rf，就是强制删除目录

mkdir 新建一个目录

mv 移动文件，或者是更改文件名称，mv index.html ./aa，这就是将index.html移动到./aa目录下。mv index.html ./aa/bb.html，这是就是将index.html移动到./aa目录下并改名为bb.html

reset 重新初始化终端/清屏

clear 清屏

history 查看命令历史

help 帮助

cat 显示文件内容
cat -n 显示行号

crontab 定时任务
crontab -l 查看定时任务
crontab -e 编排定时任务
00 10 * * * /bin/ls >/ls.txt

查找和关闭进程
ps -ef | grep init
root         1     0  0 07:53 ?        00:00:04 /sbin/init
root      7508  6825  0 11:48 pts/1    00:00:00 grep init
kill- 9 7508

表 1 RPM 包默认安装路径
安装路径	含 义
/etc/	配置文件安装目录
/usr/bin/	可执行的命令安装目录
/usr/lib/	程序所使用的函数库保存位置
/usr/share/doc/	基本的软件使用手册保存位置
/usr/share/man/	帮助文件保存位置

与 RPM 包不同，源码包的安装通常采用手动指定安装路径（习惯安装到 /usr/local/ 中）的方式。
既然安装路径不同，同一 apache 程序的源码包和 RPM 包就可以安装到一台 Linux 服务器上（但同一时间只能开启一个，因为它们需要占用同一个 80 端口）。
