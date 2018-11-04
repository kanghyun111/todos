import React from 'react';
import Todo from './Todo';

class TodoSucList extends React.Component {
  render(){
    const _props = this.props;
    const todos = [];
    for(let i=0; i< Object.keys(_props).length; i++){
      todos.push(_props[i]);
    }
  return (

    <div className="didList">
  <ul>
    {todos.didList.forEach(did =>{
      return <Todo {...did}></Todo>
    })}
  </ul>
  </div>);
  }
}
export default TodoSucList;
