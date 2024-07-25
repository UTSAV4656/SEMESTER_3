const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req, res) => {
    let filePath = '.' + req.url + '.html';
    
    if (filePath === './.html') {
        filePath = './index1.html';
    }

    fs.readFile(filePath, (err, content) => {
        if (err) {

            res.writeHead(404);
            res.end('404 File Not Found');
        } else {
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(content);
        }
    });
});

const PORT = process.env.PORT || 3000;
server.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
