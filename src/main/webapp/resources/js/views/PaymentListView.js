define([
    'jquery',
    'underscore',
    'backbone',
    'views/PaymentView',
    'collections/PaymentList'
], function($, _, Backbone, PaymentView) {

    var PaymentListView = Backbone.View.extend({
        el: 'tbody',
        initialize: function() {
            this.collection.on('add', this.addOne, this);
            this.collection.on('fetch', this.addAll, this);
        },
        addOne: function(payment) {
            var paymentView = new PaymentView({model: payment});
            this.$el.append(paymentView.render().el);
        },
        addAll: function() {
            this.collection.forEach(this.addOne, this);
        },
        render: function() {
            this.addAll();
        }
    });

    return PaymentListView;
});