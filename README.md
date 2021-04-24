# serverless-playground
## 資料
[The Serverless framework](https://www.serverless.com/)  
[Serverless Frameworkの使い方まとめ](https://serverless.co.jp/blog/25/)  
[ServerlessFrameworkでScala+Lambda+APIGateway構成プロジェクトを作成](https://qiita.com/Kuchitama/items/d6c92f079dd8ee0ceaf0)  

## タスク
[ ] amazonアカウントの作成
[ ] lambdaの設定
[ ] サービスとawsを連携
[ ] サービスをデプロイ

## sbt assembly
コンパイルを実行しjarファイルを生成する。  
```scala
[error] [launcher] could not retrieve sbt 1.3.2
```
が発生した場合には `sbt about `を実行してsbtのバージョンを確認する。  
そのバージョンとサービスのバージョンを一致させる。  

