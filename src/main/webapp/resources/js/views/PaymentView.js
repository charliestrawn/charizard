define([
    'jquery',
    'underscore',
    'backbone'
], function($, _, Backbone) {

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

    return PaymentView;
});
