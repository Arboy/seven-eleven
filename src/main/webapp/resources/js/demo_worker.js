function appendDiv() {
    for(var i=0;i<10;i++) {
        self.postMessage('<div id="conversation">'+ i +' User conversations says: ' + i + '</div>');
    }
    setTimeout("appendDiv()",500);
}

appendDiv();