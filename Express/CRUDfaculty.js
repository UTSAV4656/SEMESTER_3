const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded());
const faculty = [
    { id: 1, name: 'John', age: 30 },
    { id: 2, name: 'Jane', age: 25 },
    { id: 3, name: 'Bob', age: 40 }
]

app.get('/faculty',(req,res)=>{
    res.send(faculty);
});

app.get('/faculty/:Id',(req,res)=>{
    const ans = faculty.findIndex((fac)=>{
        if(fac.Id == req.params.Id){
            return true;
        }
    })
    res.send(faculty[ans]);
});

app.post('/Enter',(req,res)=>{
    faculty.push(req.body);
    res.send('faculty Added');
});

app.patch('/faculty/:Id',(req,res)=>{
    const indexToEdit = faculty.findIndex((fac)=>{
        if(fac.Id == req.params.Id){
            return true;
        }
    });
    faculty[indexToEdit] = req.body;
    res.send("faculty Edited");
});

app.delete('/faculty/:Id',(req,res)=>{
    const indexToDelete = faculty.findIndex((fac)=>{
        if(fac.Id == req.params.Id){
            return true;
        }
    });
    faculty.splice(indexToDelete,1)
    res.send("faculty Deleted");
});


app.listen(7000,()=>{
    console.log('Server is running on port 7000');
})