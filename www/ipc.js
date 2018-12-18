var SplurgeIpc = function() {};

SplurgeIpc.send = function(setting, onsucess, onfail) {
    var ipc = (typeof setting === 'string' || setting instanceof String) ? [setting] : setting;
    cordova.exec(onsucess, onfail, "SplurgeIpc", "send", settings);
};

module.exports = SplurgeIpc;