var SplurgeIpc = function() {};

SplurgeIpc.send = function(options, onsucess, onfail) {
    var ipc = (typeof options === 'string' || options instanceof String) ? [options] : options;
    cordova.exec(onsucess, onfail, "SplurgeIpc", "send", ipc);
};

module.exports = SplurgeIpc;