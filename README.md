# PermissionEasier

 ![GitHub](https://img.shields.io/github/license/wulidanxi/PermissionEasier)
 ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/wulidanxi/PermissionEasier)

PermissionEasier是简化Android运行时权限用法的开源库。

改自https://github.com/guolindev/PermissionX.git

为了方便Java调用，使用Java修改的版本。

本项目仅用于学习。

简单示例：

项目中导入库：

```groovy
dependencies{
  ...
  implementation 'com.stars.wulidanxi:permissionE:1.0.0'
}
```

具体使用:

```java
  final String[] permissions = {Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.BLUETOOTH, Manifest.permission.BLUETOOTH_ADMIN};
  PermissionEasier.INSTANCE.requestNoDenied(this,permissions);
```

