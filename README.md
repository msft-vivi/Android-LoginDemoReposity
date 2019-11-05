## Android端连接Mysql登录验证样例

### 项目架构
```.
├── build
│   └── classes
│       └── com
│           └── zhangwei
│               ├── dao
│               ├── entity
│               ├── service
│               ├── servlet
│               └── util
├── src
│   └── com
│       └── zhangwei
│           ├── dao
│           │   └── UserDAO.java # 数据库访问操作
│           ├── entity
│           │   └── UserInfo.java # 定义模型信息
│           ├── service
│           │   └── UserService.java # 服务抽象
│           ├── servlet
│           │   ├── LoginServlet.java # 与web服务器进行交互，post/get请求
│           │   └── UserServlet.java
│           └── util
│               ├── DBUtil.java # JDBC：数据库连接操作
│               └── StreamTools.java
└── WebContent
    ├── index.jsp
    ├── META-INF
    │   └── MANIFEST.MF
    └── WEB-INF
        ├── lib
        │   └── mysql-connector-java-5.1.45
        │       ├── build.xml
        │       ├── CHANGES
        │       ├── COPYING
        │       ├── mysql-connector-java-5.1.45-bin.jar
        │       ├── README
        │       ├── README.txt
        │       └── src
        └── web.xml
```
其中src是核心代码，此项目使用MVC开发设计模式。
