import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Navbar from './components/NavBar';
import TaskList from './components/TaskList';
import TaskForm from './components/TaskForm';
import TaskDetails from './components/TaskDetails';

function App() {
  return (
    <BrowserRouter>
      <Navbar />  
      <div className="container mt-4">
        <Routes>
          <Route path="/" element={<TaskList />} />
          <Route path="/add-task" element={<TaskForm />} />
          <Route path="/task/:id" element={<TaskDetails />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
