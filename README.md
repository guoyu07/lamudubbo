# lamudubbo
辣木dubbo服务端
## 辣木dubbo介绍
> 1.辣木dubbo起源于2016年2月份答应朋友搭建一个以销售辣木产品为主的电子商务平台，最初的设计  
  > 不包含dubbo部分，service层和controller是放在一个整体项目中，最初项目仅仅是一个小型项目，  
  > 断断续续编写业务，期间忙着工作和游山玩水因此一直搁置，除了本次更新，最近的一次更新是在SourceForge  
  > 上，并且是9个月前（刚刚集成dubbo,但不完善），直到最近才将其迁移到Git上.
------
>
> 2.目前辣木dubbo服务端的主要内容是做成一个soa服务化的东西，将数据库操作，业务和事务操作都放在dubbo  
中，并且对外暴露api接口和参数定义，实际业务逻辑和数据库操作都是透明的。并且高度集成spring，无缝衔接spring  
此服务端可以集成在spring-maven项目中，并且客户端可能感应不到他在调用一个dubbo服务，就像调用普通的service服务一样。后期dubbo项目会做成分布式和集群，确保业务的正常运转和健壮性。
------
>
> 3.辣木dubbo的主要技术架构：lamu-api(接口暴露和协议参数定义)，lamu-dao(mybatis集成mybatis-generator进行orm操作),lamu-soa(dubbo服务实现，调用dao层实现业务，可能会调用事务)
在序列化处理上，现在采用的是kyro，原因主要在于：速度和性能目前最优秀，并且是二进制序列化相对安全。采用mybatis框架主要在于可以快速方便进行数据对象操作
省事省力。而将dubbo-api协议单独抽出一个模块因为这个lamu-api在经过打包后 会加入客户端的lib库中，方便客户端调用协议。
## lamu-dubbo试用人群
> 1.这仅仅是个demo，虽然后续会加入微信支付宝业务，并且会加入redis缓存和ehcache的支持，但不建议直接copy做为线上发布版本的副本。仅供学习参考之用，
新手上手dubbo可以将其作为练手项目
--
## 安装试用
> 1.requirement
>> 1.jdk1.7 or later  
    dubbo服务依赖jdk，这个无需再说明，建议1.7版本以上，1.6暂时没有试过 <br/>
>> 2. zookeeper 3.4.6
    zookeeper是该项目的注册中心，暂时没有用到监控中心和集群，如果你暂时不了解zookeeper,建议先阅读dubbo官方文档 <br/>
> 2.项目相关sql文件
  项目相关的表sql我会后续放在项目路径中，需要的可以下载导入，之后将jdbc.properties文件中的数据库地址和用户名账号密码修改即可使用 <br/>
  ----
> 2.启动
  >>将项目pull到自己的idea中，并且进行maven打包，将lamu-soa模块下target中的lamu-soa.jar包运行，运行命令直接java -jar lamu-soa.jar即可运行
  默认打印日志debug，并且日志在根目录下st-soa.log，如果你想打印到控制台可以 nohup java -jar lamu-soa.jar 像这样。采用默认的profile。
## 联系
> 有任何疑问可以致电 +1 5162091310 （宋先生）
> 邮箱：slsongliang@gmail.com
  
  
    
  

