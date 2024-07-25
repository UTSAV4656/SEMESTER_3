const path = require('node:path');

console.log("Normalize : "+path.normalize('./abc/../asd/../game'));
 
console.log("Basename : "+path.basename('C:\\temp\\myfile.html'));

console.log("Join : "+path.join('/abc', 'efg', 'hij/asdf', 'lks', '..'));

console.log("Relative : "+path.relative('C:\\abc\\test\\aaa', 'C:\\abc\\impl\\bbb'));

console.log("Dirname : "+path.dirname('C:/abc/test/aaa/bbb/ccc/ddd.txt'));

console.log("Resolve : "+path.resolve('/foo/bar', '/tmp/file/'));

console.log("Basename : "+path.basename('/foo/bar/baz/asdf/quux.html'));

console.log("Extname : "+path.extname('index.html'))