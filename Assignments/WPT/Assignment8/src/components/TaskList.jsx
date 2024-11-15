import React, { useState } from 'react';
import { Link } from 'react-router-dom';

function TaskList() {
  const [tasks, setTasks] = useState([]);
  const [filter, setFilter] = useState('');
  const [search, setSearch] = useState('');

  const filteredTasks = [];

  for (let i = 0; i < tasks.length; i++) {
    const task = tasks[i];

    // Check if task matches search and filter conditions
    if (
      task.title.includes(search) &&
      (filter === '' || task.priority === filter)
    ) {
      filteredTasks.push(task);
    }
  }

  return (
    <div>
      <h3>Task List</h3>
      <input
        placeholder="Search tasks..."
        onChange={(e) => setSearch(e.target.value)}
      />
      <select onChange={(e) => setFilter(e.target.value)}>
        <option value="">All</option>
        <option value="Low">Low</option>
        <option value="Medium">Medium</option>
        <option value="High">High</option>
      </select>

      {filteredTasks.map((task) => (
        <div key={task.id} className="card mb-3">
          <div className="card-body">
            <h5 className="card-title">{task.title}</h5>
            <p className="card-text">{task.description}</p>
            <p>Priority: {task.priority}</p>
            <p>Due: {task.dueDate}</p>
            <Link to={`/task/${task.id}`} className="btn btn-primary">
              View Task
            </Link>
          </div>
        </div>
      ))}
    </div>
  );
}

export default TaskList;
