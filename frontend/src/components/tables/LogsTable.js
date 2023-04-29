import { useEffect, useState } from "react";

const LogsTable = () => {
  const [logs, setLogs] = useState([]);

  useEffect(() => {
    getAllLogs();
  }, []);

  const getAllLogs = async () => {
    const response = await fetch("http://localhost:8080/logs");

    setLogs(await response.json());
  };

  return (
    <table className="table table-striped">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Date Logged</th>
        </tr>
      </thead>
      {logs.length > 0 ? (
        <tbody>
          {logs.map((log, index) => (
            <tr key={log.id}>
              <th scope="row">{index + 1}</th>
              <td>{log.timestamp}</td>
            </tr>
          ))}
        </tbody>
      ) : (
        <h6>No data available</h6>
      )}
    </table>
  );
};

export default LogsTable;
