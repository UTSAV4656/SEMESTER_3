const express = require('express');
const app = express();

app.get('/home',(req,res)=>{
    res.send('Home Page');
});
app.get('/about',(req,res)=>{
    res.send('About Page');
});
app.get('/contact',(req,res)=>{
    res.send('Contact Page');
});
app.get('/blog',(req,res)=>{
    res.send('Blog Page');
});
app.get('/download',(req,res)=>{
    res.send('Download Page');
});

app.listen(7000 , ()=>{
    console.log('Server is running on port 7000');
});