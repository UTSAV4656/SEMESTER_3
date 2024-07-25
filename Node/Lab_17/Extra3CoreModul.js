//-------------url core module-------------

// const url = require('url');
// const add = 'https://nodejs.org/docs/latest/api/child_process.html#child_processexeccommand-options-callback'
// const q = url.parse(add,true);

// console.log(q.host);
// console.log(q.pathname);
// console.log(q.search);

//-------------os core module-------------

// const os = require('node:os');

// const freeMemory = os.freemem();
// const totalMemory = os.totalmem();
// const cpu = os.cpus();
// console.log(freeMemory);
// console.log(totalMemory);
// console.log(cpu);

//-------------net core module-------------
const net = require('node:net');
const blockList = new net.BlockList();
blockList.addAddress('123.123.123.123');
blockList.addRange('10.0.0.1', '10.0.0.10');
blockList.addSubnet('8592:757c:efae:4e45::', 64, 'ipv6');

console.log(blockList.check('123.123.123.123'));
console.log(blockList.check('10.0.0.3'));
console.log(blockList.check('222.111.111.222'));
