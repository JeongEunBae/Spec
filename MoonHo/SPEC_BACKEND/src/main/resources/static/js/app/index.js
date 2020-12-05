var main = {
    init : function() {
        var _this = this;
        $('#btn-save').on('click', function() {
            _this.save();
        });
    },
    save : function() {
        var data = {
            actID: $('#actID').val(),
            actName: $('#actName').val(),
            organizerPlan: $('o#rganizerPlan').val(),
            organizerManager: $('#organizerManager').val(),
            tag: $('#tag').val(),
            startPeriod: $('#startPeriod').val(),
            endPeriod: $('#endPeriod').val(),
            contents: $('#contents').val(),
            price: $('#price').val(),
            poster: $('#poster').val(),
            file: $('#file').val(),
            manager: $('#manager').val(),
            page: $('page').val(),
            phone_number: $('phone_number').val(),
            max_people: $('max_people').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/activities',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function(error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();