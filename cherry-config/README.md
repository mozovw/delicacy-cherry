1、查看对应项目的config repo中文件
curl -X GET http://localhost:11000/cherry-config-client/default(dev/test)
2、涮新对应项目的config repo中文件
curl -X POST http://localhost:11001/refresh
3、查看变化
curl -X GET http://localhost:11001/message

