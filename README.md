# oldx-admin后台管理系统     
## 项目简介

oldx-admin是一款后台通用脚手架。基于Springboot+Springsecurity+jwt+redis+vue的前后端分离脚手架适合开发者快速上手，封装后台常用工具，私活开发脚手架或者权限系统学习都是一个不错的选择，易上手，系统会陆续更新。

### 演示地址

演示环境帐号密码

| **帐号** | **密码** |   **权限**    |
| :------: | :------: | :-----------: |
| **moli** | **moli** | **admin,all** |

本地部署账号密码：

| 账号 | 密码 |                            权限                             |
| ---- | ---- | :---------------------------------------------------------: |
| oldx | oldx |              超级管理员，拥有所有增删改查权限               |
| moli | moli | 注册账户，拥有查看，新增权限（新增用户除外）和导出Excel权限 |
| test | test |                 测试人员，只能查看某些数据                  |

#### 主要特性

- 项目按功能模块化，提升开发，测试效率。
- 高效率开发，使用代码生成器可以一键生成后端通用crud代码
- 支持数据字典，可方便的对一些状态进行管理
- 支持接口限流，避免恶意请求导致服务层压力过大
- 支持接口级别的功能权限与数据权限，可自定义操作
- 自定义权限注解与匿名接口注解，可快速对某一接口拦截与放行
- 对一些常用的前端组件封装：表格数据请求、数据字典等
- 前后端统一异常拦截处理，统一输出异常，避免繁琐的判断

#### 系统功能

- 用户管理：提供用户的相关配置，新增用户后，默认密码为123456
- ~~角色管理：对权限与菜单进行分配，可根据部门设置角色的数据权限~~
- ~~菜单管理：已实现菜单动态路由，后端可配置化，支持多级菜单~~
- 部门管理：可配置系统组织架构，树形表格展示
- 岗位管理：配置各个部门的职位
- ~~字典管理：可维护常用一些固定的数据，如：状态，性别等~~
- 操作日志：记录用户操作的日志
- 异常日志：记录异常日志，方便开发人员定位错误
- SQL监控：采用druid 监控数据库访问性能，默认用户名admin，密码123456
- ~~定时任务：整合Quartz做定时任务，加入任务日志，任务运行情况一目了然~~
- 代码生成：高灵活度一键生成前后端代码，减少百分之80左右的工作任务
- ~~邮件工具：配合富文本，发送html格式的邮件~~

### 技术选型

#### 后端

- [Spring Boot 2.1](http://spring.io/projects/spring-boot/)
- [Mybatis-Plus](https://mp.baomidou.com/guide/)
- [MySQL 5.7.x](https://dev.mysql.com/downloads/mysql/5.7.html#downloads),[Hikari](https://brettwooldridge.github.io/HikariCP/),[Redis](https://redis.io/)
- [Shiro 1.4.2](http://shiro.apache.org/)

#### 前端

- [Layui 2.5.5](https://www.layui.com/)
- [Nepadmin](https://gitee.com/june000/nep-admin)
- [formSelects 4.x 多选框](https://hnzzmsf.github.io/example/example_v4.html)
- [eleTree 树组件](https://layuiextend.hsianglee.cn/eletree/)
- [formSelect.js树形下拉](https://wujiawei0926.gitee.io/treeselect/docs/doc.html)
- [Apexcharts图表](https://apexcharts.com/)

### 项目结构如下:

​          

### 系统截图

暂无

讨论群/反馈交流欢迎大家一起摸鱼

QQ群： [![加入QQ群](https://img.shields.io/badge/未满974751082-blue.svg)](https://jq.qq.com/?_wv=1027&k=5HBAaYN) 

兼容性

暂无



