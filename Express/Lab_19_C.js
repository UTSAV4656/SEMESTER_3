const fs = require('fs');
const express = require('express');
const app = express();

app.use('/', (req, res) => {
    fs.readFile('Lab_19_A.js', (err, data) => {
        if (err) throw err;
        res.send(data.toString());
    });
});

app.listen(7000 , ()=>{
    console.log('Server is running on port 7000');
});