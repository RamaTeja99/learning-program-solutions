import React from "react";

const players = [
  "Rohit Sharma",
  "Shikhar Dhawan",
  "Virat Kohli",
  "KL Rahul",
  "Hardik Pandya",
  "Jasprit Bumrah",
  "Ravindra Jadeja",
  "Mohammed Shami",
  "Cheteshwar Pujara",
  "Ajinkya Rahane",
  "Rishabh Pant"
];

const T20players = ["KL Rahul", "Hardik Pandya", "Jasprit Bumrah"];
const RanjiTrophyPlayers = ["Cheteshwar Pujara", "Ajinkya Rahane", "Rishabh Pant"];

const IndianPlayers = () => {
  const oddPlayers = players.filter((_, i) => i % 2 !== 0);
  const evenPlayers = players.filter((_, i) => i % 2 === 0);
  const [firstPlayer, secondPlayer, ...restPlayers] = players;
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team Players:</h3>
      <p>{oddPlayers.join(", ")}</p>

      <h3>Even Team Players:</h3>
      <p>{evenPlayers.join(", ")}</p>

      <h4>Destructuring Example:</h4>
      <p>First Player: {firstPlayer}</p>
      <p>Second Player: {secondPlayer}</p>
      <p>Remaining Players: {restPlayers.join(", ")}</p>

      <h4>Merged T20 and Ranji Trophy Players:</h4>
      <p>{mergedPlayers.join(", ")}</p>
    </div>
  );
};

export default IndianPlayers;
