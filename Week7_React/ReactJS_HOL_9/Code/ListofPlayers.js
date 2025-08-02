import React from "react";

const players = [
  { name: "Sachin Tendulkar", score: 90 },
  { name: "MS Dhoni", score: 65 },
  { name: "Virat Kohli", score: 84 },
  { name: "Rohit Sharma", score: 72 },
  { name: "Jasprit Bumrah", score: 45 },
  { name: "Hardik Pandya", score: 55 },
  { name: "KL Rahul", score: 68 },
  { name: "Shikhar Dhawan", score: 75 },
  { name: "Ravindra Jadeja", score: 80 },
  { name: "Yuzvendra Chahal", score: 33 },
  { name: "Bhuvneshwar Kumar", score: 50 }
];

const ListofPlayers = () => {
  const filteredPlayers = players.filter((player) => player.score <= 70);

  return (
    <div>
      <h2>List of Players</h2>
      {players.map((player)=>(
        <div key={player.name} style={{ marginBottom: "8px" }}>
           <strong>{player.name}</strong>: {player.score} 
        </div>
      ))}

      <h2>List of Players having Scores Less than 70</h2>
      {filteredPlayers.map((player) => (
        <div key={player.name} style={{ marginBottom: "8px" }}>
          <strong>{player.name}</strong>: {player.score} 
        </div>
      ))}
    </div>
  );
};

export default ListofPlayers;
