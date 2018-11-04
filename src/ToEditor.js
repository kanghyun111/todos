import React from 'react';

class ToEditor extends React.Component {
constructor(props){
  super(props);
  this.title = React.createRef();
  this.contnet = React.createRef();
  this._subMitTodo = this._subMitTodo.bind(this);
}


_subMitTodo=async()=>{
   await fetch('http://58.127.214.52:8082/todo',{
    headers:{
      "Content-Type": "application/json"

    },
    method:'POST',
    mode:'cors',
    cache:'default',
    body : JSON.stringify({
      userNo : 1,
      title : this.title.current.value,
      content : this.contnet.current.value
    })
  })

  this.title.current.value='';
  this.contnet.current.value='';

  this.props._getListes();
}
render(){
  return (
  <div>
    <h5>할일 등록</h5>
<span>  제목 : <input ref={this.title}/></span>
<br>
</br>

내용 : <textarea ref={this.contnet}></textarea><br></br>
<input type="button" onClick={this._subMitTodo} value="등록"/>
</div>

)
}
}
export default ToEditor;
