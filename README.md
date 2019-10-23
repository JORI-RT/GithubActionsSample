# GithubActionsSample

## heroku
## herokuへのデプロイ
* github actionsとの連携はまだ、ローカルからherokuへのデプロイ手順を書く
```

heroku login

heroku create

heroku addon:みたいな感じでDBを作る
https://devcenter.heroku.com/articles/heroku-postgresql

作ったPostgresqlのセッティングをapplication.ymlに書く
spring:
  datasource:
    url: jdbc:postgresql://haxitkllyitchb:96a9b73d86e8ae1397e353195c07e82089244fa6b1810ada85f5ab45fde5196a@ec2-54-163-255-1.compute-1.amazonaws.com:5432/d9ilikcb97gf6o
    username: haxitkllyitchb
    password:xxxxx 
    driver-class-name: org.postgresql.Driver
    
herokuのセッティングに書いてある

Procfileに以下のように書く
web: java -jar -Dserver.port=$PORT demo/build/libs/demo-0.0.1-SNAPSHOT.jar --server.port=$PORT --spring.profiles.active=herok
Procfileはプロジェクトルートに置く

git push heroku master

logは以下で見る
heroku logs --tails
JDKは1.8がデフォルト、gradleで設定すれば11にできる　＝＞　11とかにしないとテストコケる

たぶん本当は、秘密情報をgithub actionsのsecretにいれて環境変数経由でなんとかするのか？？？
```