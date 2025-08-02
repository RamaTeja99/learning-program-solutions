import React from 'react';

const officeImageUrl = 'https://imgs.search.brave.com/KkMhj19UKECx4R6bjcAs-82ToI1dZtO5uNMiNHKorxE/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5nZXR0eWltYWdl/cy5jb20vaWQvODgx/MDYzMzI2L3Bob3Rv/L3BsYWNlLW9mLXdv/cmsuanBnP3M9NjEy/eDYxMiZ3PTAmaz0y/MCZjPXNLQUhTQVE4/YUNULWpEVDlHS2sw/anBVRi0xWXc3VXdM/MmUzTlRYdTNyUUk9';

const office = {
  name: 'Downtown Business Center',
  rent: 75000,
  address: '123 Main St, Metropolis'
};

const officeSpaces = [
  { id: 1, name: 'Executive Suite', rent: 80000, address: '1st Avenue, Metro' },
  { id: 2, name: 'Small Cubicle', rent: 45000, address: '2nd Avenue, Metro' },
  { id: 3, name: 'Open Workspace', rent: 60000, address: '3rd Avenue, Metro' },
  { id: 4, name: 'Corner Office', rent: 95000, address: '4th Avenue, Metro' }
];

const App = () => {
  const rentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Office Space Rental</h1>
      <img src={officeImageUrl} alt="Office Space" width="300" height="200" style={{ marginBottom: '20px' }} />
      <div style={{ marginBottom: '30px' }}>
        <h2>{office.name}</h2>
        <p>
          Rent: <span style={rentStyle(office.rent)}>₹{office.rent.toLocaleString()}</span>
        </p>
        <p>Address: {office.address}</p>
      </div>
      <h2>Available Office Spaces</h2>
      <ul>
        {officeSpaces.map(({ id, name, rent, address }) => (
          <li key={id} style={{ marginBottom: '15px' }}>
            <strong>{name}</strong><br />
            Rent: <span style={rentStyle(rent)}>₹{rent.toLocaleString()}</span><br />
            Address: {address}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default App;
