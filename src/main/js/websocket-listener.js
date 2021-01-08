'use strict';

const SockJS = require('sockjs-client');
require('stompjs');
const socket = SockJS('/payroll');
const stompClient = Stomp.over(socket);

function register(registrations) {
    stompClient.connect({}, function(frame) {
        registrations.forEach(function (registration) {
            stompClient.subscribe(registration.route, registration.callback);
        });
    });
}

function send (message) {
    stompClient.send("/topic/updateAction", {}, JSON.stringify(message));
}

module.exports.register = register;
module.exports.send = send;