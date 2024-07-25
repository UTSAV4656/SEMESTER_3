const http = require('http');

const server = http.createServer((req,res)=>{
    res.end('HELLO WORLD > MY FIRST SERVER');
});

server.listen(3004,()=>{
    console.log('Server is running on port 3004');
})