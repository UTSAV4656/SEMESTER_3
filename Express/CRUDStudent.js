const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded());
const student = [
    {
        Id:1,
        Name:'Utsav',
        Age:20,
        Email:'Utsav@gmail.com'
    },
    {
        Id:2,
        Name:'Boghani',
        Age:20,
        Email:'Boghani@gmail.com'
    }
]

app.get('/student',(req,res)=>{
    res.send(student);
});

app.get('/student/:Id',(req,res)=>{
    const ans = student.findIndex((stu)=>{
        if(stu.Id == req.params.Id){
            return true;
        }
    })
    res.send(student[ans]);
});

app.post('/Enter',(req,res)=>{
    student.push(req.body);
    res.send('Student Added');
});

app.patch('/student/:Id',(req,res)=>{
    const indexToEdit = student.findIndex((stu)=>{
        if(stu.Id == req.params.Id){
            return true;
        }
    });
    student[indexToEdit] = req.body;
    res.send("student Edited");
});

app.delete('/student/:Id',(req,res)=>{
    const indexToDelete = student.findIndex((stu)=>{
        if(stu.Id == req.params.Id){
            return true;
        }
    });
    student.splice(indexToDelete,1)
    res.send("student Deleted");
});


app.listen(7000,()=>{
    console.log('Server is running on port 7000');
})