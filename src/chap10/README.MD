##实现数组

### 语法规则
```
elements : expr { "," expr}
primary : ( "[" [ elements ] "]" | "(" expr ")" | NUMBER |INDENTIFIER |STRING ){postfix}
postfix : "(" [args] ")" | "[" expr "]"
```
postfix使得标识符不仅能表示实参序列，还支持数组下标

### 仅通过修改器实现数组
扩展语法