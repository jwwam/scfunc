这是一个简单的springcloud function范例  
详细说明地址：https://blog.csdn.net/zhulier1124/article/details/100133932  

启动后默认8080端口，测试请求地址  
curl localhost:8080/word -H "Content-Type: text/plain" -d "aa,bb,cc,dd,ee"   
curl localhost:8080/reverseString -H "Content-Type: text/plain" -d "Baeldung User"    
curl localhost:8080/greeter -H "Content-Type: text/plain" -d "World"   
  
