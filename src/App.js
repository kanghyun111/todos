import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import TodoList from './TodoList';
import ToEditor from './ToEditor';

class App extends Component {
  constructor(props){
    super(props)

    this._getListes = this._getListes.bind(this)
  }


  state = {
  }

  componentDidMount(){
    this._getListes();
  }


  _getListes = async() =>{
      console.log('wow what is this')
      const todoList = await this._callApi();

      this.setState({
        todoList: todoList,
        toList : todoList.todoList.filter(li=>{
              return (li.state=='0');
            })
        , didList : todoList.todoList.filter(li=>{
          return (li.state=='1');}
        )
      }
    )
    }

    _callApi = () =>{
      return fetch('http://58.127.214.52:8082/todo/?userNo=1')
      .then(response => response.json())
      .then(todoList => todoList)
    }

  _loading=()=>{
return <img src={logo} className="App-logo" alt="logo" />
  }

  _renderComponents =()=>{
    console.log(this.state.toList)
    return (
      <div>
        <h5>할일 목록</h5>
  {this.state.toList.length!=0 ? <TodoList {...this.state.toList} /> : <label> 목록이 비었습니다.</label>}
  <ToEditor _getListes={this._getListes}/>
</div>
  )
  }


  render() {
    const { todoList } = this.state;
    console.log(this.state.toList)
    return (
      <div className={todoList ? "App" : "App--loading"}>
        <header className="App-header">
        {this.state.todoList!=null ? this._renderComponents() : this._loading()}
      </header>
      </div>
    );
  }
}

export default App;
