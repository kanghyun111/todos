import React from 'react';
import './Todo.css'
class Todo extends React.Component {

render(){
  console.log(this.props);
  return (
    <div>
    <span className="todoStyle">
<input type='checkbox'/>
    <label>{this.props.rank}</label>
    <label>제목 : </label><label>{this.props.title}</label>
    <button type="button">수정</button>
    <button type="button">삭제</button>
</span>

<p>
  <label>내용 : </label><br></br><label>{this.props.content}</label>
</p>
</div>
)
}
}
export default Todo;
