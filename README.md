# Stone
a new simple program language


## Lexer 词法分析器
支持3种类型的单词(Token)：标识符，整形，字符串
通过正则表达式识别单词类型

## ast 抽象语法树
例：13 + x * 2  BinaryExpr表示双目运算符表达式，Name表示x，NumberLiteral表示13和2
ASTLeaf类似于终结符，有Name和NumberLiteral两个子类
ASTList有BinaryExpry子类

## 语法分析
借助Parser库进行语法分析，这是一种解析器组合子类型的库。
BasicParser对Stone语法进行了规范，例如
``` java
paren: "("expr")"
``` 
转换为java之后
``` java
Parser paren =rule().sep("(").ast(expr).sep(")");
```

