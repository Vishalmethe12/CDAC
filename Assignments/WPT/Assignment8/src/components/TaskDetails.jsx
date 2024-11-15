import React, { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';

function TaskDetails({ tasks, updateTask, deleteTask }) {
  const { id } = useParams();
  const navigate = useNavigate();
  const task = tasks.find(task => task.id === parseInt(id));

  const [formData, setFormData] = useState({
    title: '',
    description: '',
    priority: 'Low',
    dueDate: '',
  });

  useEffect(() => {
    if (!task) {
      navigate('/');
    } else {
      setFormData({
        title: task.title,
        description: task.description,
        priority: task.priority,
        dueDate: task.dueDate,
      });
    }
  }, [task, navigate]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    updateTask({ ...task, ...formData });
    navigate('/');
  };

  const handleDelete = () => {
    deleteTask(task.id);
    navigate('/');
  };

  if (!task) return <p>Loading...</p>;

  return (
    <form onSubmit={handleSubmit} className="form-group">
      <h3>Edit Task</h3>
      <input
        className="form-control mb-2"
        name="title"
        value={formData.title}
        onChange={handleChange}
        placeholder="Title"
        required
      />
      <textarea
        className="form-control mb-2"
        name="description"
        value={formData.description}
        onChange={handleChange}
        placeholder="Description"
        required
      />
      <select
        className="form-control mb-2"
        name="priority"
        value={formData.priority}
        onChange={handleChange}
      >
        <option>Low</option>
        <option>Medium</option>
        <option>High</option>
      </select>
      <input
        className="form-control mb-2"
        type="date"
        name="dueDate"
        value={formData.dueDate}
        onChange={handleChange}
        required
      />
      <button type="submit" className="btn btn-primary">Update Task</button>
      <button type="button" className="btn btn-danger ml-2" onClick={handleDelete}>Delete Task</button>
    </form>
  );
}

export default TaskDetails;
