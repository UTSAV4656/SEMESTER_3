const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded());
const laptop = [
    { id: 1, 
      name: 'Laptop1',
      price: 1000 
    },
    { id: 2,
      name: 'Laptop2',
      price: 2000
    },
]

app.get('/laptop',(req,res)=>{
    res.send(laptop);
});

app.get('/laptop/:id',(req,res)=>{
    const ans = laptop.findIndex((stu)=>{
        if(stu.id == req.params.id){
            return true;
        }
    })
    res.send(laptop[ans]);
});

app.post('/laptop',(req,res)=>{
    laptop.push(req.body);
    res.send('laptop Added');
});

app.patch('/laptop/:id',(req,res)=>{
    const indexToEdit = laptop.findIndex((stu)=>{
        if(stu.id == req.params.id){
            return true;
        }
    });
    laptop[indexToEdit] = req.body;
    res.send("laptop Edited");
});

app.delete('/laptop/:id',(req,res)=>{
    const indexToDelete = laptop.findIndex((stu)=>{
        if(stu.id == req.params.id){
            return true;
        }
    });
    laptop.splice(indexToDelete,1)
    res.send("laptop Deleted");
});


app.listen(7000,()=>{
    console.log('Server is running on port 7000');
})