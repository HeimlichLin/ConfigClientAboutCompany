# ConfigClientAboutCompany

先啟動 SpringCloudConfigServer (在8888上執行)

用 http://localhost:8888/app-about-company.properties 確認

Run As -> Maven install

D:

cd D:\JAVA_WORKSPACE\Spring\ConfigClientAboutCompany\target

java -jar SpringCloudConfigServer-0.0.1-SNAPSHOT.jar

因為DB連線資訊不為真，因此會顯示無法連線等訊息

若正確連線，下面url會取得連線資訊

http://localhost:7788/showConfig

http://localhost:7788/pingDataSource

