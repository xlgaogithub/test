/* From You Don't Know JS (https://learning.oreilly.com/library/view/you-dont-know/9781491905241/ch02.html#idm45967374462648) */


var defaults = {
    options: {
        remove: true,
        enable: false,
        instance: {}
    },
    log: {
        warn: true,
        error: true
    }
};

var config = {
    options: {
        remove: false,
        instance: null
    }
};

config.options = config.options || {};

config.log = config.log || {};

// GY note: the code below does NOT compile in VS Code (with ES 6 enabled)

// {
//     options: {
//         remove: config.options.remove = defaults.options.remove,
//             enable: config.options.enable = defaults.options.enable,
//                 instance: config.options.instance = defaults.options.instance
//     } = { },
//     log: {
//         warn: config.log.warn = defaults.log.warn,
//             error: config.log.error = defaults.log.error
//     } = { }
// } = config; 