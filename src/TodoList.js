import React from 'react';
import Todo from './Todo';

class TodoList extends React.Component {
render(){
  const _props = this.props;
  const todos = [];
  for(let i=0; i< Object.keys(_props).length; i++){
    todos.push(<li><Todo {..._props[i]}/></li>);
  }
return (<div className="toList">
 <ul>
   {todos}
 </ul>
</div>);
}
}
export default TodoList;
