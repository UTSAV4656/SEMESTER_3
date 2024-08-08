const express = require('express');
const app = express();

const Demo = (req,res,next)=>{
    console.log('Demo middleware');
    next();
}

app.use('/index',Demo);

app.get('/index',(req,res)=>{
    res.send('Hello World');
});
    
app.listen(7000 , ()=>{
    console.log('Server is running on port 7000');
});