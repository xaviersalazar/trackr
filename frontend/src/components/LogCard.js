import { useEffect, useState } from "react";

const LogCard = () => {
  const [logData, setLogData] = useState(null);
  useEffect(() => {
    getLatestLog();
  }, []);

  const getLatestLog = async () => {
    const response = await fetch("http://localhost:8080/logs/latest");
    setLogData(await response.json());
  };
  return (
    <div className="card container-sm">
      <div className="card-body">
        <h5 className="card-title">Latest Log</h5>
        {logData && (
          <>
            <p className="card-text">Date: {logData.timestamp}</p>
            {logData.exercises.map((ex) => (
              <p key={ex.id}>
                {ex.workoutName.name}: {ex.numOfSets} x {ex.numOfReps}
              </p>
            ))}
          </>
        )}
      </div>
    </div>
  );
};

export default LogCard;
