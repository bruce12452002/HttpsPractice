https://docs.oracle.com/javase/8/docs/technotes/tools/unix/keytool.html
keytool -genkeypair -alias xxx -keyalg RSA -keystore D:\xxx.key


成功後將 xxx.key 放在 yml 設定的地方
然後試 http://localhost:8080/http 和 https://localhost:8443/http