import React from "react";

const flightData = [
  { id: 1, from: "Delhi", to: "Mumbai", time: "09:30", price: 7500 },
  { id: 2, from: "Bangalore", to: "Chennai", time: "13:50", price: 5400 },
  { id: 3, from: "Kolkata", to: "Hyderabad", time: "17:20", price: 8100 }
];

const FlightList = ({ showBookButton, handleBook }) => (
  <div>
    <h2>Flights Available</h2>
    <table border="1" cellPadding={8}>
      <thead>
        <tr>
          <th>From</th>
          <th>To</th>
          <th>Departure</th>
          <th>Price (₹)</th>
          {showBookButton && <th>Action</th>}
        </tr>
      </thead>
      <tbody>
        {flightData.map(flight => (
          <tr key={flight.id}>
            <td>{flight.from}</td>
            <td>{flight.to}</td>
            <td>{flight.time}</td>
            <td>{flight.price}</td>
            {showBookButton && (
              <td>
                <button onClick={() => handleBook(flight)}>Book</button>
              </td>
            )}
          </tr>
        ))}
      </tbody>
    </table>
  </div>
);

export default FlightList;
