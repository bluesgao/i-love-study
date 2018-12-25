package com.bluesgao.ilovestudy.core;

/*
* 包作用：
* api 对外接口服务（restapi）
* biz 业务服务（业务组装层）
* service 基础服务
* mapper mysql访问层
* entity 实体层
*
* 包依赖：(只允许单向依赖)
* api依赖biz
* biz依赖service
* service依赖mapper和entity
*
* */