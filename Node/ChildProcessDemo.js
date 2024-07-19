const child_process = require('node:child_process');

child_process.exec("Demo.java" , (err,stdout,stdin)=>{
    if(err){
    console.log(err);
    }
    console.log(stdout);
});