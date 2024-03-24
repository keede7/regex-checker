[![](https://jitpack.io/v/keede7/regex-checker.svg)](https://jitpack.io/#keede7/regex-checker)

### Regex Checker 

```
간편하게 문자를 검증할 수 있도록 정규표현식 모음을 제공하는 오픈소스 라이브러리
```

---

### 사용방법

1.  `build.gradle` 에 작성해주세요. **( `jitpack` 공식홈페이지 내용과 동일 )**

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.keede7:regex-checker:Tag'
}
```

2. `Tag` 에는 최상단의 `Version` 을 명시하거나, 최신 `Release Tag`를 명시해주세요.

---

### 여러 도메인을 주제로 필요한 정규표현식을 PR 해주시거나 제안해주세요.