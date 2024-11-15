import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

function TaskForm({ addTask }) {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [priority, setPriority] = useState('Low');
  const [dueDate, setDueDate] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    const newTask = { id: Date.now(), title, description, priority, dueDate, completed: false };
    addTask(newTask);
    navigate('/');
  };

  return (
    <form onSubmit={handleSubmit} className="form-group">
      <h3>Add Task</h3>
      <input 
        className="form-control mb-2"
        value={title} 
        onChange={(e) => setTitle(e.target.value)} 
        placeholder="Title" 
        required
      />
      <textarea 
        className="form-control mb-2"
        value={description} 
        onChange={(e) => setDescription(e.target.value)} 
        placeholder="Description" 
        required
      />
      <select 
        className="form-control mb-2"
        value={priority} 
        onChange={(e) => setPriority(e.target.value)} 
      >
        <option>Low</option>
        <option>Medium</option>
        <option>High</option>
      </select>
      <input 
        className="form-control mb-2" 
        type="date" 
        value={dueDate} 
        onChange={(e) => setDueDate(e.target.value)} 
        required 
      />
      <button type="submit" className="btn btn-success">Add Task</button>
    </form>
  );
}

export default TaskForm;
