define([
    'jquery',
    'underscore',
    'backbone',
    'models/Payment'
], function($, _, Backbone, Payment) {
    var PaymentList = Backbone.Collection.extend({
        url: '/payments',
        model: Payment
    });

    return PaymentList;
});