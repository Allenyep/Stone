## 函数功能

#### 相关语法规则
```
param: IDENTIFIER
params: param{"," param}
param_list: "("[params]")"
def: "def" IDENTIFIER param_list block
postfix: "("[args]")"
primary: ("("expr")"|NUMBER|IDNTIFIER|STRING){postfix}
simple : expr [ args ]
program : [ def | statment ] ( "," | EOL)
```
FuncParser继承BasicParser实现语法规则
#### 执行函数
添加eval函数扩展

### 闭包
添加支持闭包的语法分析器ClosureParser和解释器ClosureInterpreter

