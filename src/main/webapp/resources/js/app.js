var Payment = Backbone.Model.extend({
    urlRoot: '/payments'
});

var PaymentView = Backbone.View.extend({
    tagName: 'tr',
    template: _.template(
        '<td><%= date %></td>'+
        '<td><%= name %></td>'+
        '<td><%= checkNumber %></td>'+
        '<td><%= amount %></td>'
    ),
    render: function() {
        var attributes = this.template(this.model.toJSON());
        this.$el.html(attributes);
        return this;
    }
});

var PaymentList = Backbone.Collection.extend({
    url: '/payments',
    model: Payment
});

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

var PaymentApp = new (Backbone.Router.extend({
    routes: {"": "index"},

    initialize: function() {
        this.paymentList = new PaymentList();
        this.paymentsView = new PaymentListView({ collection: this.paymentList});
        $('payment-table').html(this.paymentsView.el);
    },
    index: function() {
        this.paymentList.fetch();
    },
    start: function() {
        Backbone.history.start({pushState: true});
    }
}));

$(document).ready(function() {
    PaymentApp.start();
});