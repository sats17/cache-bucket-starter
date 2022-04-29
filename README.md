# cache-bucket-starter
Starter dependency for cache-bucket.

<br>

Versions
-----------

|  cache-bucket-starter |
|:---------------------:|
|         1.0.0         |

#### Maven Dependency
```xml
<dependency>
  <groupId>com.github.sats17</groupId>
  <artifactId>cache-bucket-starter</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Configuration in application.yml
```yaml
cachebucket:
  capacity: 150
  ttl: 5000 # ttl in milliseconds, if not mentioned then cache will not expire
```



