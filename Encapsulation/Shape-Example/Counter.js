const createCounter = () => {
  // private let
  let fingersCount = 0;
  return ({
    // Incapsulate logic also closure
    click: () => fingersCount += 1,
    getCount: () => fingersCount.toLocaleString()
  });
};
const fingersCounter = createCounter();
fingersCounter.click();
fingersCounter.click();
fingersCounter.click();
fingersCounter.click();
fingersCounter.click();

console.log(
  fingersCounter.getCount()
);

// When you move your finger it's really hard algorithm process with many "neuron logic code" but for you it's EASY