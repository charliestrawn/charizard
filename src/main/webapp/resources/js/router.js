define([
    'jquery',
    'underscore',
    'backbone',
    'collections/PaymentList',
    'views/PaymentListView'
], function($, _, Backbone, PaymentList, PaymentListView){

    var AppRouter = Backbone.Router.extend({
        routes: {"": "index"}
    });

    var initialize = function() {
        var paymentList = new PaymentList();
        var paymentsView = new PaymentListView({ collection: paymentList});

        $('payment-table').html(paymentsView.el);

        var app_router = new AppRouter();

        app_router.on('route:index', function(){
           paymentList.fetch();
        });

        Backbone.history.start({pushState: true});
    }

    return {
        initialize: initialize
    };
});