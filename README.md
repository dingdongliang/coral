# scatter
dubbo分布式开发架构

##scatter-api
- 接口声明，依赖scatter-entity

##scatter-core
- 第三方jar包与工具类

##scatter-entity
- 实体类与model

##scatter-servers
- 提供者，依赖scatter-api与scatter-core

##scatter-web
- 消费者，依赖scatter-api与scatter-core

##启动顺序：
- 本机先安装github的客户端，配好环境变量
- 安装zookeeper，下载路径http://hadoop.apache.org/zookeeper/
- 解压后修改conf文件夹下面的zoo_simple.cfg为zoo.cfg，里面的配置参考如下：

      tickTime=2000
      
      initLimit=10
      
      syncLimit=5
      
      dataDir=安装目录/data
      
      dataLogDir=安装目录/log
      
      clientPort=2181
      
      server.1=localhost:2287:3387

- 启用zookeeper
- 把服务提供方跑起来，成功后使用 ls /命令会发现zk里多出了一个dubbo的节点，所有服务全注册在这里了 
- 运行服务消费方调用测试
- 浏览器访问 http://localhost:8888/user/insert
- dubbo管理界面:dubbo-admin，使用alibaba自带的
- dubbo-monitor项目用于性能监控，使用韩都的项目
- 以上不懂，自行百度
