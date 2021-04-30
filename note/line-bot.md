# Serverless frameworkでLINE Botを作成する

## 参考資料
https://qiita.com/narikei/items/8c6cd9e05621dcd444e5  

## 作りたいもの
メトロポリタンAPI * LINE Bot  
LINEで番号を入力するとそのIDに紐づく作品のタイトル、画像、作者を返すBot  
Serverless frameworkの活用  

### STEP1
おうむ返しのLINE Bot  
まずはLINEとの接続を確率しおうむ返しできるようにする。  

### STEP2
メトロポリタンAPIを使用した処理の実装  

### STEP3
GitHubActionsを使用してpushされたら自動デプロイを実行する。  

### STEP4 amazon aurora または　DynamoDBの活用
一度検索したことのあるIDはDBに保存して、WSClientで取得しなくても即時に表示できるようにする。  
DynamoDBしか連携できない疑惑  

### STEP5 S3の活用
取得した画像をS3に保存する。  

## 必要な作業
LambdaにLINEのアクセスキーを設定  
Lambda関数の作成  

## 学び
ベアメタル：IaaSではソフトウェアがインストールされていないまっさらな状態のサーバーやHDDのこと。  
amazonがEC2をリリースしたのは2008年。クラウドコンピューティングの幕開け。  
SLA：Service Level Agreementの略。サービスを提供事業者とその利用者の間で結ばれるサービスのレベル(定義、範囲、内容、達成目標)に関する合意サービス水準、サービス品質保証などと訳される。  
個別の機能はある程度モジュール化されているのでAPIで繋ぎ合わせればサービス構築は各段に早くなる。  
サーバーレスはアイドル状態の料金がかからない。  

## タスク
[ ] 手動でLambdaとAPI Gatewayを設定する  

