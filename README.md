# PermissionX

PermissionX是简化Android运行时权限用法的开源库。

改自https://github.com/guolindev/PermissionX.git

为了方便Java调用，使用Java修改的版本。

简单示例：

```java
  final String[] permissions = {Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.BLUETOOTH, Manifest.permission.BLUETOOTH_ADMIN};
  PermissionX.requestNoDenied(this,permissions);
```

