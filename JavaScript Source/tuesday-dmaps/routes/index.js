/**
 * Created by JiSoo on 2016-10-05.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
    //res.render('index', { title: 'Express6' });
    res.send('test');
});

module.exports = router;
