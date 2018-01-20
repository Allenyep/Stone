## 面向对象设计
类的实现。依靠JAVA当中的类，定义所有的类为(JAVA)ClassInfo对象，而所有的类的对象为(JAVA)StoneObject的对象。
在环境记录当中，Stone现有的列表如下：
<div>
      <table border="0">
	  <tr>
	    <th>Stone</th>
	    <th>JAVA</th>
	  </tr>
	  <tr>
	    <td>整数</td>
	    <td>Integer对象</td>
	  </tr>
	  <tr>
      	 <td>字符串</td>
      	 <td>String对象</td>
      </tr>
	  <tr>
      	 <td>函数</td>
      	 <td>Function对象</td>
      </tr>
	  <tr>
      	 <td>原生函数</td>
      	 <td>NativeFunction对象</td>
      </tr>
	  <tr>
      	 <td>类定义</td>
      	 <td>ClassInfo对象</td>
      </tr>
	  <tr>
      	 <td>Stone类对象</td>
      	 <td>StoneObject对象</td>
      </tr>
	</table>
</div>

### 语法规则
member : def | simple

class_body : "{" [member] {(";"|EOL)[member]}"}"

defclass : "class" INDENTIFIER ["extends" INDENTIFIER] class_body

postfix : "class" INDENTIFIER | "(" [args] ")"

program : [defclass | def | statement] (";" |EOL)

依靠eval方法实现语法规则

### 通过闭包表示对象
StoneObject保存Stone对象所包含字段值，将对象视作环境。
