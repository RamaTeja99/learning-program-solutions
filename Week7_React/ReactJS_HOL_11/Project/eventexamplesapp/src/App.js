import React, { useState } from "react";
const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);
  const conversionRate = 0.012;

  const handleInputChange = (event) => {
    setRupees(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    const rupeesNumber = parseFloat(rupees);

    if (!isNaN(rupeesNumber)) {
      const convertedValue = (rupeesNumber * conversionRate).toFixed(2);
      setEuros(convertedValue);
      alert(`₹${rupeesNumber} = €${convertedValue}`);
    } else {
      setEuros(null);
      alert("Please enter a valid number");
    }
  };

  return (
    <div style={{ marginTop: 30 }}>
      <h2>Currency Convertor (INR to Euro)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={handleInputChange}
        />
        <button type="submit" style={{ marginLeft: 10 }}>
          Convert
        </button>
      </form>
      {euros !== null && <p>Converted: €{euros}</p>}
    </div>
  );
};

const App = () => {
  const [counter, setCounter] = useState(0);
  const incrementCounter = () => {
    setCounter(prev => prev + 1);
  };
  const sayHello = () => {
    alert('Hello! Button clicked.');
  };
  const handleIncreaseClick = () => {
    incrementCounter();
    sayHello();
  };
  const sayWelcome = (welcomeMsg) => {
    alert(welcomeMsg);
  };
  const handleOnPress = () => {
    alert("I was clicked");
  };
  const decrementCounter = () => {
    setCounter(prev => prev - 1);
  };

  return (
    <div style={{ padding: 20, fontFamily: "Arial" }}>
      <h1>React Event Examples</h1>

      <div>
        <h2>Counter: {counter}</h2>
        <button onClick={handleIncreaseClick} style={{ marginRight: 10 }}>
          Increment
        </button>
        <button onClick={decrementCounter} style={{ marginRight: 10 }}>
          Decrement
        </button>
      </div>

      <div style={{ marginTop: 20 }}>
        <button
          onClick={() => sayWelcome("Welcome!")}
          style={{ marginRight: 10 }}
        >
          Say Welcome
        </button>
        <button onClick={handleOnPress}>
          Click on me
        </button>
      </div>

      <CurrencyConvertor />
    </div>
  );
};

export default App;
